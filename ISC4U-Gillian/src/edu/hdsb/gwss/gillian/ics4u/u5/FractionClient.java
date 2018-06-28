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
public class FractionClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TEST - PROPER FRACTIONS
        ProperFraction pf = new ProperFraction(1, 2);
        ProperFraction pf2 = new ProperFraction(3, 4);
        ProperFraction pfSquared = new ProperFraction (1, 4);
        ProperFraction pfTimesPF2 = new ProperFraction (3, 8);
        
        assert(pf.size() == 0.5);
        assert(pf.larger(pf) == pf);
        assert(pf.larger(pf, pf2) == pf2);
        assert(pf.times(pf) == pfSquared);
        assert(pf.times(pf, pf2) == pfTimesPF2);
        assert(pf.equals(pf));
        assert(!pf.equals(pf2));
        pf.reduce();
        assert(pf.equals(pf));
        pf.inverts();
        System.out.println(pf.toString());
        pf.inverts();
        System.out.println(pf.toString());
        pf.toMixed();
        System.out.println(pf.toString());
        
        
        //TEST - IMPROPER FRACTIONS
        ImproperFraction iF = new ImproperFraction(2, 1);
        ImproperFraction iF2 = new ImproperFraction(4, 3);
        ImproperFraction iFSquared = new ImproperFraction (4, 1);
        ImproperFraction iFTimesIF2 = new ImproperFraction (8, 3);
        
        assert(iF.size() == 2);
        assert(iF.larger(iF) == iF);
        assert(iF.larger(iF, iF2) == iF2);
        assert(iF.times(iF) == iFSquared);
        assert(iF.times(iF, iF2) == iFTimesIF2);
        assert(iF.equals(iF));
        assert(!iF.equals(iF2));
        iF.reduce();
        assert(iF.equals(iF));
        iF.inverts();
        System.out.println(iF.toString());
        iF.inverts();
        System.out.println(iF.toString());
        iF.toMixed();
        System.out.println(iF.toString());
        
        
        //TEST - MIXED FRACTIONS
        
        MixedFraction mf = new MixedFraction(2, 1, 2);
        MixedFraction mf2 = new MixedFraction(6, 3, 4);
        MixedFraction mfSquared = new MixedFraction (6, 1, 4);
        MixedFraction mfTimesMF2 = new MixedFraction (16, 7, 8);
        
        assert(mf.size() == 2);
        assert(mf.larger(mf) == mf);
        assert(mf.larger(mf, mf2) == mf2);
        assert(mf.times(mf) == mfSquared);
        assert(mf.times(mf, mf2) == mfTimesMF2);
        assert(mf.equals(mf));
        assert(!mf.equals(mf2));
        mf.reduce();
        assert(mf.equals(mf));
        mf.inverts();
        System.out.println(mf.toString());
        mf.inverts();
        System.out.println(mf.toString());
        mf.toImproper();
        System.out.println(mf.toString());
        
    }
    
}
