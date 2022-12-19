import java.util.Scanner;
public class EvenSummation {
    public static void main(String[] args) {
        evenSummationLoop();
    }
    public static void evenSummationLoop(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to start summing with while loop : ");
        int num = in.nextInt();
        int evenSum = 0;
        while (num!=-1){
            if (num % 2 == 0)
                evenSum+=num;
            System.out.println("Enter number or -1 to quit");
            num = in.nextInt();
        }
        System.out.println("The total of even summation is : "+ evenSum);
    }
}
