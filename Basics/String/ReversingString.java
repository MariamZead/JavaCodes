
public class ReversedString {
    public static void main(String[] args) {
        ReversedString("Stars");
    }
    public static void ReversedString(String word){
        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
