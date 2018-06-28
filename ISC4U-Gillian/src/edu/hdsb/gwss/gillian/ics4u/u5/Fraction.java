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
public class Fraction implements FractionInterface {
    
    //PROPERTIES
    protected int numerator, denominator;
    protected int wholeNumber = 0;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }
        else {
            this.denominator = 1;
        }
    }

    @Override
    public double size() {
        return ((double) this.numerator / (double) this.denominator);
    }

    @Override
    public Fraction larger(Fraction f) {
        if (f.size() > f.size() || f.size() == f.size()) {
            return f;
        }
        return f;
    }

    @Override
    public Fraction larger(Fraction f, Fraction g) {
        if (f.size() > g.size() || f.size() == g.size()) {
            return f;
        }
        return g;
    }

    @Override
    public Fraction times(Fraction f) {
        return times( this, f );
    }

    @Override
    public Fraction times(Fraction f, Fraction g) {
        Fraction newFraction = new Fraction((f.numerator * g.numerator), (f.denominator * g.denominator));
        return newFraction;
    }

    @Override
    public void reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
    }

    @Override
    public void inverts() {
        this.reduce();
        int substitute = this.numerator;
        if (substitute < 0) {
            this.numerator  = this.denominator * -1;
            this.denominator = substitute * -1;
        }
        else {
            this.numerator  = this.denominator;
            this.denominator = substitute;
        }
    }

    @Override
    public boolean equals(Fraction f) {
        return this.size() == f.size();
    }
    
    private static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    @Override
    public String toString() {
        return "Fraction{" + wholeNumber + " " + numerator + " / " + denominator + '}';
    }
    
    
    
}
