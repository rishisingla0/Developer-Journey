class Student3 {
    String name;
    int age;
}

class Car {
    String brand;
    String model;
    double price;
}
public class classDemo {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.name = "Rishi";
        s2.name = "Vishu";
        s1.age = 20;
        s2.age = 23;
        System.out.println("Student 1 Name = "+s1.name+" Age = "+s1.age );
        System.out.println("Student 2 Name = "+s2.name+" Age = "+s2.age );
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.model = "A3";
        c1.price = 2800000;
        System.out.println("Price of "+c1.brand+" "+c1.model+" is "+c1.price);
    }
}
