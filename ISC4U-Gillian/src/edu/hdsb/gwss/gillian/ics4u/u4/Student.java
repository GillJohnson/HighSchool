/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u4;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 1johnsongil1
 */
public class Student {

    //CLASS CONSTANTS
    public final static String SCHOOL = "Garth Webb";
        
    //CLASS VARIBALES
    private static int nextId;
        
    //OBJECT / INSTANCE VARIABLE
    private int studentNumber; //Primary key / database
    private String firstName;
    private String lastName;
    private Date dob;
    private int grade;
    
    //private is encapsulation / protect what's inside and accessed through getters and setters

    public Student() {
        this.studentNumber = nextId++;
    }

    public Student(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Student(String firstName, String lastName, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    

    public int getStudentNumber() {
        return studentNumber;
    }

    private void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if( firstName == null || firstName.length() == 0  ) {
            // INVALID!
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
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
        if (this.studentNumber > 0 && this.studentNumber == other.studentNumber) {
            return true;
            //This was changed because we want to reference things by primary key
        }
        if (this.studentNumber != other.studentNumber) {
            return false;
            //This was changed because we want to reference things by primary key
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
//        Student a = new Student( 1 );
//        Student b = new Student( 1 );
//        Student c = new Student( 2 );
//        Student d = a;
//        Student e = a;
//        
//        System.out.println(a == b); // FALSE! DIFFERENT OBJECTS
//        System.out.println(a == d); // TRUE! SAME OBJECT
//        System.out.println(a.equals(b)); // TRUE! SAME ID
//        System.out.println(a.equals(c)); // FALSE! DIFFERENT ID

        Date d = new Date();
        Student a = new Student("Gill", "Last", d);
        a.setFirstName( "123 Easy Street" );
        
        System.out.println( a.toString());
       // System.out.println( b.getStudentNumber() );

        
    }
    
}
