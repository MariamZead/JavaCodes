import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        MaximumAndMinimumLoop();
    }
    public static void MaximumAndMinimumLoop(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number to start checking maximum and minimum number : ");
        int num = input.nextInt();
        int max = num;
        int min = num;
        while (num != 0){
            if(num >max)
                max = num;
            if(num<min)
                min = num;
            System.out.println("Enter number or 0 to quit");
            num = input.nextInt();
        }
        System.out.println("The maximum number is : " + max);
        System.out.println("The minimum number is : " + min);
    }
}
