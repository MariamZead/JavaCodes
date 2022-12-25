import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Name : " + name+ " , Age : "+ age ;
    }
}
public class WritingReadingObjects {
    public static void main(String[] args) {
        Person p1 = new Person("Mariam", 20);
        Person p2 = new Person("Yara", 21);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        File f = new File("PersonsData.txt");
        saveDataIntoTextFile(f,persons);
        readDataFromFile(f);

    }
    public static void saveDataIntoTextFile(File filePointer , ArrayList <Person> persons){
        try {
            PrintWriter pr = new PrintWriter(filePointer);
            for (Person person : persons) {
                pr.println(person);
            }
            pr.close();
            System.out.println("text file created successfully");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    public static void readDataFromFile(File filePointer){
        try{
            Scanner sc = new Scanner(filePointer);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("The is not exists");
        }
    }
}
