/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1johnsongil1
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //CREATING AN ARRAY
        //default values = 0; boolean it would be false
        int [] marks = new int[20];
        
        marks[0] = 12;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        
        //int i
        int marks4[] = new int[marks.length*2];
        
        for (int i  = 0; i < marks.length; i++) {
            marks[i] = (int)(Math.random()*50) + 50;
            System.out.println(marks[i]);
        }
        for (int i  = 0; i < marks.length; i++) {
            marks4[i] = marks[i];
        }
        
        
        
        //name
        int marks1[];
        int marks2[];
        int marks3[];
        
        
        //size
        int size = 12;
        marks = new int[size];
        
        //benefits of arrays
        //one variable name instead of n number of individual variables
        //easy to loop through
        //do not need to declare size right away
        
        //disadvantages of arrays
        //can't change size
        
        
        
        //ARRAYLIST
        //array that can grow or shrink (dynamic array)
        //(wrapper?) for an array
        //uses a lot of space
        //have to know data and where everything is
        //when you remove a beginning array element, every element shifts up one idex
        
        ArrayList data = new ArrayList();
        
        data.add (1);
        data.add("Hello");
        data.add(new Scanner(System.in));
        data.add(2.3);
        
        //Get data
        //without casting the elements come out as an object
        //everything is dervived from an object(a thing)
        //objects have subobjects and they have subobjects
        
        //if you take it out as an integer then you have all the functions of an integer
        //an int is like a fork
        //an Integer is not only a fork but it can have functionality
        //objects = more functionality
        Object z = (Integer) data.get(2);
        
        //nothing you can do with the object (it's a generic container)
        Object o = data.get(2);
        
        //for (int x = 0; x < data.size; x++) {
        //}
        
        
        //Set object types
        ArrayList<String> data1 = new ArrayList();
        
        //arrayList.get
        //gets object reference in array
        
        //arrayList.remove
        //get reference and deletes it from array
        //array name exists in memory but .remove gets rid of it
        
        String t = new String("Hi");
        String s = new String("Bye");
        
        data1.add(t);
        data1.add(s);
        
        //removes first occurence of string
        data.remove("Hi");
        
        Object w = new Object();
        t.equals(s);
        
        //if no new object then String t == String s will be true
        
        //every object has a .equals and a toSring
        for (Object e : data) {
            
        }
        
        
        
    }
    
}
