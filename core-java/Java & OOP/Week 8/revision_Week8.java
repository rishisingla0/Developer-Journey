import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
    public String toString() {
        return id + " " + name + " " + marks + " ";
    }
}

class NameeComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
} 

class idComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return Integer.compare(a.id, b.id);
    }
}

public class revision_Week8 {

    public static <T> void printList(List<T> list) {
        System.out.println(list);
    }

    public static void printNumbers(List<? extends Number> list) {
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Rishi", 86));
        list.add(new Student(2, "Vishu", 45));
        list.add(new Student(3, "Sujal", 70));
        list.add(new Student(4, "Sagar", 68));

        ArrayList<Integer> intlist = new ArrayList<>();
        intlist.add(10);
        intlist.add(30);
        intlist.add(20);
        intlist.add(50);

        ArrayList<Double> doulist = new ArrayList<>();
        doulist.add(1.24);
        doulist.add(5.64);
        doulist.add(7.28);
        doulist.add(2.56);

        //printNumbers(doulist);
        //printNumbers(intlist);

        //printList(list);
        //printList(intlist);
        

        //Collections.sort(list);
        //System.out.println(list);
        //Collections.sort(list, new NameeComparator());
        //System.out.println(list);
        //Collections.sort(list, new idComparator());
        //System.out.println(list);
    }
}
