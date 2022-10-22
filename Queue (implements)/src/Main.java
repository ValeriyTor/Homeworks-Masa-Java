import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Queue counter = new FIFO();
        System.out.println("Очередь: " + counter.isEmpty());
        counter.add(11);
        counter.add(12);
        counter.add(13);
        counter.add(14);
        System.out.println("Очередь: " + counter.isEmpty());
        System.out.println("Удален элемент: " + counter.remove());
        System.out.println("Удален элемент: " + counter.remove());
        System.out.println("Удален элемент: " + counter.remove());
        System.out.println("Удален элемент: " + counter.remove());
        System.out.println("Очередь: " + counter.isEmpty());
        counter.add(21);
        counter.add(22);
        counter.add(23);
        counter.add(24);
        counter.add(24);
        counter.add(23);
        counter.add(24);
        counter.add(24);
    }


}