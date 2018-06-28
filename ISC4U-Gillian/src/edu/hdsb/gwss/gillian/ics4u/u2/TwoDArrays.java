/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u2;

import java.util.ArrayList;

/**
 *
 * @author 1johnsongil1
 */
public class TwoDArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] results = new int[6][6];
        int die1;
        int die2;
        
        for (int n = 0; n < 36000; n++) {
            die1 = (int)(Math.random()*6);
            die2 = (int)(Math.random()*6);
            
            results[die1][die2]++;
        }
        
        for (die1 = 0; die1 < results.length; die1++) {
            for (die2 = 0; die2 < results[die1].length; die2++) {
                //%5s means 5 spaces
                //% means data
                //5 means number of spaces
                System.out.format("%8s ", results[die1][die2]);
            }
            System.out.println("");
        }



//        Scanner input = new Scanner(System.in);
//        int [] [] marks = new int[3] [3];
//        
//        //marks is the pointer to an array
//        
////        //if you already know the data use set notation
////        //you will have a set of sets
////        //int[][] marks = {
////        {1},
////        {2, 3, 4},
////        {5},
////        {6,7,8,9,10}
////    };
//        
//        for (int row = 0; row < marks.length; row++) {
//            for (int column = 0; column < marks[row].length; column++) {
//                System.out.println(row + "-" + column);
//                marks[row][column] = Integer.parseInt(input.nextLine());
//            }
//        }

            //ArrayList[] items = new ArrayList[4];
            //ArrayList[][] items = new ArrayList[4][];
            //items[0] = new ArrayList[4];
            
            //default for objects is null
    }
    
}
