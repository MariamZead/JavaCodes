public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Belal" , 25);
        Person p2 = new Person("Atef" , 23);

        Person [] persons = {p1 , p2};

        // toString for each object (returning the data)
        for (Person person : persons){
            System.out.println(person);
        }

        // return a specific attribute
        for (Person person : persons){
            System.out.println(person.getName());
        }

    }
}
