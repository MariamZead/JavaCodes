
import java.util.ArrayList;

public class Trip {
    private String tripNumber;
    private String tripType;
    private String ticketPrice;
    private String totalTravelTime;
    private final Driver driver;
    private final int maxPassengersNumber = 5;
    ArrayList<Passenger> passengersList = new ArrayList<>();

    public Trip(String tripNumber, String tripType, String ticketPrice, String totalTravelTime, String name, int age, String ID, String phoneNumber, String licenseNumber) {
        this.tripNumber = tripNumber;
        this.tripType = tripType;
        this.ticketPrice = ticketPrice;
        this.totalTravelTime = totalTravelTime;
        this.driver = new Driver(name,age,ID,phoneNumber,licenseNumber);
    }

    public String getTripNumber() {return tripNumber;}
    public void setTripNumber(String tripNumber) {this.tripNumber = tripNumber;}

    public String getTicketPrice() {return ticketPrice;}
    public void setTicketPrice(String ticketPrice) {this.ticketPrice = ticketPrice;}

    public String getTripType() {return tripType;}
    public void setTripType(String tripType) {this.tripType = tripType;}

    public String getTotalTravelTime() {return totalTravelTime;}
    public void setTotalTravelTime(String totalTravelTime) {this.totalTravelTime = totalTravelTime;}

    public int getMaxPassengersNumber() {return maxPassengersNumber;}


    public boolean equals(Object obj) {
        Trip trip = (Trip)obj;
        return this.getTripNumber().equals(trip.getTripNumber());
    }

    @Override
    public String toString() {
        return "Trip Informations\n" +
                "   tripNumber = " + tripNumber +
                "\n   tripType = " + tripType +
                "\n   ticketPrice= " + ticketPrice +
                "\n   totalTravelTime='" + totalTravelTime +
                driver +
                "\n   Passengers : \n" + passengersList;
    }
}
