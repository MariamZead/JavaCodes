class Factorial {
    public static void main(String[] args) {
        int number = 5, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }

    static int factorial(int n) {
        if (n != 0)  // termination condition
            return n * factorial(n - 1); // recursive call
        else
            return 1;
    }
}
    /*
    factorial(5)
    5 * factorial(4)
    5 * (4 * factorial(3))
    5 * (4 * (3 * factorial(2)))
    5 * (4 * (3 * (2 * factorial(1))))
    5 * (4 * (3 * (2 * (1 * factorial(0)))))
    5 * (4 * (3 * (2 * (1 * 1))) 
    5 * 4 * 3 * 2 * 1 = 120
    
    */
