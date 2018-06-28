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
public class QueueClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Queue q = new Queue();

        //TEST #1 = EMPTY QUEUE
        assert(q.front() == -1);
        assert(q.back() == -1);
        assert(q.dequeue() == -1);
        assert(q.size() == 0);
        assert(q.capacity() == 10);
        assert(q.isEmpty());
        assert(!q.isFull());
        
        System.out.println(q.toString());
        
        //TEST #2 - ONE ITEM IN QUEUE
        q.enqueue(0);
        assert(q.front() == 0);
        assert(q.back() == 0);
        assert(q.size() == 1);
        assert(q.capacity() == 10);
        assert(!q.isEmpty());
        assert(!q.isFull());
        
        System.out.println(q.toString());
        
        //TEST #2 - FILL QUEUE
        for (int x = 1; q.size() < q.capacity() - 1; x++) {
            q.enqueue(x);
            assert (q.front() == 0);
            assert (q.back() == x);
            assert (q.size() == x+1);
            assert (q.capacity() == 10);
            assert (!q.isEmpty());
            assert (!q.isFull());
            System.out.println(q.toString());
        }
        
        
        // TEST #3 - OVERFLOW QUEUE
        q.enqueue(9);
        assert (q.front() == 0);
        assert (q.back() == 9);
        assert (q.size() == 10);
        assert (q.capacity() == 10);
        assert (!q.isEmpty());
        assert (q.isFull());
        
        System.out.println(q.toString());
        
        q.enqueue(10);
        assert (q.front() == 0);
        assert (q.back() == 9);
        assert (q.size() == 10);
        assert (q.capacity() == 10);
        assert (!q.isEmpty());
        assert (q.isFull());
        
        System.out.println(q.toString());
        
        //TEST #4 - DELETING QUEUE
        for (int x = 1; q.size() > 1; x++) {
            q.dequeue();
            assert (q.front() == x);
            assert (q.back() == 9);
            assert (q.size() == 10 - x);
            assert (q.capacity() == 10);
            System.out.println(q.toString());
        }
        
        //TEST #5 - ADD AND DELETE QUEUE
        q.enqueue(0);
        assert (q.front() == 9);
        assert (q.back() == 0);
        assert (q.size() == 2);
        assert (q.capacity() == 10);
        assert (!q.isEmpty());
        assert (!q.isFull());
        System.out.println(q.toString());
        
        q.enqueue(1);
        assert (q.front() == 9);
        assert (q.back() == 1);
        assert (q.size() == 3);
        assert (q.capacity() == 10);
        assert (!q.isEmpty());
        assert (!q.isFull());
        System.out.println(q.toString());
        
        q.dequeue();
        assert (q.front() == 0);
        assert (q.back() == 1);
        assert (q.size() == 2);
        assert (q.capacity() == 10);
        assert (!q.isEmpty());
        assert (!q.isFull());
        System.out.println(q.toString());
        
        q.enqueue(2);
        assert (q.front() == 0);
        assert (q.back() == 2);
        assert (q.size() == 3);
        assert (q.capacity() == 10);
        assert (!q.isEmpty());
        assert (!q.isFull());
        System.out.println(q.toString());
        
    }
    
}
