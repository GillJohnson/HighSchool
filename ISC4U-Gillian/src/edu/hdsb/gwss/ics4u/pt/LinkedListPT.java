package edu.hdsb.gwss.ics4u.pt;


/**
 * Linked List of Students
 *
 * @version v2018.S2
 */
public class LinkedListPT {

    private NodePT head;
    private NodePT tail;

    /**
     * Constructor: Empty Linked List
     */
    public LinkedListPT() {
        this.head = null;
        this.tail = null;
    }

    /**
     * @return returns the size (# of students) in the linked list.
     */
    public int size() {
        if (isEmpty()) return 0;
        int size = 1;
        for (NodePT n = head; n.getNext() != null; n = n.getNext()) {
            size++;
        }
        return size;
    }

    /**
     * This method makes the linked list empty.
     */
    public void makeEmpty() {
        this.head = null;
        this.tail = null;
    }

    /**
     * This method returns true if the linked list is empty
     *
     * @return returns true if there are no student objects in the linked list
     */
    public boolean isEmpty() {
        if (this.head == null) return true;
        return false;
    }

    /**
     * This method adds a student object to the end of the linked list.
     *
     * @param student
     */
    public void addAtEnd( CSStudent student ) {
        NodePT n = new NodePT(student);
        if(isEmpty()) {
            this.head = n;
            this.tail = n;
        }
        else {
            this.tail.setNext(n);
            this.tail = n;
        }
    }

    /**
     * This method will get a student object from the linked list, given the
     * student number
     *
     * @param key student number (key)
     * @return returns the student object for the given key, or null if it
     * doesn't exist.
     */
    public CSStudent get( int key ) {
        NodePT a = head;
        NodePT b = head.getNext();
        if (this.isEmpty()) {
            return null;
        }
        else if (this.size() == 1) {
            if (a.getData().getStudentNumber()== key) {
                return a.getData();
            }
        }
        else {
            while ((b.getData().getStudentNumber()) != key) {
                if (b.getNext() == null) {
                    return null;
                }
                else {
                    a = a.getNext();
                    b = b.getNext();
                }
            }
            return a.getData();
        }
        return null;
    }
    
    /**
     * This method will remove a student object from the linked list, given the
     * student number.
     *
     * @param key student number (key)
     * @return returns the removed student object, or null if the key is not found
     */
    public CSStudent remove( int key ) {
        CSStudent css = null;
        if (!isEmpty()) {
            switch (this.size()) {
                case 1:
                    if (this.head.getData().getStudentNumber() == key) {
                        css = this.head.getData();
                        this.head = null;
                        this.tail = null;
                    }
                    break;
                case 2:
                    if (this.head.getData().getStudentNumber() == key) {
                        CSStudent oldHead = this.head.getData();
                        NodePT n = this.head;
                        this.head = n.getNext();
                        n.setNext(null);
                        css = oldHead;
                    } 
                    else if (this.tail.getData().getStudentNumber() == key) {
                        CSStudent oldTail = this.tail.getData();
                        NodePT n = this.head;
                        while (n.getNext().getNext() != null) {
                            n = n.getNext();
                        }
                        this.tail = n;
                        this.tail.setNext(null);
                        css = oldTail;
                    }
                    break;
                default:
                    NodePT a = head;
                    NodePT b = head.getNext();
                    while (b.getData().getStudentNumber() != key) {
                        a = a.getNext();
                        b = b.getNext();
                    }   NodePT third = a.getNext().getNext();
                    css = b.getData();
                    a.setNext(third);
                    b.setNext(null);
                    break;
            }
            return css;
        }
        return null;
    }

    /**
     * DONE FOR YOU
     */
    @Override
    public String toString() {
        return "HEAD: " + toString( this.head );
    }

    /**
     * DONE FOR YOU
     */
    private String toString( NodePT n ) {
        String s = "";
        if ( n != null ) {
            s = n.getData() + " --> " + this.toString( n.getNext() );
        }
        return s;
    }

}
