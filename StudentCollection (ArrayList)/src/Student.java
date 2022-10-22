import java.util.ArrayList;

public class Student {
    String name = "";
    String group = "";
    int course = 0;
    double grade = 0;

    Student(String name, String group, int course, double grade)
    {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    static void deleteStudent (ArrayList<Student> students)
    {
        for(Student student : students) {
            if(student.grade < 3)
                students.remove(student);
        }
    }

        static void printStudents (ArrayList<Student> students, int course)
    {
        System.out.println("На курсе: " + course);
        for(Student student : students) {
            if(student.course == course)
            {
                System.out.println(student.name);
            }
        }

    }



}
