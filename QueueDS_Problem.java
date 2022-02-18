
class Node3{
    String data;
    Node3 next;
    Node3(String data){
        this.data = data;
    }
}
class QueuebyLinkedList{
    Node front;
    Node rear;
    Node newnode;
    public void enqueue(String data){
        Node3 newnode = new Node3(data);
    }
    public boolean isEmpty(){
        if(front == null && rear == null){
            front = rear = newnode;
        }
        else{
            rear.next = newnode;
        }
        return true;

    }
//    public void queueDisplay()
//    {
//        int i;
//        if (front == rear) {
//            System.out.println("Queue is Empty\n");
//            return;
//        }
//
//        // traverse front to rear and print elements
//        for (i=front;i<rear;i++) {
//            System.out.printf(" %d , ",queue[i]);
//        }
//        return;
//    }


}
public class TestQueue {
    public static void main(String[] args) {
        QueuebyLinkedList obj = new QueuebyLinkedList();
        String odd = "";
        String even = "";
        for(String str: args) {              //  Here we are taking the command line arguments

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(0) != 0) {
                    odd = odd + str.charAt(i);
                }
                else {
                    even = even + str.charAt(i);
                }

            }
//            System.out.println(odd+even);
        }
        obj.enqueue(odd+even);
//        System.out.println(obj);

    }
}
