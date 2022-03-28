class A
{
    public static void main(String[] args) {
        B obj = new B(10);
        B obj2 = new B("Naman");
        B obj3 = new B('X');
        B obj4 = new B(10.664);
        B obj5 = new B(333.444);
        B head = obj;
        obj.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj5;
//        obj4.next = null;
        System.out.println("Original Linked List is: ");
        display(head);
        System.out.println(" Reverse Linked List is: ");
        head = reverse(head);
        display(head);
//        head = display(head);

    }
    static void display(B head)
    {
        B current = head;
        while(current != null)
        {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }
    static B reverse(B b)
    {
        B prev = null;
        B current = b;
        while(current != null)
        {
            B next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        b = prev;
        return b;
    }


}
class B<T>
{
    T data;
    B<T> next;
    public B(T data)
    {
        this.data = data;
    }
}
