class A {
    private int age;
    public void setValue(int age) {
        if(age>0) {
            this.age = age;
        }
    }
    public int getValue() {
        return age;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        A obj = new A();
        obj.setValue(10);
        System.out.println("Age = "+obj.getValue());
    }
}
