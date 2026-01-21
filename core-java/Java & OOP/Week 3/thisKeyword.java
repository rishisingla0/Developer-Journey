class Student2{
    String name;
    int age;
    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int setAge(int age) {
        this.age = age+10;
        return age;
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Rishi", 20);
        System.out.println("Name = "+s1.name+" Age = "+s1.age);
        s1.setAge(20);
        System.out.println("Updated age = "+s1.age);
    }
}
