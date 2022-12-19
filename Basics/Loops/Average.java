import java.util.Scanner;
public class Average {
    public static void main(String []args) {
        System.out.println(averageLoop());
        System.out.println(averageArray());
    }
  public static double averageLoop(){
        Scanner in = new Scanner(System.in);
        double sum = 0;
        double counter = 0;
        System.out.println("Enter number to start : ");
        int num = in.nextInt();
        while (num != -1){
            sum+=num;
            counter++;
            System.out.println("Enter a new number or -1 to quit");
            num = in.nextInt();
        }
        return sum / counter;
    }
}
