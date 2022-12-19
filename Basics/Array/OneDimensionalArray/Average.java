import java.util.Scanner;
public class Average {
    public static void main(String []args) {
        System.out.println(averageArray());
    }
    public static double averageArray(){
        Scanner in = new Scanner(System.in);
        double sum = 0;
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter " + arr.length + " values");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value number " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }
}
