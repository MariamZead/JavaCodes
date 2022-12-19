import java.util.Scanner;
public class DynamicArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = scan.nextInt();
        int[] list = new int[size];


        while (true) {
            printOptions();
            int action = scan.nextInt();
            switch (action) {
                case 1 : reading(list); break;
                case 2 : display(list); break;
                case 3 : searchingForElement(list); break;
                case 4 : maximumElement(list); break;
                case 5 : elementsSummation(list); break;
                case 6 : return;
            }
        }

    }
    static void printOptions(){
        System.out.println();
        System.out.println("1. add elements from the user");
        System.out.println("2. print array elements");
        System.out.println("3. search for specific element");
        System.out.println("4. print thr maximum element in the array");
        System.out.println("5. calculate the sum of the entire elements");
        System.out.println("6. exit");
        System.out.println();
    }
    public static void reading(int [] arr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " values");
        // reading from the user
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value number " + (i + 1) + " : ");
            arr[i] = scan.nextInt();
        }
    }
    public static void display(int [] arr){
        System.out.print("The array elements is : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void searchingForElement(int[] list){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the key : ");
        int key = scan.nextInt();
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                System.out.println("The element you're searching for at index : " + i);
                return;
            }
        }
        System.out.println("The number is not in the list");
    }
    public static void maximumElement(int [] arr){
        double max = arr[0];
        for (int i = 0; i < arr.length; i++){
                if (arr[i] > max )
                    max= arr[i];
        }
        System.out.println("The maximum number in the array is : " + max);
    }
    public static void elementsSummation(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
        System.out.println("The total summation of the elements : " + sum);
    }
    
}
