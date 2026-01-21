import java.util.*;
public class studentResultAnalyzer {
    public static double total(double[] arr) {
        double totalMarks = 0;
        for(int i=0; i<arr.length; i++) {
            totalMarks += arr[i];
        }
        return totalMarks;
    }

    public static double average(double totalMarks, int subjects) {
        double average = totalMarks/subjects;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Student: ");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.print("Enter the total number of Subjects: ");
        int subjects = sc.nextInt();
        double[] arr = new double[subjects];
        System.out.print("Enter the marks in each subject: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        double totalMarks = total(arr);
        System.out.println("Total Marks = "+totalMarks);
        double average = average(totalMarks, subjects);
        System.out.println("Average = "+average);
        if(average >= 40) {
            System.out.println("Student is Passed");
        } else {
            System.out.println("Student is Fail");
        }
    }
}
