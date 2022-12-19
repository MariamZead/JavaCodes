import java.util.Scanner;

public class PositiveNegativeCounter {
    public static void main(String []args){

        PositiveNegativeCounterLoop();
    }
    public static void PositiveNegativeCounterLoop() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to start count : ");
        int num = input.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        while (num != 0) {
            if (num > 0)
                positiveCount++;
            if (num<0)
                negativeCount++;
            System.out.println("Enter number or 0 to quit");
            num = input.nextInt();
        }
        System.out.println("The total positive number is : " + positiveCount);
        System.out.println("The total negative number is : " + negativeCount);
    }
}
