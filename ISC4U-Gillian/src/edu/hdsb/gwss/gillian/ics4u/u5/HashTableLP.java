/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u5;

/**
 *
 * @author Gill_Johnson
 */
public class HashTableLP implements HashTableInterface {

    private static final int DEFAULT_HASHTABLE_SIZE = 50;
    public Student[] hashTable;
    private int capacity;
    private int collisions = 0;
    

    public HashTableLP() {
        this( DEFAULT_HASHTABLE_SIZE );
    }

    public HashTableLP(int initialCapacity) {
        if (initialCapacity > 0) {
            int correctCapacity = nextPrimeNumber(initialCapacity);
            hashTable = new Student[correctCapacity];
        }
        else {
            int correctCapacity = nextPrimeNumber(this.DEFAULT_HASHTABLE_SIZE);
            hashTable = new Student[correctCapacity];
        }
        
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < this.hashTable.length; i++) {
            if (this.hashTable[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public int capacity() {
        this.capacity = this.hashTable.length;
        return this.capacity;
    }

    @Override
    public double loadFactor() {
        return ((double) this.size() / (double) this.capacity());
    }

    @Override
    public void makeEmpty() {
        for (int i = 0; i < this.hashTable.length; i++) {
            this.hashTable[i] = null;
        }
    }

    @Override
    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void rehash() {
        Student[] oldHashTable = this.hashTable;
        this.capacity = (int) (this.size() / 0.25);
        this.hashTable = new Student[nextPrimeNumber(this.capacity)];
        for (int i = 0; i < oldHashTable.length; i++) {
            if (oldHashTable[i] != null) {
                this.put(oldHashTable[i].getId(), oldHashTable[i]);
            }
        }
    }

    @Override
    public Student get(int key) {
        if (this.isEmpty()) {
            return null;
        }
        int index = this.hash(key);
            
        while( this.hashTable[index] != null ) { 
            if( this.hashTable[index].getId() == key ) {
                return this.hashTable[index];
            }            
            index = (index+1) % capacity();                                
        }
        return null;
    }

    @Override
    public void put(int key, Student value) {
        if (!this.containsKey(key)) {
            int index = this.hash(key);
            
            while( this.hashTable[index] != null ) {                
                index = (index+1) % capacity();                                
            }
            this.hashTable[index] = value;
            
            if (this.loadFactor() > 0.75) {
                this.rehash();
            }
        }
    }

    @Override
    public boolean contains(Student value) {
        if (isEmpty()) {
            return false;
        }
        if (value.getId() > -1) {
            return containsKey(value.getId());
        } 
        else {
            for (int i = 0; i < this.capacity() - 1; i++) {
                if (this.hashTable[i].equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsKey(int key) {
        if (this.get(key) == null) return false;
        return true;
    }

    @Override
    public int hash(int key) {
        return (key % this.capacity());
    }

    private int nextPrimeNumber(int startNumber) {
        int x;
        for (x = startNumber; isPrime(x) == false; x++) {
        }
        return x;
    }

    private boolean isPrime(int number) {
        if (number == 1) {
            return false;
        } else {
            for (int i = 2; i <= (int) Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public int getCollisions() {
        return collisions;
    }
    
    public String toString() {
        String s = "----------------------------------------------------------------------------------------------------------\n";

        for (int x = 0; x < this.capacity(); x++) {
            if (this.hashTable[x] != null) {
                s = s + String.format("%10s", this.hashTable[x].getFirstName() + " - " + this.hashTable[x].getId());
                s = s + "\n";
            }
            else {
                s = s + String.format("%10s", "EMPTY");
                s = s + "\n";
            }
        }
        return s;
    }
}
