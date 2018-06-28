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
public class Circle {
    //test question
    //what's the difference between a class and an object?
    //class is a blueprint
    //class does not exist
    //object is an "instance of" class
    //object exists
    //object variable: each object has its own variables
    
    //test question
    //where does this. come from
    //this. references the object variable not parameter
    
    //CLASS CONSTANT
    //if using static it becomes a class or a class constant
    //static means everyone shares
    static String SHAPE_NAME = "CIRCLE";
    
    
    //OBJECT VARIABLE
    private double radius;

    public Circle() {
        System.out.println("A");
    }

    public Circle(double r) {
        this.setRadius(r);
    }

    public static String getSHAPE_NAME() {
        return SHAPE_NAME;
    }

    public static void setSHAPE_NAME(String SHAPE_NAME) {
        Circle.SHAPE_NAME = SHAPE_NAME;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        
        if (radius <= 0) {
            System.out.println("Invalid radius");
            this.radius = 1;
        }
        else {
            this.radius = radius;
        }
    }
    
    
    
    
    double getArea() {
        return 2*Math.PI*this.radius;
    }
    
    double getDiameter() {
        return this.radius *2;
    }
    double getCircumference() {
        return Math.PI*this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    
    
    
}
