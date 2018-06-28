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
public class Queue implements QueueInterface{

    private static final int DEFAULT_QUEUE_SIZE = 10;
    
    private int front;
    private int back;
    private Integer[] queue;

    public Queue() {
        this(DEFAULT_QUEUE_SIZE);
    }

    public Queue(int size) {
        this.front = -1;
        this.back = -1;
        this.queue = new Integer[size];
    }
    
    @Override
    public Integer front() {   
        if(this.isEmpty()) {
            return -1;
        }
        else{
            return this.queue[this.front];
        }
    }

    @Override
    public Integer back() {
        if(this.isEmpty()) {
            return -1;
        }
        else{
            return this.queue[this.back];
        }
    }

    @Override
    public void enqueue(Integer value) {
        if (!this.isFull()) {
            if (this.size() == 0) {
                this.back++;
                this.front++;
            }
            else {
                this.back = (this.back + 1) % DEFAULT_QUEUE_SIZE;
            }
            this.queue[this.back] = value;
        }
        
    }

    @Override
    public Integer dequeue() {
        if(!this.isEmpty()) {
            if (this.front == this.back) {
                this.front = -1;
                this.back = -1;
            }
            else {
                this.front = (this.front + 1) % DEFAULT_QUEUE_SIZE;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        if(isEmpty()) return 0;
        if(this.front == this.back) {
            return 1;
        }
        else if(this.front > this.back) { 
            return DEFAULT_QUEUE_SIZE + this.back - this.front + 1;
        }
        return this.back - this.front + 1;
    }

    @Override
    public int capacity() {
        return queue.length;
    }

    @Override
    public boolean isEmpty() {
        if(this.front == -1) return true;
        else return false;
    }

    @Override
    public boolean isFull() {
        if(this.front > this.back) {
                if (Math.abs(this.front - this.back) == 1) return true;
        }
        else if (this.back == capacity() - 1) {
            if (Math.abs(this.front - this.back) == capacity() - 1) return true;
        }
        return false;
    }

    @Override
    public void makeEmpty() {
        this.front = -1;
        this.back = -1;
    }
    
    public String toString() {
        
        String s = "----------------------------------------------------------------------------------------------------------\n";
        
        for (int i = 0; i < this.capacity(); i++) {
             if (i == front && i == back) {
                 s = s + String.format("%10s", "FB");
             }
             else if (i == front) {
                 s = s + String.format("%10s", "F");
             }
             else if (i == back) {
                 s = s + String.format("%10s", "B");
             }
             else {
                 s = s + String.format("%10s", "");
             }
        }
        s = s + "\n";
        for (int i =0; i < this.capacity(); i++) {
            s = s + String.format("%10s", queue[i]);
        }
        return s;
    }
    
}
