/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author kunal
 */
public class Rectangle extends Shape {

    private double length, breadth;

    public Rectangle(double l, double b) {
        super();
        this.length = l;
        this.breadth = b;
    }

    @Override
    public double getArea() {
        return (this.length * this.breadth);
    }

    @Override
    public String ToString() {
        return "Area of Rectangle = " + (this.length * this.breadth);
    }

}
