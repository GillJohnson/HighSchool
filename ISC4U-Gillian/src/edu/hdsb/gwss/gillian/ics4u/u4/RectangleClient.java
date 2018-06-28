/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u4;

/**
 *
 * @author 1johnsongil1
 */
public class RectangleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle rectangleA = new Rectangle( 5, 12 );
        Rectangle rectangleB = new Rectangle( 12, 5 );
        
        rectangleA.setLength( -1234 );
        
        System.out.println( rectangleA.getLength());
        System.out.println( rectangleA.getWidth());
      
        
        
        System.out.println( rectangleA.toString() );
        
        System.out.println(Math.sqrt( -4 ) );
        
        
    }
    
}
