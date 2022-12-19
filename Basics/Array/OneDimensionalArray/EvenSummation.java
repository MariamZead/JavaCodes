import java.util.Scanner;
public class EvenSummation {
    public static void main(String[] args) {
        evenSummationArray();
    }
    public static void evenSummationArray(){
        Scanner in = new Scanner(System.in);
        int evenSum = 0;
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter " + arr.length + " values");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value number " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        for (int j : arr) {
            if (j % 2 == 0)
                evenSum += j;
        }
        System.out.println("The total of even summation is : "+ evenSum);
    }
}
