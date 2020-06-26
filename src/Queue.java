import java.util.ArrayList;

public class Queue<T> {
    int capacity;
    int size;
    ArrayList<T> Q;

    public Queue()
    {
        capacity = 0;
        size = 0;
        Q = new ArrayList<>();
    }

    public Queue(int s)
    {
        capacity = s;
        size = 0;
        Q = new ArrayList<>();
    }

    int getSize()
    {
        return size;
    }

    int getCapacity()
    {
        return capacity;
    }

    void Enque(T data)
    {
        if(isFull())
        {
            System.out.println("Queue Capacity is Full");
        }
        else
        {
            Q.add(data);
            size++;
        }
    }

    boolean isFull()
    {
        if(capacity==size)
            return true;
        else
            return false;
    }

    void print()
    {
        for(int i=0; i<size; i++)
        {
            System.out.println(Q.get(i).toString());
        }
    }

    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty.");
        }
        else
        {
            Q.remove(0);
            size--;
        }
    }

    void dequeue(int n)
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty.");
        }
        else
        {
            if(n<size)
            {
                Q.remove(n);
                size--;
            }
            else
            {
                System.out.println("ERROR: Wrong index");
            }
        }
    }

    boolean isEmpty()
    {
        if(size==0)
            return true;
        else
            return false;
    }
}
