public class Main {
    public static void main(String[] args) {
        System.out.println(check("111111111111111111111111", "123", "123"));
        System.out.println(check("111111а1", "1235", "123"));
        System.out.println(check("111111111111111", "123й", "123"));
        System.out.println(check("2ss2", "123", "123"));
    }

    static boolean check(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20)  {
            throw new WrongLoginException("invalid login length");
            }
            if (!isLettersAndNumbers(login))  {
            throw new WrongLoginException("invalid characters are used in login");
            }
            if (password.length() > 20 || confirmPassword.length() > 20)  {
                throw new WrongPasswordException("invalid password length");
            }
            if (!isLettersAndNumbers(password) || !isLettersAndNumbers(confirmPassword))  {
                throw new WrongPasswordException("invalid characters are used in password");
            }
            if (!password.equals(confirmPassword))  {
                throw new WrongPasswordException("Passwords do not match");
            }
        } catch (WrongLoginException e) {
            System.out.println("Перехваченное исключение." + e);
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Перехваченное исключение." + e);
            return false;
        }
        return true;
    }


    static boolean isLettersAndNumbers(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && (str.charAt(i) != '_') && !(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') &&
                    !(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                return false;
            }
        }
        return true;
    }
}
