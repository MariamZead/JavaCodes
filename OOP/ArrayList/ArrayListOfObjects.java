import java.util.ArrayList;
public class ArrayListOfObjects {
    public static void main(String[] args) {
        Person p1 = new Person("Belal" , 25);
        Person p2 = new Person("Atef" , 23);
        ArrayList <Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        displayName(persons);
    }
    public static void displayName(ArrayList <Person> persons){
        for(Person person : persons)
            System.out.println(person.getName());
    }
}
class Person {
    private String name;
    private int ID;
    public Person(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public int getID() {return ID;}
    public void setID(int ID) {this.ID = ID;}

    public String toString(){
        return "Person ( name : " + name + " Person ID : " + ID + " )";
    }
}
