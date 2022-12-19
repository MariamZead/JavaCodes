import java.util.Scanner;

public class PositiveNegativeCounter {
    public static void main(String []args){
        PositiveNegativeCounterArray();
    }
    public static void PositiveNegativeCounterArray(){
        Scanner in = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter " + arr.length + " values");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value number " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        for (int i : arr) {
            if (i > 0 )
                positiveCount++;
            if (i < 0 )
                negativeCount++;
        }
        System.out.println("The total positive number is : " + positiveCount);
        System.out.println("The total negative number is : " + negativeCount);
    }
}
