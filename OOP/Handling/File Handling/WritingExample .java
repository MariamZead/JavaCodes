import java.io.*;
import java.util.Scanner;

public class Writing {
    public static void main(String[] args) {
        writingInNewFile("Test");
    }
    public static void writingInNewFile(String fileName){
        File file = new File(fileName);
        try {
            PrintWriter pr = new PrintWriter(file);
            pr.println("Mariam");
            pr.println("Developer");
            pr.println("^_^");
            System.out.println("The data has been added inside the file successfully");
            pr.close();
        }
        catch (IOException e){
            System.out.println("Error while entering the data");
        }
    }
}
