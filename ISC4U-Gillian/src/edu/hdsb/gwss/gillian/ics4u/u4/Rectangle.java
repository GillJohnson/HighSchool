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
public class Rectangle {
    
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("Invalid radius");
            this.length = 1;
        }
        else {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Invalid radius");
            this.width = 1;
        }
        else {
            this.width = width;
        }
    }

    

    
    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }

    
}
