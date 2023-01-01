
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TripsBooking {
    static ArrayList <Trip> trips = new ArrayList<>();

    public static void addTrip(Trip newTrip) {
        for (Trip trip : trips){
            if (newTrip.equals(trip)){
                System.out.println("There is trip with this number already");
                return;
            }
        }
        trips.add(newTrip);
        System.out.println("trip added successfully");
    }
    public static void removedTrip(Trip oldTrip) {
        for (Trip trip : trips) {
            if (!(oldTrip.equals(trip))) {
                System.out.println("There is no trip with this name");
                return;
            }
        }
        trips.remove(oldTrip);
        System.out.println("trip removed successfully");
    }
    public static void addPassengerToTrip(Trip trip, Passenger newPassenger) {
        if (!trips.contains(trip)) {
            System.out.println("the trip is not exist so please create trip with this name first");
            return;
        }
        if (!(trip.passengersList.size() < trip.getMaxPassengersNumber())) {
            System.out.println("you Have reached the maximum number of passengers on this trip");
            return;
        }
        for (Passenger passenger : trip.passengersList) {
            if (newPassenger.equals(passenger)) {
                System.out.println("the passenger you want to add is already exist in the list , you can't add the same passenger twice to the same trip");
                return;
            }
        }
        trip.passengersList.add(newPassenger);
        System.out.println("passenger added successfully");
    }
    public static void removePassenger(Trip trip, Passenger oldPassenger) {

        if (!trips.contains(trip)) {
            System.out.println("this trip is not exist");
            return;
        }
        if (!trip.passengersList.contains(oldPassenger)) {
            System.out.println("sorry there is no passenger with this ID on the trip");
            return;
        }
        trip.passengersList.remove(oldPassenger);
        System.out.println("passenger removed successfully");

    }
    public static void saveTripsIntoFile(String file){
        File f = new File(file);
        try {
            PrintWriter pr = new PrintWriter(f);
            for (Trip trip : trips)
                pr.println(trip);
            pr.close();
        }
        catch (IOException e){
            System.out.println("Error will entering data");
        }
    }
    public static void readTripsFromFile(String file){
        File f = new File(file);
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch (IOException e){
            System.out.println("Error There is no txt file with this name");
        }
    }
}
