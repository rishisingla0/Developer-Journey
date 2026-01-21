public class arraysDemo {
    public static void main(String[] args) {
        int[] arr = {10,20,80,40,50};
        int sum = 0;
        int largest = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("Sum = "+sum);
        System.out.println("Largest = "+largest);
    }
}
