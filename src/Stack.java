import java.util.ArrayList;

public class Stack<T>
{
    ArrayList<T> data;
    int capacity;
    int topIndex;

    public Stack() // default constructor
    {
        capacity = 7;
        data = new ArrayList<>();
        topIndex = -1;
    }
    public Stack(int n) // Overloaded constructor
    {
        capacity = n;
        data = new ArrayList<>();
        topIndex = -1;
    }
    boolean isEmpty()
    {
        if(topIndex==-1)
            return true;
        else
            return false;
    }
    boolean isFull()
    {
        if(topIndex == capacity-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void push(T d)
    {
        if(isFull())
        {
            System.out.println("Error .. Stack is full");
        }
        else
        {
            data.add(d);
            topIndex++;
        }
    }
    void printStack()
    {
        for(int i=0; i<=topIndex; i++)
        {
            System.out.println(data.get(i));
        }
    }

    int size()
    {
        return topIndex+1;
    }

    T top()
    {
        return data.get(topIndex);
    }

    T pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return null;
        }
        else
        {
            int temp = topIndex;
            topIndex--;
            return data.get(temp);
        }
    }

}
