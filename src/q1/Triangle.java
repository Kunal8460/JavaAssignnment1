/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author kunal
 */
public class Triangle extends Shape {

    private double length, height;

    public Triangle(double l, double h) {
        super();
        this.length = l;
        this.height = h;
    }

    @Override
    public double getArea() {
        return (this.length * this.height);
    }

    @Override
    public String ToString() {
        return "Area of Triangle = " + (this.length * this.height);
    }

}
