/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u5;

import java.util.Objects;

/**
 *
 * @author 1johnsongil1
 */
public class StudentTwo {
    
    String name;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.id;
        hash = 47 * hash + (int) (this.phone ^ (this.phone >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StudentTwo other = (StudentTwo) obj;
        return true;
    }
    int id;
    long phone;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentTwo ali = new StudentTwo();
    }
    
}
