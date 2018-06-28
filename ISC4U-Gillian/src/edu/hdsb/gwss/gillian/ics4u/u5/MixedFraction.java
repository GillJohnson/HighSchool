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
public class MixedFraction extends Fraction{

    private int wholeNumber;
    
    public MixedFraction(int wholeNumber, int numerator, int denominator) {
        super(numerator, denominator);
        super.wholeNumber = wholeNumber;
    }
    
    public void toImproper() {
        super.numerator = (wholeNumber * super.denominator) + super.numerator;
    }
    
    @Override
    public double size() {
        this.toImproper();
        return super.size();
    }
    
    
  
    @Override
    public String toString() {
        String s = "";
        if( this.numerator / this.denominator > 0 ) {
            s = s + (this.numerator / this.denominator);
        }
        s = s + (this.numerator - (this.denominator * (this.numerator / this.denominator)));
        
        return s;       
    }
    
    
    
    
}
