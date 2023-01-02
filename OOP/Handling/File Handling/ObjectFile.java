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

public class Object {
  static ArrayList <Person> persons = new ArrayList<>();
  public static void main(String[] args) {
    Person person1 = new Person("Mariam",20);
    Person person2 = new Person("Eman" , 45);
    persons.add(person1);
    persons.add(person2);
    saveDataIntoTextFile("Personal Informations");
    readDataFromFile("Hello");
  }

  public static void saveDataIntoTextFile(String fileName){
    File file = new File(fileName);
    try {
      PrintWriter pr = new PrintWriter(file);
      for (Person person : persons) {
        pr.println(person);
      }
      pr.close();
      System.out.println("The data has been added inside the file successfully");
    } catch (IOException e) {
      System.out.println("Error while entering the data");
    }
  }
  public static void readDataFromFile(String fileName){
    File file = new File(fileName);
    try{
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
