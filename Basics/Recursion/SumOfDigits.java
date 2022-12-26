
public class SumOfNumberDigits {
    public static void main(String[] args) {
        int num = 123;
        System.out.println("The sum of digits of " + num + " is " + sumOfDigits(num));
    }

    public static int sumOfDigits(int num) {
        if (num == 0)
            return 0;
        return (num % 10 + sumOfDigits(num / 10));
    }
}
/*
sumOfDigits(123)
3 + sum(12)
3 + (2 + sum(1))
3 + (2 + (1 + sum(0)))
3 + (2 + (1 + 0))
3 + 2 + 1 + 0 = 6
*/
