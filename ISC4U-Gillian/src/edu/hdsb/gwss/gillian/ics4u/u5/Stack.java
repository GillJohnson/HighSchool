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
public class Stack implements StackInterface {

    private static final int DEFAULT_STACK_SIZE = 10;

    private int top;
    private int[] stack;

    public Stack() {
        this(DEFAULT_STACK_SIZE);
    }

    public Stack(int size) {
        this.top = -1;
        this.stack = new int[size];
    }

    public int top() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.stack[this.top];
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        }
        int top = this.stack[this.top];
        this.top--;
        return top;
    }

    public void push(int value) {
        if(!isFull()) {
            this.stack[this.top+1] = value;
            this.top++;
        }
    }

    @Override
    public int size() {
        return this.top + 1;
    }

    @Override
    public int capacity() {
        return stack.length;
    }

    @Override
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if( this.size() == this.capacity() ) return true;
        return false;
    }

    @Override
    public void makeEmpty() {
        this.top = -1;
    }
    
    public String toString() {
        String s = "----------------------------------------------------------------------------------------------------------\n";
        s = s + "\n";
        for (int i = 0; i < this.capacity(); i++) {
            if (i == top) {
                s = s + String.format("%10s", "T");
            } 
            else {
                s = s + String.format("%10s", "");
            }
        }
        s = s + "\n";
        for (int i = 0; i < this.capacity(); i++) {
            s = s + String.format("%10s", this.stack[i]);
        }
        
        return s;
    }

}
