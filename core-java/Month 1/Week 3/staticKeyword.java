class Counter {
    static int count = 0;
    int id;
    static int rollNo;
    public int setData(int id) {
        this.id = id;
        return id;
    }
    static int rollNo(int a) {
        rollNo = a;
        return rollNo;
    }
}
public class staticKeyword {
    public static void main(String[] args) {
        int count = Counter.count; // can be used without creating object
        System.out.println(count);
        int rollNo = Counter.rollNo(20); // static method
        System.out.println(rollNo);
        Counter c1 = new Counter();
        c1.setData(10);
        System.out.println(c1.id);
    }
}
