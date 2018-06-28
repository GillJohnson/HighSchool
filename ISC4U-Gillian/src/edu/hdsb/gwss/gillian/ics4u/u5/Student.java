/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u5;

import java.util.Objects;

/**
 *
 * @author Gill_Johnson
 */
public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private long phoneNumber;

    // EMPTY
    public Student() {
        this.firstName = null;
        this.lastName = null;
        this.id = -1;
        this.phoneNumber = -1;
    }
    
    public Student(int id) {
        this.id = id;
    }

    // SECONDARY KEY
    public Student(String firstName, String lastName, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.id = -1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public String toString() {
        String s = "";
        s = s + lastName + ", " + firstName + " - " + id;
        return s;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.firstName);
        hash = 13 * hash + Objects.hashCode(this.lastName);
        hash = 13 * hash + this.id;
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
        final Student other = (Student) obj;
        if (this.id > -1 && other.id > -1 && this.id == other.id) {
            return true;
        }
        if (this.firstName == null || !Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (this.lastName == null || !Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (this.phoneNumber == -1 || !Objects.equals(this.phoneNumber, other.phoneNumber)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
