import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp = 1;
        while (temp == 1) {
            System.out.println("Для выбора площадки фигуры введите ее номер");
            System.out.println("1. Треугольник");
            System.out.println("2. Прямоугольник");
            System.out.println("3. Квадрат");
            System.out.println("4. Круг");
            System.out.println("5. Выход");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    treangle();
                    break;
                case 2:
                    rectangle();
                    break; //result = ;
                case 3:
                    square();
                    break; //result = ;
                case 4:
                    ring();
                    break; //result = ;
                case 5:
                    temp = 2;
            }
            //System.out.println("Результат: " + result);
        }
    }


    public static void treangle() {
        float h = height();
        float b = side();
        float Treangle = h * b / 2;
        System.out.println("Результат: " + Treangle);;
    }

    public static void rectangle() {
        float a = side();
        float b = side();
        float Treangle = a * b;
        System.out.println("Результат: " + Treangle);;
    }

    public static void square() {
        float a = side();
        float b = side();
        float Treangle = a * b;
        System.out.println("Результат: " + Treangle);;
    }

    public static void ring() {
        float a = radius();
        //float b = (float)Math.PI;
        float Treangle = (float) Math.pow(a , 2) * (float)Math.PI;
        System.out.println("Результат: " + Treangle);;
    }


    // метода ввода строчки с проверкой
    public static float side() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону:");
        float b;
        if (scanner.hasNextFloat()) {
            b = scanner.nextFloat();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте ввести еще раз.");
            scanner.next();
            b = side();
        }
        return b;
    }

    // метода ввода высоты треугольника с проверкой
    public static float height() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту:");
        float b;
        if (scanner.hasNextFloat()) {
            b = scanner.nextFloat();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте ввести еще раз.");
            scanner.next();
            b = height();
        }
        return b;
    }

    public static float radius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус:");
        float b;
        if (scanner.hasNextFloat()) {
            b = scanner.nextFloat();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте ввести еще раз.");
            scanner.next();
            b = side();
        }
        return b;
    }

}