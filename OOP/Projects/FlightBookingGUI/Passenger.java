public class Passenger {
    private String passportNumber;
    private String name;
    private int age;
    public Passenger(){}
    public Passenger(String passportNumber,String name, int age){
        this.passportNumber = passportNumber;
        this.name = name;
        this.age = age;
    }

    public String getPassportNumber() {return passportNumber;}
    public String getName() {return name;}
    public int getAge() {return age;}

    @Override
    public String toString() {
        return "Passenger{" +
                "passportNumber='" + passportNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equals(Object obj){
        Passenger passenger = (Passenger) obj;
        return this.passportNumber.equals(passenger.getPassportNumber());
    }
}
