public class countDigits {
    public static void main(String[] args) {
        int digits = 0;
        int sum = 0;
        int num = 155;
        while(num>0) {
            int remainder = num % 10;
            sum += remainder;
            num = num/10;
            digits++;
        }
        System.out.println(digits);
        System.out.println(sum);
    }
}
 