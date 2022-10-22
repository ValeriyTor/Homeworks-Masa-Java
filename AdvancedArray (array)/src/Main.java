import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdvancedArray array = new AdvancedArray();
        int[] test = {1,2,3,7,6,5,4};
        array.createArray(test.length);
        array.setArray(test);
        System.out.println("Lenght of array is " + array.size());
        array.add(99);
        // проверка что добавлен элемент
        for (int i=0; i<array.size; i++)
            System.out.println(i + " - " + array.Array[i]);
        // проверка новой длины массива
        System.out.println("Lenght of new array is " + array.size());
        array.remove(3);
        // проверка что элемент удален
        for (int i=0; i<array.size; i++)
            System.out.println(i + " - " + array.Array[i]);
        // проверка новой длины массива
        int count = 6;
        System.out.println("Position " + count + " is " + array.get(count));
        array.printArray();

    }
}

class AdvancedArray {
    int size;
    int [] Array;
    void createArray(int size) {
        System.out.println("You add array with " + size + " elements");
        Array= new int[size];
        System.out.println("All elements is 0");
    }
    void setArray(int [] array)
    {
        for (int i=0; i < array.length; i++)
        {
            Array[i]=array[i];
            // проверка массива, что он заполнился входной последовательностью
            System.out.println(i + " - " + Array[i]);
        }
    }
    int size()
    {
        return Array.length;
    }

    void add(int el) {
        int[] newArr = new int[Array.length+1];
        for (int i=0; i<Array.length ; i++)
            newArr[i]=Array[i];
        newArr[Array.length] = el;
        createArray(Array.length+1);
        setArray(newArr);
    }

    void remove(int index) {
        int[] newArr = new int[Array.length-1];
        for (int i=0; i < index ; i++)
            newArr[i]=Array[i];
        if (Array.length!=index)
        {
            for (int i=index+1; i < Array.length ; i++)
                newArr[i-1]=Array[i];
        }
        createArray(Array.length-1);
        setArray(newArr);
    }
    int get(int index)
    {
        if (index < Array.length)
            return Array[index];
        else
            return 0;
    }

    void printArray(){
        System.out.println("Final array:");
        for (int i=0; i < Array.length; i++)
        {
            System.out.print(Array[i] + " ");
        }
    }

}