public class SumOfNumbers {
    public static void main(String []args){
        int result = sumOfNumbers(5);
        System.out.println(result);
    }
    public static int sumOfNumbers(int k) {
        if (k > 0) {
            return k + sumOfNumbers(k - 1);
        } else {
            return 0;
        }
    }
}
/*
sumOfNumbers(5)
5 + sumOfNumbers(4)
5 + (4 + sumOfNumbers(3))
5 + (4 + ( 3 + sumOfNumbers(2)))
5 + (4 + (3 + (2 + sumOfNumbers(1))))
5 + (4 +(3 + (2 + (1 + sumOfNumbers(0)))))
5 + (4 +(3 + (2 + (1 + 0))))
5 + 4 + 3 + 2 + 1 + 0 = 
*/
