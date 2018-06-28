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
public class ImproperFraction extends Fraction{
    
    protected int wholeNumber;

    public ImproperFraction(int numerator, int denominator) {
        super(numerator, denominator);
        if (numerator < denominator) {
            ProperFraction pf = new ProperFraction(numerator, denominator);
        }
    }
    
    public void toMixed() {
        this.wholeNumber = (int) (this.numerator / this.denominator);
        MixedFraction mf = new MixedFraction(this.wholeNumber, this.numerator % this.denominator, this.denominator);
    }
    
}
