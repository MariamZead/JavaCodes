import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        MaximumAndMinimumArray();
    }
    public static void MaximumAndMinimumArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter " + arr.length + " values");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value number " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        // checking the minimum number in the list
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        // checking the maximum number in the list
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("The maximum number in the list is : " + max);
        System.out.println("The minimum number in the list is : " + min);
    }
}
