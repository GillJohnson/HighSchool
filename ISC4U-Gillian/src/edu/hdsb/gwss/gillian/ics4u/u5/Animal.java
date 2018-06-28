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
public abstract class Animal {
    private String name;
    private String habitat;
    private String classification;
    private boolean alive;

    public Animal() {
        System.out.println("HERE!");
        this.alive = true;
    }
    
    
    public String speak() {
        return "...takes a breath...";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    
    
}
