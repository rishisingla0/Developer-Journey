final class A {
    final int age = 10;
}

// class B extends A NOT ALLOWED 
// METHOD OVERRIDING ALSO NOT ALLOWED

public class finalKeyword {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.age);
        // obj.age = 20; NOT ALLOWED
    }
}
