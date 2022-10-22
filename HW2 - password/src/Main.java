import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits");
        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String tempStr = str.nextLine();
        if ( passwordLenght(tempStr) &&  lettersAndNumbers(tempStr) && twoNumber(tempStr))
            System.out.println("Password is valid: " + tempStr);
        else
            System.out.println("You make mistake in password");

    }
    static boolean passwordLenght(String str) {
        if (str.length() <= 10)
            return false;
        else return true;
    }
    static boolean lettersAndNumbers(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean twoNumber(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        if (count >= 2)
            return true;
        else return false;
    }


}