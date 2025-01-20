package com.bhagya.practice.service;

import com.bhagya.practice.model.Passenger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PassengerService {


    private static Map<Integer, Passenger> passengers = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    int passengerIndex = 0;
    static Passenger passenger = new Passenger();


    public static void passengerData (Passenger passenger) {
            System.out.println(passenger);

        }
        public Passenger acceptPassenger () {
            int option;

           // System.out.println("....pls choose your option....");
           // option = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Your Full Name");
            String name = scanner.nextLine();

            System.out.println("Enter Your Mo No");
            long MoNo = scanner.nextLong();

            System.out.println("Enter the type of Passenger");
            String type = scanner.nextLine().toUpperCase(); //enum value convert in string using toUpperCase()

            System.out.println("Enter Your UID no");
            long uid = scanner.nextLong();

            passenger.setFullName(name);
            passenger.setMoNo(MoNo);
            passenger.setUIDno(uid);

            passengers.put(1, passenger);
            return passenger;

        }

        public void displayPassenger () {
            Set<Map.Entry<Integer, Passenger>> entrySet = passengers.entrySet();
            for (Map.Entry<Integer, Passenger> passengerEntry : entrySet) {
                System.out.println("Key: " + passengerEntry.getKey() + "| Value: " + passengerEntry.getValue());
            }


        }
        public void deletePassenger ( long MoNo){
            Passenger removedPassenger = passengers.remove(MoNo);
            System.out.println("removed Passenger:" + removedPassenger);

        }

    public void deleteAllPassenger(){
        passengers.clear();
    }


}