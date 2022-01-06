import java.util.List;


public class Student {

    String name;
    List<String> getAllCourses;


    public <T> Student(String name, List<String> getAllCourses) {
        this.name = name;
        this.getAllCourses = getAllCourses;
    }

}
