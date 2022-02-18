class StackbyArray {
    int arr[];
    int topofstack;
    public StackbyArray(int size)
    {
        arr = new int[size];
        topofstack=-1;
    }

    public void push(int value)
    {
        if(topofstack == arr.length-1)
        {
            System.out.println("The stack is full -  Stack Overflow error");
        }
        else{
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
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
//        obj.push(60);
        obj.traverse();
        obj.peek();
        obj.pop();
        obj.traverse();

    }
}
