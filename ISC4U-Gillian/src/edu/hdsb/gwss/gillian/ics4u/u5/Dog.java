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
public class Dog extends Animal{

    //CHILD CONSTRUCTOR CALLS PARENT CONSTRUCTOR BEFORE RUNNING CHILD CONSTRUCTOR
    public Dog() {
        this.setName("Dog");
    }

    
    
    @Override
    public String speak() {
        return super.speak() + "Roof!";
    }
    
}
