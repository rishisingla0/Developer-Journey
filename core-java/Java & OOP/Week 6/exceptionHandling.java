class Arithmetic {
    void math() {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
    }
}

class Arrays {
    void index() {
        try {
            int arr[] = new int[10];
            for(int i=0; i<=arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index for array doesn't exist");
        }
    }
}

public class exceptionHandling {
    public static void main(String[] args) {
        Arithmetic a1 = new Arithmetic();
        a1.math();
        Arrays m1 = new Arrays();
        m1.index();
    }
}
