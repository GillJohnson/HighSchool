package edu.hdsb.gwss.gillian.ics4u.u5;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gill_Johnson
 */
public class StudentHashTableClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashTableLP ht = new HashTableLP();
        Student bob = new Student("bob", "bob", 0000);
        
        
        //TEST #1 - EMPTY HASHTABLE
        assert(ht.size() == 0);
        assert(ht.capacity() == 53);
        assert(ht.loadFactor() == 0.0);
        assert(ht.isEmpty());
        assert(ht.get(0) == null);
        assert(!ht.contains(bob));
        assert(!ht.containsKey(bob.getId()));
        
        System.out.println(ht.toString());
        
        //TEST #2 - ADD STUDENTS TO HASHTABLE
        Student student;
        char fName = 'A';
        char lName = 'A';
        int letterCount = 'A';
        int id;
        int seed = 1;
        int number = 0000;
        for (int i = 0; i < 0.75*ht.capacity() - 1; i++) {
            if (letterCount == 'Z') {
                fName = 'H';
                lName = 'H';
                letterCount = 1;
            }
            String fn = (char) (fName + i) + "";
            String ln = (char) (lName + i) + "";
            number++;
            student = new Student(fn, ln, number);
            id = i + seed * 11;
            student.setId(id);
            System.out.println("Collision Count: " + ht.getCollisions());
            System.out.println("Load Factor: " + ht.loadFactor());
            ht.put(id, student);
            System.out.println("ADDED:" + student.toString());   
            assert (ht.size() == i+1);
            assert (ht.capacity() == 53);
            assert (ht.loadFactor() == ((double) (i+1)) / 53.0);
            assert (!ht.isEmpty());
            assert (ht.contains(student));
            assert( ht.containsKey(id) );
            assert( student.equals( ht.get(id) ) );
            seed++;
            letterCount++;
        }
        System.out.println(ht.toString());
        


        //TEST #5 - REHASH HASHTABLE
        Student overBoard = new Student(1000);
        System.out.println("Collision Count: " + ht.getCollisions());
        System.out.println("Load Factor: " + ht.loadFactor());
        ht.put(1000, overBoard);
        System.out.println("ADDED:" + overBoard.toString()); 
        assert (ht.size() == 40);
        assert (ht.capacity() == 163);
        assert (ht.loadFactor() == (double) 40 / (double) 163);
        assert (!ht.isEmpty());
        assert (ht.contains(overBoard));
        assert (ht.containsKey(1000));

        System.out.println(ht.toString());

        
        
    }
    
}
