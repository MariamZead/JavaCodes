import java.io.*;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        // will print file not found because I don't have text document with this pathname
        try {
            File f = new File("Mariam.txt");
            Scanner sc = new Scanner(f);
            String s = sc.nextLine();
            System.out.println(s);
            sc.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
