import java.util.*;

class Student0 implements Comparable<Student0> {
    int marks;
    Student0(int marks) {
        this.marks = marks;
    }

    public int compareTo(Student0 s) {
        return this.marks - s.marks;
    }

    public String toString() {
        return marks + "";
    }
}

public class comparable {
    public static void main(String[] args) {
        ArrayList<Student0> list = new ArrayList<>();
        list.add(new Student0(100));
        list.add(new Student0(50));
        list.add(new Student0(80));
        list.add(new Student0(60));
        Collections.sort(list);
        System.out.println(list);
    }
}
