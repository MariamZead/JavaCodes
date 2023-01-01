public class Age {
    public static void main(String[] args) {
        ArrayList <Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("251","Mariam",20));
        passengers.add(new Passenger("252","Amira",19));
        System.out.println(oldestPassenger(passengers) + " is Older");
        oldestPassenger(passengers);

    }
    public static String oldestPassenger(ArrayList <Passenger> passengers){
        int maxAge = 0;
        String name = "";
        for (Passenger passenger : passengers){
            if (passenger.getAge() >  maxAge){
                maxAge = passenger.getAge();
                name = passenger.getName();
            }
        }
        return name;
    }
}

class Passenger {
    private String passportNumber;
    private String name;
    private int age;
    public Passenger(String passportNumber,String name, int age){
        this.passportNumber = passportNumber;
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
