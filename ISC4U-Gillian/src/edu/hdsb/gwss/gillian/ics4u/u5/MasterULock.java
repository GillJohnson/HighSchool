
package edu.hdsb.gwss.gillian.ics4u.u5;

/**
 *
 * @author 1johnsongil1
 */
public class MasterULock extends Lock implements ConfigurableLockInterface{

    
    public MasterULock() {
        super(9, new UserCombinationGenerator());
        super.setLocked(true);
        super.setComboSize(4);
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
