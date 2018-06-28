/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u2;

import java.util.Scanner;

/**
 *
 * @author Gill_Johnson
 */
public class GameOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Scanner input = new Scanner(System.in);
//        System.out.println("Live Cell Number: ");
//        int liveCellNumber = input.nextInt();
        
        int[][] cells = new int[5][5];
        int count = 0;
        while (count < 5) {
            int row = (int) (int)(Math.random() * 5);
            int col = (int) (int)(Math.random() * 5);
            if (cells[row][col] == 0) {
                cells[row][col] = 1;
            }
            count++;
        }
        for (int r = 0; r < cells.length; r++) {
            for (int c = 0; c < cells[r].length; c++) {
                neighborCount(cells, r, c);
                
            }
        }
        
        
    }
    
    public static void newGeneration(int[][] cells) {
        int[][] nextCells = new int[5][5];
        for (int r = 0; r < cells.length; r++) {
            for (int c = 0; c < cells[r].length; c++) {
                if (cells[r][c] == 0) {
                    
                }
            }
        }
    }
   
    public static int neighborCount(int[][] cells, int row, int col) {
        int neighbours = 0;
        for (int r = row - 1; r <= row + 1; r++)
        {
            if (r >= 0 && r < cells.length)
            {
                for (int c = col - 1; c <= col + 1; c++)
                {
                    if (c >= 0 && c < cells[r].length)
                    {
                       if (cells[r][c] == 1)
                       {
                           neighbours++;
                       }
                    }
                 }
             }
            if(cells[row][col] == 1) {
                neighbours--;
            }
         }
        
        return neighbours;
    }
    
}
