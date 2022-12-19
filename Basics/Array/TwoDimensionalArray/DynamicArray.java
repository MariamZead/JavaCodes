import java.util.Scanner;
public class DynamicArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = scan.nextInt();
        System.out.print("Enter the number of Columns : ");
        int col = scan.nextInt();
        int[][] table = new int[rows][col];


        while (true) {
            printOptions();
            int action = scan.nextInt();
            switch (action) {
                case 1 : reading(table); break;
                case 2 : display(table); break;
                case 3 : searchingForElement(table); break;
                case 4 : maximumElement(table); break;
                case 5 : mainDiagonalMaximumNumber(table); break;
                case 6 : elementsSummation(table); break;
                case 7 : mainDiagonalSummation(table); break;
                case 8 : printRowSummation(rowsSummation(table)); break;
                case 9 : printColSummation(colSummation(table)); break;
                case 10 : return;
            }
        }

    }
    static void printOptions(){
        System.out.println();
        System.out.println("1. add elements from the user");
        System.out.println("2. print array elements");
        System.out.println("3. search for specific element");
        System.out.println("4. print thr maximum element in the array");
        System.out.println("5. print thr maximum element in the main diagonal");
        System.out.println("6. calculate the sum of the entire elements");
        System.out.println("7. calculate the sum of the main diagonal");
        System.out.println("8. calculate the sum of the rows");
        System.out.println("9. calculate the sum of the columns");
        System.out.println("10. exit");
        System.out.println();
    }
    public static void reading(int [][] table){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + table.length + " rows and " + table[0].length + " columns  ");
        for (int i = 0; i < table.length; i++) {
            for (int j= 0; j< table[i].length; j++) {
                table[i][j] = scan.nextInt();
            }
        }
    }
    public static void display(int [][] table){
        System.out.println("The array elements is ");
        for (int i = 0; i < table.length; i++) {
            for (int j= 0; j< table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void maximumElement(int [][] table){
        double max = table[0][0];
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                if (table[i][j] > max )
                    max= table[i][j];
            }
        }
        System.out.println("The maximum number in the array is : " + max);
    }
    public static void mainDiagonalMaximumNumber(int [][] table){
        double max = table[0][0];
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                if ((i == j) && (max<table[i][j]))
                    max= table[i][j];
            }
        }
        System.out.println("The maximum number of the main diagonal is : " + max);
    }
    public static void searchingForElement(int[][] table){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the element you want to search for : ");
        int key = scan.nextInt();
        for (int i = 0; i < table.length; i++) {
            for (int j= 0; j< table[i].length; j++) {
                if (key == table[i][j]) {
                    System.out.println("The element you're searching for in row : " + (i+1) + " and in col : " + (j+1));
                    return;
                }
            }
        }
        System.out.println("The number is not in the list");
    }

    public static void mainDiagonalSummation(int [][] table){
        int sum = 0;
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                if (i == j)
                    sum += table[i][j];
            }
        }
        System.out.println("The summation of the main diagonal is : " + sum);
    }
    public static void elementsSummation(int [][] table){
        int sum = 0;
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                sum += table[i][j];
            }
        }
        System.out.println("The total summation of the elements : " + sum);
    }

    public static int [] rowsSummation(int [][] table){
        int rowSum [] = new int[table.length];
        // for row summation
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                rowSum[i]+= table[i][j];
            }
        }
        return rowSum;
    }
    public static int [] colSummation(int [][] table){
        int colSum [] = new int[table[0].length];
        // for row summation
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++){
                colSum[j]+= table[i][j];
            }
        }
        return colSum;
    }
    public static void printRowSummation(int [] arr){
        System.out.print("The summation of the rows is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printColSummation(int [] arr){
        System.out.print("The summation of the columns is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
