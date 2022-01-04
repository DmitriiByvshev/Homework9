import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main  (String[] args) {

        Course course1 = new Course("Math");
        Course course2 = new Course("Chemistry");
        Course course3 = new Course("History");
        Course course4 = new Course("English");
        Course course5 = new Course("Music");

        ArrayList<Course> courses = new ArrayList<>();

        Student student1 = new Student("John", Arrays.asList("Math", "Chemistry"));
        Student student2 = new Student("Peter", Arrays.asList("Math", "History"));
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

        List<String> result = students.stream()
                .distinct()
                .limit(3)
                .map((student) -> student.name)
                .collect(Collectors.toList());
        System.out.println(result);


  }

}
