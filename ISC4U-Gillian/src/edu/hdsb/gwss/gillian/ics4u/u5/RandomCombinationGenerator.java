/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u5;

/**
 *
 * @author Gill_Johnson
 */
public class RandomCombinationGenerator extends CombinationGenerator{
    
    @Override
    public int[] getCombo(int max, int size) {
        int[] combination = new int[size];
        int number;
        for (int i = 0; i < size; i++) {
            number = (int) (Math.random() * (max));
            combination[i] = number;
        }
        return combination;
    }
}