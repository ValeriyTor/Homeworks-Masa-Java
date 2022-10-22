interface Queue
{
    void add(int el);
    boolean isEmpty();
    int remove();
}

class FIFO implements Queue
{
    int [] Array = {};
    private int count = 1;

    void createArray(int size)
    {
        Array= new int[size];
    }
    void setArray(int [] array)
    {
        for (int i=0; i < array.length ; i++)
        {
            Array[i]=array[i];
        }
    }

    public void add(int el)
    {
            int[] newArr = new int[Array.length];
            int j = 0;
            for (int i=0; i < Array.length ; i++)
            {
                if (Array[i] != 0)
            {
                newArr[j]=Array[i];
                j++;
            }
        }
        if (count == j + 1 )
        {
            createArray(2 * count );
            count = 2 * count;
        }
        setArray(newArr);
        Array[j] = el;
        for (int i=0; i < Array.length; i++)
        System.out.print( Array[i] + " ");
        System.out.println(". Длина: " + Array.length + " ");
    }


    public boolean isEmpty()
    {
        for (int i=0 ; i< Array.length; i++)
        {
            if(Array[i] != 0)
            {
                return true;
            }
        }
        return false;
    };

    public int remove()
    {
        int[] newArr = new int[Array.length];
        int element = Array[0];
        for (int i=0; i < Array.length-1 ; i++)
        {
            newArr[i]=Array[i+1];
        }
            createArray(newArr.length);
        setArray(newArr);
        for (int i=0; i < Array.length; i++)
            System.out.print( Array[i] + " ");
        return element;
    };

}
