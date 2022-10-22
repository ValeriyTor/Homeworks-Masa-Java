import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee Samsung = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        Samsung.name = scanner.nextLine();
        System.out.println("Enter salary");
        Samsung.salary = scanner.nextInt();
        System.out.println("Enter work hours per day");
        Samsung.workHours = scanner.nextInt();
        Employee.getInfo(Samsung);
        Samsung.AddSal();
        Samsung.AddWork();
        System.out.println("Final salary of " + Samsung.name + ": " + Samsung.salary);
    }
}
class Employee {
    String name;
    int salary;
    int workHours;
    static void getInfo(Employee employee ) {
        System.out.println("Salary of " + employee.name + " is " + employee.salary
                + " $ and his/her work hours per day is " + employee.workHours);
    }
    void AddSal() {
        if (salary < 500)
        {
            salary+=10;
            System.out.println("Correct salary is " + salary + " because his/her salary is less 500$");
        }
    }
    void AddWork() {
        if (workHours  > 6 )
        {
            salary+=5;
            System.out.println("Correct salary is " + salary + " because his/her work hours per day is more 6 hours.");
        }
    }
}