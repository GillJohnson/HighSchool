/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u1;



import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.acos;

import java.util.Scanner;

/**
 *
 * @author 1johnsongil1
 */
public class DistanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        double lat1, lon1, lat2, lon2, distance;
        String place1, place2;
        
        //OBJECT
        Scanner input = new Scanner(System.in);
        
        //INPUT
        System.out.println("What is the first location?");
        place1 = input.nextLine();
        System.out.println("What is the second location?");
        place2 = input.nextLine();
        System.out.println("What is the latitude of the first location? North latitude and west longitude use positive degree value. South latitude and east longitude use negatice degree values");
        lat1 = input.nextDouble();
        System.out.println("What is the longitude of the first location?");
        lon1 = input.nextDouble();
        System.out.println("What is the latitude of the second location?");
        lat2 = input.nextDouble();
        System.out.println("What is the longitude of the second location?");
        lon2 = input.nextDouble();
        
        distance = 6378.8 * acos(sin(lat1/57.2958) * sin(lat2/57.2958) + cos(lat1/57.2958) * cos(lat2/57.2958) * cos(lon2/57.2958 - lon1/57.2958));
        System.out.println("The distance from " + place1 + " to " + place2 + " is " + distance + "km");
    }
    
}
