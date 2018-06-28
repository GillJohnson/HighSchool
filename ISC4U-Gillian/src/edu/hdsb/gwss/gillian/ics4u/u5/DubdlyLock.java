
package edu.hdsb.gwss.gillian.ics4u.u5;

/**
 *
 * @author 1johnsongil1
 */
public class DubdlyLock extends Lock{

    
    public DubdlyLock() {
        super(59, new RandomCombinationGenerator());
        super.setLocked(true);
        super.setComboSize(3);
        combo = new int[super.getComboSize()];
        this.setCombo(super.getMax(), super.cG);
        super.comboSet = true;
    }
    
    private void setCombo(int max, CombinationGenerator cG) {
        combo = cG.getCombo(max, this.getComboSize());
    }
    
}
