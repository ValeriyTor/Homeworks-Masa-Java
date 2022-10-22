import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car bmv = new Car();
        bmv.setMake("BMV");
        bmv.setYear(1991);
        bmv.setSpeed(230);
        System.out.println("Car: " + bmv.make + ". Year is " + bmv.year + ". speed is " + bmv.speed); // проверка вывода
        System.out.println("getter method getYear: " + bmv.getYear());
        System.out.println("getter method getMake: " + bmv.getMake());
        System.out.println("getter method getSpeed: " + bmv.getSpeed());
    }
}

class Car {
    int year;
    String make;
    double speed;
    void setMake (String car) {
        make = car;
        System.out.println("You enter car is " + make);
    }
    void setYear (int yr) {
        year = yr;
        System.out.println("You enter year of " + make + " is " + year);
    }

    void setSpeed (int speedcar) {
        speed = speedcar;
        System.out.println("You enter speed of " + make + " is " + speed);
    }

    int getYear () {
        return year;
    }
    String getMake () {
        return make;
    }
    double getSpeed () {
        return speed;
    }

}
