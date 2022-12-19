import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        EvenOrOddArray();
    }
    // array
    public static void EvenOrOddArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter " + arr.length + " values");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value number " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        for (int i : arr) {
            if (i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
        }

    }
}
