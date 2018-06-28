
package edu.hdsb.gwss.gillian.ics4u.u5;

/**
 * @author 1johnsongil1
 */
public interface LocksInterface {
    
    public void openLock(int[] attemptedCombo);
    
    public void closeLock();
    
    public boolean isOpen();
            
    public boolean lockedOut();
    
    
    
}
