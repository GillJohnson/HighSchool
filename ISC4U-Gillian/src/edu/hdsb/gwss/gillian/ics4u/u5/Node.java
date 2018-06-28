/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u5;

/**
 *
 * @author Wm.Muir
 */
public class Node implements NodeInterface{

    public String data;
    private Node next;

    public Node() {
    }

    public Node(String data) {
        this.data = data;
    }
    
    @Override
    public Node getNext() {
        return this.next;
    }

    @Override
    public void setNext(Node newNode) {
        this.next = newNode;
    }

    @Override
    public String getValue() {
        return data;
    }
    

    
}
