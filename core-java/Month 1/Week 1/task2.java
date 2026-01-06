public class task2 {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        System.out.print("Reverse: ");
        while(n>0) {
            int r = n%10;
            System.out.print(r);
            n = n/10;
            sum += r;
        }
        System.out.println();
        System.out.println("Sum: "+ sum);
    }
}
