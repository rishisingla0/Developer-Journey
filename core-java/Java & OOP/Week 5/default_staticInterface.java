interface A {
    void hello();
    default void help() {
        System.out.println("Help");
    }
    static void contact() {
        System.out.println("contact me");
    }
}

class B implements A {
    public void hello() {
        System.out.println("Hello");
    }
}

public class default_staticInterface {
    public static void main(String[] args) {
        A obj = new B();
        obj.hello();
        obj.help();
        A.contact();
    }
}
// default methods can be called in any object by using the object reference
// static methods can only be called using interface name