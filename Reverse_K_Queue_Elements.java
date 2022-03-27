import java.util.Stack;


public class ReverseQueueElementsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            queue.add(sc.nextInt());
        }
        ReverseQueue(queue,n,k);
    }

    public static void ReverseQueue(Queue<Integer> queue, int n, int k)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<k;i++)
        {
            st.push(queue.peek());
            queue.remove();
        }
        for(int i =0;i<k;i++)
        {
            queue.add(st.pop());
        }
        for(int i=0;i<n-k;i++)
        {
            queue.add(queue.remove());
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(queue.peek()+ " ");
            queue.remove();


        }
    }

}
