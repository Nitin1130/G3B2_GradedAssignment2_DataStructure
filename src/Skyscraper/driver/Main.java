package Skyscraper.driver;

import Skyscraper.services.Skyscraper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the total no of floors in the building : ");
        try (Scanner sc = new Scanner(System.in)) {
            int numberOfFloors = sc.nextInt();
            int[] listOfFloors = new int[numberOfFloors];
            for (int i = 0; i < numberOfFloors; i++) {
                System.out.println("Enter the floor size given on day : " + (i + 1));
                int floorSize = sc.nextInt();
                listOfFloors[i] = floorSize;
            }
            Skyscraper.calculateFloors(listOfFloors);
        }
    }
}
