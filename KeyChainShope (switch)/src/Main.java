import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean temp = true;
        while (temp == true) {
            System.out.println("Ye Olde Keychain Shoppe");
            System.out.println("1. Add Keychain to Order");
            System.out.println("2. Remove Keychains from Order");
            System.out.println("3. View current Order");
            System.out.println("4. Checkout");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    add_keychains();
                    break;
                case 2:
                    remove_keychains();
                    break; //result = ;
                case 3:
                    view_order();
                    break; //result = ;
                case 4:
                    temp = checkout();
                    break;
                default:
                System.out.println("Check your number - you are wrong! \n");
                //    num = scanner.nextInt();
            }
            //System.out.println("Результат: " + result);
        }
    }


    public static void add_keychains() {
        System.out.println("ADD KEYCHAINS");
    }

    public static void remove_keychains() {
        System.out.println("KYECHAINS REMOVE" );
    }

    public static void view_order() {
        System.out.println("VIEW ORDER");
    }

    public static boolean checkout() {
        System.out.println("GOOD BYE");
        return false;
    }

}