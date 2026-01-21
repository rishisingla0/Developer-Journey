class Person1 {
    String name;
    void message() {
        System.out.println("Hello");
    }
    Person1(String name) {
        System.out.println(name);
    }
}

class Student1 extends Person1 {
    Student1() {
        super("Rishi");
    }
    String name = "Vishu";
    void message() {
        super.message();
        System.out.println(super.name);
        System.out.println(this.name);
    }
}

public class superKeyword {
    public static void main(String[] args) {
        Person1 s1 = new Student1();
        s1.message();
    }
}
