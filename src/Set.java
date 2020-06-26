public class Set {
    int []data;
    int size;
    int capacity;

    Set()  // default constructor of Set
    {
        size=0;
        capacity=0;
    }

    Set(int s)  // overloaded constructor of Set
    {
        capacity = s;
        size=0;
        data = new int[capacity];
    }

    void Add(int d)
    {
        int num = search(d);
        // if num is -1 then data is not present in set, num is not -1.
        if(num==-1 && !isFull())
        {
            data[size]=d;
            size++;
        }
    }

    boolean isFull()
    {
        if(size==capacity)
            return true;
        else
            return false;
    }

    boolean isEmpty()
    {
        if(size==0)
            return true;
        else
            return false;
    }


    int search(int d)
    {
        for(int i=0; i<size; i++)
        {
            if(data[i]==d)
                return i;
        }

        return -1;
    }

    void display()
    {
        for(int i=0; i<size; i++)
        {
            System.out.print(data[i]+",");
        }
        System.out.println("");
    }

    void sort()
    {
        for(int i = 0; i<size; i++)
        {
            for(int j=0; j<size-1; j++)
            {
                if(data[j]>data[j+1])
                {
                    int c;
                    c = data[j];
                    data[j] = data[j+1];
                    data[j+1] = c;
                }
            }
        }
    }

    void update(int oldData, int newData){
        int num = search(oldData);

        if(num!=-1)
        {
            int num1 = search(newData);
            if(num1==-1)
            {
                data[num] = newData;
            }
        }
    }

    void delete(int temp)
    {
        int num = search(temp);
        if(num==-1)
        {
            System.out.println("Number not found in set.");
        }
        else
        {
            for(int i=num; i<size-1; i++)
            {
                data[i] = data[i+1];
            }
            size--;
        }
    }
}
