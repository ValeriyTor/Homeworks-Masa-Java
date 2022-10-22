import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArray = new ArrayList<>();
        studentArray.add(new Student("Victor", "123", 1, 3.4));
        studentArray.add(new Student("Mark", "123", 1, 4.8));
        studentArray.add(new Student("Mark", "123", 2, 4.8));
        studentArray.add(new Student("Sara", "123", 1, 2.4));
        studentArray.add(new Student("Berg", "123", 2, 4.4));
        Student.printStudents(studentArray,1);
        Student.deleteStudent(studentArray);
        for(int i = 0; i<studentArray.size(); i++) {
            System.out.println(studentArray.get(i).name + " grade: " + studentArray.get(i).grade);
        }
        Student.printStudents(studentArray,1);
    }
}

