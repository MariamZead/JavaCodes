import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        EvenOrOddForLoop();
        EvenOrOddWhileLoop();
    }
    // for loop
    public static void EvenOrOddForLoop(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to start checking with for loop : ");
        int num = in.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
        }
    }

    // while loop
    public static void EvenOrOddWhileLoop(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to start checking with while loop : ");
        int num = in.nextInt();
        while (num!=-1){
            if (num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
            System.out.println("Enter number or -1 to quit");
            num = in.nextInt();
        }
    }
}
