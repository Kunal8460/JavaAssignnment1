/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q4;

import java.util.*;

/**
 *
 * @author kunal
 */
public class DataTable implements Featurable {

    protected String foreground, background, fontStyle,fontWeight, color;
    protected int cols,rows,fontSize;

    @Override
    public void foreground(String forgroundValue) {

        System.out.println("foreground");
    }

    @Override
    public void font(String fontValue) {
        System.out.println("font");
    }

    @Override
    public void background(String backgroundValue) {
        System.out.println("background");
    }

}
