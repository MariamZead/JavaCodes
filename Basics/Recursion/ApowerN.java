public class Recursion {
   public static void main(String[] args) {
        int n = 4;
        int a = 3;
        System.out.println(a + " power " + n +  " = " +power(n,a));
    }
    public static int power(int n, int a)
    {
        if (n == 1)
            return a;
        return
                a * power(n-1,a);
    }
}

/*
power(4,3)
3*power(3,3)
3*(3*power(2,3))
3*(3*(3*3))
*/
