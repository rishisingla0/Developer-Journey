class Person {
    String name;
    int age;
    void displayPersonDetails() {
        System.out.println(name);
        System.out.println(age);
    }
}

class Student extends Person {
    int rollNo;
    void displayStudentDetails() {
        System.out.println(rollNo);
    }
}

public class inheritanceDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rishi";
        s1.age = 20;
        s1.rollNo = 36;
        s1.displayPersonDetails();
        s1.displayStudentDetails();
    }
}   