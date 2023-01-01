
public class Main {
    public static void main(String[] args) {
        Trip trip1  = new Trip("1","Swimming" , "150$" , "3hr" , "Mohammed",24,"251","12345","5524");
        Trip trip2  = new Trip("2","Climbing Mountains","300$","5hr","Tamem",26,"224","12365","5565");
        Trip trip3  = new Trip("3","petting animals","50$","1hr","Tamer",25,"228","124516","5585");


        Passenger passenger1 = new Passenger("Mostafa", 22, "355", "3");
        Passenger passenger2 = new Passenger("Atef", 24, "476", "4");
        Passenger passenger3 = new Passenger("Omar", 23, "2", "2");

        TripsBooking.addTrip(trip1);
        TripsBooking.addPassengerToTrip(trip1,passenger1);
        TripsBooking.addPassengerToTrip(trip1,passenger2);

        TripsBooking.addTrip(trip2);
        TripsBooking.addPassengerToTrip(trip2,passenger3);
        TripsBooking.addPassengerToTrip(trip2,passenger2);

        TripsBooking.removePassenger(trip1,passenger1);

        TripsBooking.removedTrip(trip3);


        TripsBooking.saveTripsIntoFile("Trip details");
        TripsBooking.readTripsFromFile("Trips details");

    }
}
