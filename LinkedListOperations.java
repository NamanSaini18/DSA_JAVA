public class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(50);

        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        traverse(head);
    }
    // Traversing the Linked List
    public static void traverse(Node head)
    {
        Node current = head;
        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
// Using Generics
/* class Node<T>{
    T data;
    Node next;
    Node(T data)
    {
        this.data = data;
    }
 */
