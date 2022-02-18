// This is a menu driven program for performing various operations in Stack DS
import java.util.Scanner;

class StackbyArray {
    int arr[];
    int topofstack;
    public StackbyArray(int size)
    {
        arr = new int[size];
        topofstack=-1;
    }

    public void push(Scanner sc)
    {
        if(topofstack == arr.length-1)
        {
            System.out.println("The stack is full -  Stack Overflow error");
        }
        else{
            System.out.println("Enter the value that you want to push: ");
            int value = sc.nextInt();
            arr[topofstack+1] = value;
            topofstack++;
            System.out.println("Required value is inserted successfully");

        }
    }
    public void pop(){
        if(topofstack == -1)
        {
            System.out.println("Stack underflow error");
        }
        else
        {
            System.out.println();
            System.out.println(arr[topofstack]+ " is popped successfully");
            System.out.println("The Top of Stack element is successfully popped");

            topofstack--;

        }

    }

    public void peek()
    {
        if(topofstack == -1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("The element at the Top of Stack is: ");
            System.out.println(arr[topofstack]);
        }
    }
    public void traverse()
    {
        System.out.println();
        System.out.println("Printing the elements of the Stack");
        System.out.println("==================================");
        for(int i=topofstack;i>-1;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
class StackbyArrayMain
{
    public static void main(String[] args) {
        StackbyArray obj = new StackbyArray(5);
        int choice = 0;
        Scanner sc = new Scanner(System.in);
//        choice = sc.nextInt();
        System.out.println("Stack operations using array\n");
        System.out.println("===============================");
        while(choice != 5)
        {
            System.out.println("\nChoose one operation from the options given below:\n");
            System.out.println("\n1.Push\n2.Pop\n3.peek(To show the top of Stack value)\n4.Display\n5.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    obj.push(sc);
                    break;
                }
                case 2:
                {
                    obj.pop();
                    break;
                }
                case 3:
                {
                    obj.peek();
                    break;
                }
                case 4:
                {
                    obj.traverse();
                    break;
                }
                case 5:
                {

                    System.out.println("\nThanks for your patience....");
                    System.out.println("Exiting..........");
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Please enter a valid choice");
                }
            };
        }


    }
}
