/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u1;

import java.util.Scanner;

/**
 *
 * @author 1johnsongil1
 */
public class EasterComes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int year, a, b, c, d, e, f, g, h, i, j, k, m, p, month, day;
    
        //OBJECTS
        Scanner input = new Scanner(System.in);
    
        //INPUT
        System.out.println("What is the year?");
        year = input.nextInt();
        a = year%19;
        b = year/100;
        c = year%100;
        d = b/4;
        e = b%4;
        f = (b+8)/25;
        g = (b-f+1)/3;
        h = (19 * a + b - d - g + 15)%30;
        i = c/4;
        k = c%4;
        j = (32 + (2*e) + (2*i) - h - k)%7;
        m = (a + (11*h) + (22*j))/451;
        p = (h + j - (7*m) + 114)%31;
        month = (h + j - 7*m + 114)/31;
        day = p + 1;
        System.out.println("The day Easter falls on in the year " + year + " is in the month " + month + " and on the day " + day);
    }
    
}
