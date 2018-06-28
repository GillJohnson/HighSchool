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
public class LinkedList implements LinkListInterface{

    Node head;
    Node tail;
    
    public LinkedList() {
    }

    @Override
    public int size() {
        if (isEmpty()) return 0;
        int size = 1;
        for (Node n = head; n.getNext() != null; n = n.getNext()) {
            size++;
        }
        return size;
    }

    @Override
    public void makeEmpty() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean isEmpty() {
        if (this.head == null) return true;
        return false;
    }

    @Override
    public void addAtFront(String str) {
        Node n = new Node(str);
        if(isEmpty()) {
            this.head = n;
            this.tail = n;
        }
        else {
            n.setNext(head);
            this.head = n;
        }
    }

    @Override
    public void addAtEnd(String str) {
        Node n = new Node(str);
        if(isEmpty()) {
            this.head = n;
            this.tail = n;
        }
        else {
            this.tail.setNext(n);
            this.tail = n;
        }
    }

    @Override
    public void remove(String str) {
        if (!isEmpty()) {
            switch (this.size()) {
                case 1:
                    if (this.head.getValue().equals(str)) {
                        this.head = null;
                        this.tail = null;
                    }   break;
                case 2:
                    if (this.head.getValue().equals(str)) {
                        removeHead();
                    } else if (this.tail.getValue().equals(str)) {
                        removeTail();
                    }   break;
                default:
                    Node a = head;
                    Node b = head.getNext();
                    while (!b.getValue().equals(str)) {
                        a = a.getNext();
                        b = b.getNext();
                    }   Node third = a.getNext().getNext();
                    a.setNext(third);
                    b.setNext(null);
                    break;
            }
        }
    }

    @Override
    public String removeHead() {
        String oldHead = this.head.getValue();
        if (isEmpty()) return null;
        else if (this.size() == 1) {
            this.head = null;
            this.tail = null;
        }
        else {
            Node n = this.head;
            this.head = n.getNext();
            n.setNext(null);
        }
        return oldHead;
    }

    @Override
    public String removeTail() {
        String oldTail = this.tail.getValue();
        if (isEmpty()) return null;
        else if (this.size() == 1) {
            this.tail = null;
            this.head = null;
        }
        else {
            Node n = this.head;
            while (n.getNext().getNext() != null) {
                n = n.getNext();
            }
            this.tail = n;
            this.tail.setNext(null);
        }
        
        return oldTail;
    }

    @Override
    public String head() {
        if (isEmpty()) return null;
        return this.head.getValue();
    }

    @Override
    public String tail() {
        if (isEmpty()) return null;
        return this.tail.getValue();
    }
    
    @Override
    public String toString( ) {
        if (isEmpty()) return null;
        String linkList = "";
        for (Node n = head; n.getNext() != null; n = n.getNext()) {
            linkList = linkList + n.getValue();
        }
        linkList = linkList + this.tail();
        return linkList;
    }
    
}
