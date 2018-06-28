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
public class StackClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack s = new Stack();
                
        //TEST #1 = EMPTY STACK
        assert(s.top() == -1);
        assert(s.pop() == -1);
        assert(s.size() == 0);
        assert(s.capacity() == 10);
        assert(s.isEmpty());
        assert(!s.isFull());
        
        System.out.println(s.toString());
        
        // TEST #2 - FILL STACK
        for(int x = 0; s.size() < s.capacity()-1; x++) {
            s.push(x);
            assert(s.top() == x);
            assert(s.size() == x+1);
            assert(s.capacity() == 10);
            assert(!s.isEmpty());
            assert(!s.isFull());
            System.out.println(s.toString());
        }
       
        // TEST #3 - OVERFLOW STACK.
        s.push(9);
        assert (s.top() == 9);
        assert (s.size() == 10);
        assert (s.capacity() == 10);
        assert (!s.isEmpty());
        assert (s.isFull());
        System.out.println(s.toString());
        
        s.push(10);
        assert (s.top() == 9);
        assert (s.size() == 10);
        assert (s.capacity() == 10);
        assert (!s.isEmpty());
        assert (s.isFull());
        System.out.println(s.toString());
        
        //TEST #4 - EMPTYING STACK
        for(int x = 9; s.size() > 1; x--) {
            s.pop();
            assert(s.top() == x-1);
            assert(s.size() == x);
            assert(s.capacity() == 10);
            assert(!s.isEmpty());
            assert(!s.isFull());
            System.out.println(s.toString());
        }
        
    }
    
}
