class Container<T> {
    T value;
    void set(T value) {
        this.value = value;
    }
    T get() {
        return value;
    }
}

class demo {
    <T> void print(T value) {
        System.out.println(value);
    }
}
public class genericDemo {

    static <T> void print(T value) {
        System.out.println(value);
    }
    public static void main(String[] args) {
        Container<Integer> obj = new Container<>();
        obj.set(10);
        System.out.println(obj.get());
        genericDemo.print(100);
        demo d1 = new demo();
        d1.print("Hello");
    }
}
