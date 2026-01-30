import java.util.*;

class Student1 {
    int marks;
    String name;
    Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return name + " : " + marks;
    }
}

class NameComparator implements Comparator<Student1> {
     public int compare(Student1 a, Student1 b) {
        return a.name.compareTo(b.name);
        // return Integer.compare(a.marks, b.marks);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1("Rishi", 100));
        list.add(new Student1("Vishu", 50));
        list.add(new Student1("Sujal", 80));
        list.add(new Student1("Sagar", 60));
        Collections.sort(list, new NameComparator());
        System.out.println(list);
    }
}
