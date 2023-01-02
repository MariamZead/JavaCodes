import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Reading {
  public static void main(String[] args) {
        readingFile("Informations");
    }
    public static void readingFile(String fileName){
        File file = new File(fileName);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            System.out.println("The File is not exists");
        }
    }
}
