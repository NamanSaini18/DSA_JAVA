package LinkedListQuestions;

public class TestMain {
    // Utility function to print a list with `down` and `next` pointers
    public static void printOriginalList(Node2 head)
    {
        if (head == null) {
            return;
        }

        System.out.print(" " + head.data + " ");

        if (head.down != null)
        {
            System.out.print("[");
            printOriginalList(head.down);
            System.out.print("]");
        }

        printOriginalList(head.next);
    }

    // Utility function to print the Flattened linked list
    public static void printFlattenedList(Node2 head)
    {
        while (head != null)
        {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
        System.out.println();
    }

    // Recursive function to flatten a multilevel linked list
    public static Node2 flattenList(Node2 head)
    {
        // base case
        if (head == null) {
            return null;
        }

        // keep track of the next pointer
        Node2 next = head.next;

        // process the down list first
        head.next = flattenList(head.down);

        // go to the last node
        Node2 tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // process the next list after the down list
        tail.next = flattenList(next);

        // return head node
        return head;
    }

    public static void main(String[] args)
    {

        Node2 one = new Node2(1);
        Node2 two = new Node2(2);
        Node2 three = new Node2(3);
        Node2 four = new Node2(4);
        Node2 five = new Node2(5);
        Node2 six = new Node2(6);
        Node2 seven = new Node2(7);
        Node2 eight = new Node2(8);
        Node2 nine = new Node2(9);
        Node2 ten = new Node2(10);
        Node2 eleven = new Node2(11);
        Node2 twelve = new Node2(12);
        Node2 thirteen = new Node2(13);
        Node2 fourteen = new Node2(14);
        Node2 fifteen = new Node2(15);

        // set head node
        Node2 head = one;

        // set next pointers
        one.next = four;
        four.next = fourteen;
        fourteen.next = fifteen;
        five.next = nine;
        nine.next = ten;
        seven.next = eight;
        eleven.next = thirteen;

        // set down pointers
        one.down = two;
        two.down = three;
        four.down = five;
        five.down = six;
        six.down = seven;
        ten.down = eleven;
        eleven.down = twelve;

        System.out.println("The original list is :");
        printOriginalList(head);

        head = flattenList(head);
        System.out.println("\n\nThe flattened list is :");
        printFlattenedList(head);
    }
}
class Node2
{
    int data;
    Node2 next;
    Node2 down;

    Node2(int data) {
        this.data = data;
    }
}
