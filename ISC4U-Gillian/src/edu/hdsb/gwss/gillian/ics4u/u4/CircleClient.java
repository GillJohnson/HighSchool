/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.gillian.ics4u.u4;

import java.util.ArrayList;

/**
 *
 * @author 1johnsongil1
 */
public class CircleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        String name = new String();
//        
//        Circle a = new Circle();
//        a.SHAPE_NAME = "A";
//        Circle b = new Circle();
//        b.SHAPE_NAME = "B";
//        Circle c = new Circle();
//        c.SHAPE_NAME = "C";
//        
//        System.out.println(a.SHAPE_NAME);
//        System.out.println(b.SHAPE_NAME);
//        System.out.println(c.SHAPE_NAME);

        Circle a = new Circle();
        Circle b = new Circle(4);
        b.setRadius( -12 );
        
        //OBJECT A
        System.out.println(a.SHAPE_NAME);
        System.out.println(a.getRadius());
        
        //OBJECT B
        System.out.println(b.SHAPE_NAME);
        System.out.println(b.getRadius());
        

        System.out.println( a.toString() );
          System.out.println( b.toString() );
    }
    
}
