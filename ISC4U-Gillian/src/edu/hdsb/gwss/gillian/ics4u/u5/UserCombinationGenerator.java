/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u5;

import java.util.Scanner;

/**
 *
 * @author Gill_Johnson
 */
public class UserCombinationGenerator extends CombinationGenerator{
    
    public int firstNumber, secondNumber, thirdNumber, fourthNumber;
    Scanner input = new Scanner(System.in);
    private int error = 0;
    
    @Override
    public int[] getCombo(int max, int size) {
        int[] combination = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("What is the " + (i+1) + " number you would like set");
            if ( i == 0) {
                firstNumber = input.nextInt();
                if (firstNumber > max || firstNumber < 0) {
                    System.out.println("Error! Number not in range 0-" + max + ". No Combination set.");
                    error++;
                    i = size;
                } else {
                    combination[i] = firstNumber;
                }
            }
            else if ( i == 1) {
                secondNumber = input.nextInt();
                if (secondNumber > max || secondNumber < 0) {
                    System.out.println("Error! Number not in range 0-" + max + ". No Combination set.");
                    error++;
                    i = size;
                } else {
                combination[i] = secondNumber;
                }
            }
            else if ( i == 2) {
                thirdNumber = input.nextInt();
                if (thirdNumber > max || thirdNumber < 0) {
                    System.out.println("Error! Number not in range 0-" + max + ". No Combination set.");
                    error++;
                    i = size;
                } else {
                    combination[i] = thirdNumber;
                }
            }
            else if (size > 3) {
                if (i == 3) {
                    fourthNumber = input.nextInt();
                    if (fourthNumber > max || fourthNumber < 0) {
                        System.out.println("Error! Number not in range 0-" + max + ". No Combination set.");
                        error++;
                        i = size;
                    } else {
                        combination[i] = fourthNumber;
                    }
                }
            }
        }
        if (error > 0) {
            for (int i = 0; i < size; i++) {
                combination[i] = -1;
            }
        }
        return combination;
    }
}
