import java.util.Scanner;
public class CountingWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String words = in.nextLine();
        System.out.println("The total words in the list is : " + countingWords(words));
        System.out.println("The total words in the list is : " + wordCounter(words));
    }
    public static int countingWords(String str){
        int counter = 1;

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==' ') {
                counter++;
            }
        }
        return counter;
    }
    public static int wordCounter(String string) {
        int counter = 0;
        char[] ch = new char[string.length()];

        for(int i=0;i<string.length();i++) {
            ch[i]= string.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)))
                counter++;
        }
        return counter;
    }
}
