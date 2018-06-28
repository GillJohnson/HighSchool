
package edu.hdsb.gwss.gillian.ics4u.u5;


/**
 *
 * @author 1johnsongil1
 */
abstract class Lock implements LocksInterface{
    
    // CLASS VARIABLE
    protected static int lastSerialNumber = 0;
    protected static final int MIN = 0;
    
    // OBJECT VARIABLES
    protected int invalidAttempts = 0;
    protected boolean comboSet = false;
    protected int[] combo;
    protected int serialNumber;
    protected int comboSize;
    protected int max;
    protected boolean locked;
    public CombinationGenerator cG;

    public Lock(int max, CombinationGenerator cG) {
        this.cG = cG;
        this.setMax(max);
        lastSerialNumber++;
        this.serialNumber = lastSerialNumber;
    }

    public int getInvalidAttempts() {
        return invalidAttempts;
    }

    protected void setInvalidAttempts(int invalidAttempts) {
        this.invalidAttempts = invalidAttempts;
    }
    
    protected void setComboSize(int comboSize) {
        this.comboSize = comboSize;
    }

    public int getComboSize() {
        return comboSize;
    }
    
    public int getMin() {
        return MIN;
    }

    public int getMax() {
        return max;
    }

    protected void setMax(int max) {
        this.max = max;
    }

    protected void setLocked(boolean locked) {
        this.locked = locked;
    }

    public int[] getCombo() {
        return combo;
    }
    
    @Override
    public void openLock(int[] attemptedCombo) {
        int correctCount = 0;
        if (!this.isOpen()) {
            if (!this.lockedOut()) {
                for (int i = 0; i < this.getComboSize(); i++) {
                    if (attemptedCombo[i] == this.combo[i]) {
                        correctCount++;
                    }
                }
                if (correctCount >= 3) {
                    this.setLocked(false);
                    this.setInvalidAttempts(0);
                } 
                else {
                    this.setInvalidAttempts(this.getInvalidAttempts() + 1);
                }
            }
            else {
                System.out.println("You have exceeded the number of attempts. You have been locked out.");
            }
        }
        else {
            System.out.println("This lock is already open.");
        }
    }

    @Override
    public void closeLock() {
        if (isOpen()) {
            if (comboSet) {
                this.locked = true;
            } else {
                this.locked = false;
            }
        }
        else {
            System.out.println("This lock is already locked");
        }
    }

    @Override
    public boolean isOpen() {
        return !this.locked;
    }

    @Override
    public boolean lockedOut() {
        return this.invalidAttempts == 3;
    }
    
    
}
