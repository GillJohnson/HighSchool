
package edu.hdsb.gwss.gillian.ics4u.u5;

/**
 *
 * @author 1johnsongil1
 */
public class AndroidLock extends Lock implements ConfigurableLockInterface{

    
    public AndroidLock( ) {
        super(9, new UserCombinationGenerator());
        super.setComboSize(3);
        super.setLocked(false);
        combo = new int[super.getComboSize()];
    }
    
    @Override
    public void setCombo() {
        if (this.isOpen()) {
            combo = cG.getCombo(max, this.getComboSize());
        }
        super.comboSet = true;
    }
}
