public class Recursion {
    public static void main(String[] args) {
        int num = 123;
        System.out.println("Reversed number of" + num + " is " + guess(num));
    }

    public static String guess(int num) {
        if (num == 0)
            return "";
        return (num % 10 + guess(num / 10));
    }
}
