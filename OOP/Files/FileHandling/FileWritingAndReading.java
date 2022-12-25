import java.io.*;
import java.util.Scanner;

public class FileWritingAndReading {
    public static void main(String[] args) {
        File f = new File("FileHandling.txt");
        writingInNewFile(f);
        readingFile(f);
    }
    public static void writingInNewFile(File filePointer){
        try {
            PrintWriter pr = new PrintWriter(filePointer);
            pr.println("Mariam");
            pr.println("Developer");
            pr.println("^_^");
            System.out.println("The data has been put inside the file successfully");
            pr.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Error "+e);
        }
    }

    public static void readingFile(File filePointer){
        try {
            Scanner sc = new Scanner(filePointer);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            System.out.println("The file is not exists");
        }
    }
}
