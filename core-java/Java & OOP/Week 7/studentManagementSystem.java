                    // HandWritten Code //

import java.util.*;
class BCA {
    ArrayList<String> Students = new ArrayList<>();
    void addStudent(String name) {
        Students.add(name);
    }
    void removeStudent(String name) {
        Students.remove(name);
        marks.remove(name);
    }

    HashSet<String> Course = new HashSet<>();
    void addCourse(String name) {
        Course.add(name);
    }

    HashMap<String, Integer> marks = new HashMap<>();
    void addMarks(String name, int mark) {
        marks.put(name, mark);
    }
}

public class studentManagementSystem {
    public static void main(String[] args) {
        BCA s1 = new BCA();
        s1.addStudent("Rishi");
        s1.addStudent("Vishu");
        s1.addStudent("Sujal");
        s1.addStudent("Anmol");

        s1.addCourse("Java");
        s1.addCourse("PHP");
        s1.addCourse("Cpp");
        s1.addCourse("Python");

        s1.addMarks("Rishi", 98);
        s1.addMarks("Vishu", 86);
        s1.addMarks("Sujal", 60);
        s1.addMarks("Anmol", 48);
        s1.removeStudent("Anmol");

        System.out.println(s1.Students);
        System.out.println(s1.Course);
        System.out.println(s1.marks);
    }
}



                       // Improved Versiom //
/*       
import java.util.*;

class BCA {

    private ArrayList<String> students = new ArrayList<>();
    private HashSet<String> courses = new HashSet<>();
    private HashMap<String, Integer> marks = new HashMap<>();

    // Add student
    void addStudent(String name) {
        students.add(name);
    }

    // Remove student
    void removeStudent(String name) {
        students.remove(name);
        marks.remove(name);
    }

    // Add course
    void addCourse(String courseName) {
        courses.add(courseName);
    }

    // Add marks
    void addMarks(String name, int mark) {
        marks.put(name, mark);
    }

    // Get marks
    void getMarks(String name) {
        if (marks.containsKey(name)) {
            System.out.println(name + " marks: " + marks.get(name));
        } else {
            System.out.println("Student not found");
        }
    }

    // Display all data
    void display() {
        System.out.println("Students: " + students);
        System.out.println("Courses: " + courses);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        BCA s1 = new BCA();

        s1.addStudent("Rishi");
        s1.addStudent("Vishu");
        s1.addStudent("Sujal");
        s1.addStudent("Anmol");

        s1.addCourse("Java");
        s1.addCourse("PHP");
        s1.addCourse("Cpp");
        s1.addCourse("Python");

        s1.addMarks("Rishi", 98);
        s1.addMarks("Vishu", 86);
        s1.addMarks("Sujal", 60);
        s1.addMarks("Anmol", 48);

        s1.removeStudent("Anmol");
        s1.getMarks("Rishi");

        s1.display();
    }
}

*/
