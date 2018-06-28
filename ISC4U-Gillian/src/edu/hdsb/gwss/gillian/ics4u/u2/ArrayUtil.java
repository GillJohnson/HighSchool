/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u2;

/**
 *
 * @author Gill_Johnson
 */
public class ArrayUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    public static void displayArray(int[][] array) {
        int[][] chosenArray = array;
        for (int x = 0; x < chosenArray.length; x++) {
            for (int y = 0; y < chosenArray[x].length; y++) {
                System.out.format("%5s ", chosenArray[x][y]);
            }
            System.out.println("");
        }
    }
    
    public static int findMaximum(int[][] array) {
        int maxValue = array[0][0];
        for (int i = 1; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                if (array[i][y] > maxValue) {
                    maxValue = array[i][y];
                }
            }
        }
        return maxValue;
    }
    
    public static int findMinimum(int[] data) {
        int minValue = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < minValue) {
                minValue = data[i];
            }
        }
        return minValue;
    }
    public static double findAverage(int[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum / data.length;        
    }
    public static int totalSum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }
    
}
