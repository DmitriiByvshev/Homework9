import java.util.List;


public class Student {

    String name;
    List<String> getAllCourses;


    public <T> Student(String name, List<String> asList) {
        this.name = name;
        this.getAllCourses = asList;
    }

}
