import java.util.*;

class InvalidMarksException extends RuntimeException {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

class Student {
    private int id;
    private String name;
    private HashMap<String, Integer> marks;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.marks = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addMark(String subject, int mark) {
        if(mark < 0 || mark > 100) {
            throw new InvalidMarksException("Error: Enter marks between 0 to 100 for Subject "+subject);
        }
        marks.put(subject, mark);
    }
    
    public int getTotalMarks() {
        int totalMarks = 0;
        for(int mark : marks.values()) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    public double getPercentage() {
        if(marks.size() == 0) {
            return 0.0;
        }
        double totalMarks = getTotalMarks();
        double percentage = totalMarks / marks.size();
        return percentage; 
    }

    public boolean isPass() {
        return getPercentage() >= 40;
    }
}

class ResultService {

    public void printResult(Student student) {
        System.out.println("Student ID: "+ student.getId());
        System.out.println("Name of Student: "+ student.getName());
        System.out.println("Total Marks = "+ student.getTotalMarks());
        System.out.println("Percentage = "+ student.getPercentage());
        System.out.println("Is student pass: "+ student.isPass());
    }
}

public class StudentResultManagementSystem {
    public static void main(String[] args) {
        ResultService obj = new ResultService();
        Student s1 = new Student(1, "Rishi");
        try {
            s1.addMark("Java", 87);
            s1.addMark("DBMS", 78);
            s1.addMark("PHP", 101);
            s1.addMark("Python", 102);
        } catch(InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
        obj.printResult(s1);
    }
}
