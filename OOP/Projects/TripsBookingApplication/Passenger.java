
public class Passenger extends Person{
    private String seatNumber;

    public Passenger() {}

    public Passenger(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // parameterized constructor
    public Passenger(String name, int age, String ID, String seatNumber) {
        super(name, age, ID);
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {return seatNumber;}
    public void setSeatNumber(String seatNumber) {this.seatNumber = seatNumber;}

    public boolean equals(Object obj){
        Passenger passenger = (Passenger) obj;
        return this.getID().equals(passenger.getID());
    }
    @Override
    public String toString() {
        return "\n"+super.toString()+
                " seatNumber = " + seatNumber + "\n";
    }
}
