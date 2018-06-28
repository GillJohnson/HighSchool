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
public class LinkListClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList();
        Node n = new Node("B");
        Node n2 = new Node("A");
        
        //TEST #1 - EMPTY LINK LIST CASE
        assert(l.size() == 0);
        assert(l.isEmpty());
        assert(l.head() == null);
        assert(l.tail() == null);
        
        
        //TEST #2 - ADD ONE NODE CASE
        
            //CASE #1 - ADD AT END
            l.addAtEnd(n2.getValue());
            assert(l.size() == 1);
            assert(!l.isEmpty());
            assert(l.head() == "A");
            assert(l.tail() == "A");
            
            System.out.println(l.toString());
            l.makeEmpty();

            //CASE #2  - ADD AT FRONT
            System.out.println(l.toString());
            l.addAtFront(n.getValue());
            assert(l.size() == 1);
            assert(!l.isEmpty());
            assert(l.head() == "B");
            assert(l.tail() == "B");
            
            System.out.println(l.toString());
        
        //TEST #3 - ADD MORE THAN ONE NODE CASE
            //CASE 1 - - ADD AT FRONT
            char letter = 'B';
            for( int i = 1; i < 5; i++ ) {
                String s = (char) (letter + i) + "";
                l.addAtFront(s);
                assert (l.size() == i+1);
                assert (!l.isEmpty());
                assert (l.head() == s);
                assert (l.tail() == "B");
                System.out.println(l.toString());
            }
            l.makeEmpty();
            
            //CASE 2 - ADD AT END
            letter = 'B';
            l.addAtFront(letter + "");
            for( int i = 1; i < 5; i++ ) {
                String s = (char) (letter + i) + "";
                l.addAtEnd(s);
                assert (l.size() == i+1);
                assert (!l.isEmpty());
                assert (l.head().equals("B"));
                assert (l.tail() == s);
                System.out.println(l.toString());
            }
        
        
        
        //TEST #4 - REMOVE NODES
        
            //REMOVE TAIL
            letter = 'F';
            int count = 0;
            for( int i = 5; i > 1; i-- ) {
                String s = (char) (letter - count) + "";
                assert(l.removeTail().equals(s));
                assert (l.size() == i-1);
                assert (!l.isEmpty());
                assert (l.head().equals("B"));
                count++;
                assert (l.tail().equals((char)(letter - count) + ""));

                System.out.println(l.toString());
            }

            letter = 'B';
            for( int i = 1; i < 5; i++ ) {
                String s = (char) (letter + i) + "";
                l.addAtEnd(s);
                assert (l.size() == i+1);
                assert (!l.isEmpty());
                assert (l.head().equals("B"));
                assert (l.tail() == s);
                System.out.println(l.toString());
            }
            
            //REMOVE HEAD
            letter = 'B';
            count = 0;
            for( int i = 5; i > 1; i-- ) {
                String s = (char) (letter + count) + "";
                assert(l.removeHead().equals(s));
                assert (l.size() == i-1);
                assert (!l.isEmpty());
                assert (l.head().equals((char)(letter + count+1) + ""));
                count++;
                assert (l.tail().equals("F"));
                System.out.println(l.toString());
            }


            //REMOVE - FIRST OCCURENCE OF STRING

            //CASE #1 - STRING IS NOT IN THE SINGLE NODE LINKEDLIST
            l.remove("B");
            assert (l.size() == 1);
            assert (!l.isEmpty());
            assert (l.head().equals("F"));
            assert (l.tail().equals("F"));

            System.out.println(l.toString());

            //CASE #2 - STRING IS ONLY NODE IN LINKED LIST
            l.remove("F");
            assert (l.size() == 0);
            assert (l.isEmpty());
            assert (l.head() == null);
            assert (l.tail() == null);

            System.out.println(l.toString());

            //CASE #3 - EMPTY LINKEDLIST
            l.remove("B");
            assert (l.size() == 0);
            assert (l.isEmpty());
            assert (l.head() == null);
            assert (l.tail() == null);

            System.out.println(l.toString());

            //CASE #4 - STRING IS AT HEAD
            l.addAtFront("A");
            l.addAtFront("B");
            l.remove("A");
            assert (l.size() == 1);
            assert (!l.isEmpty());
            assert (l.head().equals("B"));
            assert (l.tail().equals("B"));

            System.out.println(l.toString());

            //CASE #5 - STRING IS AT TAIL
            l.addAtEnd("C");
            l.remove("C");
            assert (l.size() == 1);
            assert (!l.isEmpty());
            assert (l.head().equals("B"));
            assert (l.tail().equals("B"));

            System.out.println(l.toString());

            //CASE #6 - STRING IS IN MULTIPLE NODE LINKEDLIST

                //CASE 6A - REMOVE FIRST OCCURRENCE OF STRING
                l.addAtFront("A");
                l.addAtEnd("B");
                l.addAtEnd("C");
                l.remove("B");
                assert (l.size() == 3);
                assert (!l.isEmpty());
                assert (l.head().equals("A"));
                assert (l.tail().equals("C"));

                System.out.println(l.toString());

                //CASE 6B - REMOVE SECOND OCCURRENCE OF STRING
                l.remove("B");
                assert (l.size() == 2);
                assert (!l.isEmpty());
                assert (l.head().equals("A"));
                assert (l.tail().equals("C"));

                System.out.println(l.toString());            

        //TEST #5 - MAKE LINKEDLIST EMPTY
        l.makeEmpty();
        assert(l.isEmpty());
        assert(l.size() == 0);
        assert(l.head() == null);
        assert(l.tail() == null);
        
        System.out.println(l.toString());
            
        
    }
    
}
