/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u5;

/**
 *
 * @author 1johnsongil1
 */
public class ProperFraction extends Fraction{

    public ProperFraction(int numerator, int denominator) {
        super(numerator, denominator);
        if (numerator > denominator) {
           ImproperFraction iF = new ImproperFraction(numerator, denominator);
        }
    }
    
    public void toMixed() {
        MixedFraction mf = new MixedFraction(0, this.numerator, this.denominator);
    }
    
}
