import java.util.Scanner;
public class LongestString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] words = new String[5];
        System.out.println("Enter " + words.length + " Words ");
        for (int i = 0; i < words.length; i++) {
            words[i] = in.next();
        }
        System.out.println("The longest String in the is is : " + longestString(words));

    }
    public static String longestString(String [] words){
        int index = 0;
        int longestStr = words[0].length();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestStr) {
                longestStr = words[i].length();
                index = i;
            }
        }
        return words[index];
    }
}
