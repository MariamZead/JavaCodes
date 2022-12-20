class Factorial {

    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }
    /*
    4 * factorial(3)     
    4 * (3 * factorial(2))
    4 * (3 * (2 * factorial(1)))
    4 * (3 * (2 * (1 *factorial(0))))
    4 * (3 * (2* (1*1)))
    4 * (3 * (2*1))
    4 * (3 * 2)
    4 * 6
    24
    */

    public static void main(String[] args) {
        int number = 4, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}
