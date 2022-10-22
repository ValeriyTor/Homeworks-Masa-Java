public class Main {
    public static void main(String[] args) {
        student student1 = new student("Valerii","Torgovanov","Java", 4);
        student student2 = new student("Ivan","Ivanov","Java & C++", 5);
        student aspirant1 = new aspirant("Masha", "Kulikova", "Programmer", 5, "Python");
        student aspirant2 = new aspirant ("Sasha", "Semenov", "Programmer", 3.72, "Pascal");
        student [] students = {student1, student2, aspirant1, aspirant2};
        for (student count : students)
            System.out.println(count.lastName + " " + count.getScholarship());
    }
}
class student{
    String firstName = "";
    String lastName = "";
    String group = "";
    double averageMark = 0;
    public student(String firstName, String lastName, String group, double averageMark)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.group=group;
        this.averageMark=averageMark;
    }
    int getScholarship(){
        if (averageMark == 5)
            return 100;
        else return 80;
    }
}
class aspirant extends student{
    String scientificWork = "";
    public aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork)
    {
        super(firstName, lastName, group, averageMark);
        this.scientificWork=scientificWork;
    }
    @Override
    int getScholarship(){
        if (averageMark == 5)
            return 200;
        else return 180;
    }
}