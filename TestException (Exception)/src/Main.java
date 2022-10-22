public class Main {
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
            compute(30);
        } catch (MyException e) {
            System.out.println("Перехваченное исключение." + e);
        }
    }

    public static void compute(int a) throws MyException {
        System.out.println("Вызван метод compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a, "Some message");
        }
        System.out.println("Нормальное завершение.");
    }
}
