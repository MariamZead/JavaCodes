package com.example.demo1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Flight {
    String flightNumber;
    static ArrayList <Passenger> passengers;
    public Flight(String flightNumber){
        this.flightNumber = flightNumber;
        passengers = new ArrayList<>();
    }
    public static void addPassenger(Passenger newPassenger){
       for(Passenger passenger : passengers){
            if (passenger.equals(newPassenger)) {
                System.out.println("the passenger already exist");
                return;
            }
       }
       passengers.add(newPassenger);
        System.out.println("the passenger has been added successfully ");
    }
    public static String oldestPassenger(){
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
    public static void saveIntoFile(String file){
        File f = new File(file);
        try {
            PrintWriter pr = new PrintWriter(f);
            for (Passenger passenger : passengers)
                pr.println(passenger);
            pr.close();
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }
}
