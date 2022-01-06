import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        Student student1 = new Student("John", Arrays.asList("Music", "Math"));
        Student student2 = new Student("Peter", Arrays.asList("Music", "English"));
        Student student3 = new Student("Antony", Arrays.asList("Music", "History", "English"));
        Student student4 = new Student("Usaama", Arrays.asList("Math"));
        Student student5 = new Student("Elena", Arrays.asList("Math", "History"));
        Student student6 = new Student("Phara", Arrays.asList("Music", "Math", "English"));

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        task1(students);
        task2(students);
        task3(students, "Math");


    }

    static void task1(ArrayList<Student> students) {
        System.out.println(students.stream().map(student -> student.getAllCourses).flatMap(List::stream).distinct().collect(Collectors.toList()));
    }

    static void task2(ArrayList<Student> students) {
        System.out.println(students.stream()
                .sorted(Comparator.comparing(student -> student.getAllCourses.size()))
                .limit(3)
                .map(student -> student.name)
                .collect(Collectors.toList()));
    }

    static void task3(ArrayList<Student> students, String courseFilter) {
                System.out.println(students.stream()
                .filter(student -> student.getAllCourses.contains(courseFilter))
                .map(student -> student.name)
                .collect(Collectors.toList()));
    }
}
