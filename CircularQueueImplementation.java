class CircularQueueusingArray
{
    int arr[];
    int size;
    int start;
    int rear;
    CircularQueueusingArray(int size)
    {
        arr = new int[size];
        this.size = size;
        start = -1;
        rear = -1;
    }
    public boolean isEmpty()
    {
        if(rear == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isFull()
    {
        if(rear+1 == start)
        {
            return true;
        }
        else if((start == 0) && (rear+1 == size))
        {
            return true;
        }
        else{
            return false;
        }
    }
    public void enQueue(int value)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow condition");
        }
        else if(isEmpty())
        {
            start = 0;
            rear++;
            arr[start] = value;
        }
        else
        {
            if(rear+1 == size)
            {
                rear = 0;
            }
            else
            {
                rear++;
            }
            arr[rear] = value;
        }

    }

    public void deQueue()
    {
        if(isEmpty())
        {
            System.out.println("Stack underflow Condition");
        }
        else
        {
            System.out.println(arr[start] + " " + "is deQueued successfully");
            if(start == rear)
            {
                start=rear=-1;
            }
            else if(start == size-1)
            {
                start = 0;
            }
            else
            {
                start++;
            }
        }
    }

    public void traverse()
    {
        if(start == -1)
        {
            System.out.println("Queue is Empty");
            return ;
        }
        System.out.println("Elements in the Circular Queue are: ");
        if(rear >= start)
        {
            for(int i=start;i<=rear;i++)
            {
                System.out.println(arr[i]);
                System.out.println(" ");
            }
            System.out.println();
        }
        else
        {
            for(int i =start;i<size;i++)
            {
                System.out.println(arr[i]);
                System.out.println(" ");
            }
            for(int i=0;i<=rear;i++)
            {
                System.out.println(arr[i]);
                System.out.println(" ");
            }
            System.out.println();
        }
//        for(int i = start;i<=rear;i++)
//        {
//            System.out.println(arr[i]);
//        }
    }

}


public class CircularQueueUsingArrayMain {
    public static void main(String[] args) {
        CircularQueueusingArray obj = new CircularQueueusingArray(5);
        obj.enQueue(100);
        obj.enQueue(200);
        obj.enQueue(300);
        obj.enQueue(990);
        obj.enQueue(1000);
        obj.traverse();
        System.out.println("dequeue");
        obj.deQueue();
//        System.out.println("Elements after deleting an element are:");
        obj.deQueue();
        obj.traverse();
//        obj.traverse();
        obj.enQueue(888);
        obj.enQueue(777);
        obj.traverse();


    }
}
