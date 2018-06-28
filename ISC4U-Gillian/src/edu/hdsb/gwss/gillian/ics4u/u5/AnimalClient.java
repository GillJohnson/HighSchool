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
public class AnimalClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cat c = new Cat();
        Dog d = new Dog();
        Fish f = new Fish();
        
        System.out.println(c.isAlive());
        System.out.println(d.isAlive());
        
        System.out.println(c.speak());
        System.out.println(d.speak());
        System.out.println(f.speak());
        
    }
    
}
