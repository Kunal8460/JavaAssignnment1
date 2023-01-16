/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg1;

import q1.Rectangle;
import q1.Shape;
import q1.Triangle;

/**
 *
 * @author kunal
 */
public class q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            System.out.println("------Q1-------");
            System.out.println("");

            System.out.println("***Polymorphism***");
            System.out.println("-- Rectangle");
            Rectangle rect = new Rectangle(3.14, 4);
            System.out.println(rect.getArea());
            System.out.println(rect);

            System.out.println("");

            System.out.println("--Triangle");
            Triangle tri = new Triangle(3.14, 4);
            System.out.println(tri.getArea());
            System.out.println(tri);

            System.out.println("");
            System.out.println("***Upcasting***");
            Shape rectShape = new Rectangle(4, 5);
            System.out.println(rectShape.getArea());
            System.out.println(rectShape);

            System.out.println("");
            System.out.println("***Downcasting***");
            Rectangle downCastRect = (Rectangle) rectShape;
            downCastRect.color = "Red";
            System.out.println(downCastRect.ToString());  
            Triangle tri1 = (Triangle) tri;
            System.out.println(tri1.ToString());


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
