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
public class LocksClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] testCombo = new int[3];
        testCombo[0] = 1;
        testCombo[1] = 2;
        testCombo[2] = 3;
        
        int[] testCombo2 = new int[4];
        testCombo2[0] = 1;
        testCombo2[1] = 2;
        testCombo2[2] = 3;
        testCombo2[3] = 4;
        int[] testCombo3 = new int[4];
        
        //COMBINATION GENERATOR TESTS
            
            //CASE #1 - RANDOM COMBINATION GENERATOR
            CombinationGenerator randomCG = new RandomCombinationGenerator();
            int comboNumber;
            for (int x = 0; x < 10; x++) {
                for (int i = 0; i < 3; i++) {
                    comboNumber = (randomCG.getCombo(20, 3))[i];
                    assert (comboNumber <= 20);
                }
            }
            for (int x = 0; x < 10; x++) {
                for (int i = 0; i < 4; i++) {
                    comboNumber = (randomCG.getCombo(20, 4))[i];
                    assert(comboNumber <= 20);
                }
            }

            //CASE #2 - USER COMBINATION GENERATOR
            CombinationGenerator userCG = new UserCombinationGenerator();
            int[] userCombo = userCG.getCombo(20, 3);
            for(int i = 0; i < 3; i++) {
                assert(userCombo[i] == i);
            }
        
        
        // MASTER LOCK TESTS
        MasterLock ml = new MasterLock();
        int[] comboML = ml.getCombo();
        assert (!ml.isOpen());
        ml.closeLock();
        assert (!ml.isOpen());
        ml.openLock(comboML);
        assert(ml.isOpen());
        ml.closeLock();
        ml.openLock(testCombo);
        assert(!ml.isOpen());
        ml.closeLock();
        assert(!ml.isOpen());
        assert(!ml.lockedOut());
        
            //LOCKED OUT
            ml.openLock(testCombo);
            assert(!ml.isOpen());
            ml.openLock(testCombo);
            assert(!ml.isOpen());
            assert(ml.lockedOut());
            ml.openLock(comboML);
            assert(!ml.isOpen());
        
        
        //DUBDLEY LOCK TESTS
        DubdlyLock dl = new DubdlyLock();
        int[] comboDL = dl.getCombo();
        assert(!dl.isOpen());
        dl.closeLock();
        dl.openLock(comboDL);
        assert(dl.isOpen());
        dl.closeLock();
        dl.openLock(testCombo);
        assert(!dl.isOpen());
        dl.closeLock();
        assert(!dl.isOpen());
         
        //MASTERU LOCK TESTS
        MasterULock mul = new MasterULock();
        assert(!mul.isOpen());
        mul.closeLock();
        mul.openLock(testCombo2);
        assert(!mul.isOpen());
        mul.openLock(testCombo3);
        assert(mul.isOpen());
        mul.setCombo();
        int[] comboMUL = mul.getCombo();
        mul.openLock(comboMUL);
        assert(mul.isOpen());
        mul.closeLock();
        assert(!mul.isOpen());
        
        //ANDROID LOCK TESTS
        AndroidLock al = new AndroidLock();
        assert(al.isOpen());
        al.closeLock();
        assert(al.isOpen());
        al.openLock(testCombo);
        assert(al.isOpen());
        al.setCombo();
        int[] comboAL = al.getCombo();
        al.closeLock();
        al.openLock(comboAL);
        assert(al.isOpen());
        al.closeLock();
        assert(!al.isOpen());
                
    }
    
}
