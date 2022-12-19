import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DynamicArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // initializing ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            printOptions();
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add an element");
                    list.add(scan.nextInt());
                    System.out.println("Element Added");
                    break;
                case 2:
                    System.out.println("Enter a number to be deleted");
                    int element = scan.nextInt();
                    if (list.contains(element)) {
                        list.remove((Integer) element);
                        System.out.println("Element removed");
                    } else System.out.println("number is not found");
                    break;
                case 3:
                    Collections.sort(list);
                    System.out.println("the elements has been sorted successfully");
                    break;
                case 4:
                    Collections.reverse(list);
                    System.out.println("the elements has been reversed successfully");
                    break;
                case 5:
                    System.out.println(list);
                    // another solution
                    for (Integer integer : list)
                        System.out.println(integer);
                    break;
                case 6:
                    return;  // the program will stop
            }
        }
    }
    static void printOptions(){
        System.out.println();
        System.out.println("1. add element");
        System.out.println("2. remove element");
        System.out.println("3. sort elements");
        System.out.println("4. reverse elements");
        System.out.println("5. print elements");
        System.out.println("6. exit");
        System.out.println();
    }
}
