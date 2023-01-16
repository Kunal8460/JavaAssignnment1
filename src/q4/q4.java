/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q4;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author kunal
 */
class TableException extends Exception {

    public TableException(String error) {
        super(error);
    }
}

public class q4 {

    static Frame frame = new Frame();
    static DataTable dt = new DataTable();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int colorPick;
        try {
            System.out.println("Hellooo");
            frame.setBounds(5, 10, 1200, 800);
            System.out.println("Enter number of rows: ");
            dt.rows = sc.nextInt();
            System.out.println("Enter number of columns");
            dt.cols = sc.nextInt();
            String[] columns = new String[dt.cols];
            for (int i = 0; i < dt.cols; i++) {
                columns[i] = "Col" + i;
//                System.out.println(columns[i]);
            }
            String[][] data = new String[dt.rows][dt.cols];
            for (int row = 0; row < dt.rows; row++) {
                for (int col = 0; col < dt.cols; col++) {
                    data[row][col] = "Item" + row + col;
//                    System.out.println(data[row][col]);
                }
//                System.out.println("");
            }
            JTable table = new JTable(data, columns);

//            if (dt.rows > 200 || dt.cols > 200) {
//                throw new TableException("Table row/column cannot exceed more than 200");
//            }
            System.out.println("Enter Foreground color");
            do {
                System.out.println("1. Black");
                System.out.println("2. Blue");
                System.out.println("3. Red");
                System.out.println("4. White");
                System.out.println("5. Cyan");
                System.out.println("Choose Font Color");
                colorPick = sc.nextInt();
                switch (colorPick) {
                    case 1:
                        dt.foreground = "Black";
                        table.setForeground(Color.BLACK);
                        break;
                    case 2:
                        dt.foreground = "Blue";
                        table.setForeground(Color.BLUE);
                        break;
                    case 3:
                        dt.foreground = "Red";
                        table.setForeground(Color.RED);
                        break;
                    case 4:
                        dt.foreground = "White";
                        table.setForeground(Color.WHITE);
                        break;
                    case 5:
                        dt.foreground = "Cyan";
                        table.setForeground(Color.CYAN);
                        break;
                    default:
                        break;
                }
            } while (colorPick > 5);

            System.out.println("Enter Bakcground Color");
            do {
                System.out.println("1. Black");
                System.out.println("2. Blue");
                System.out.println("3. Red");
                System.out.println("4. White");
                System.out.println("5. Cyan");
                System.out.println("Choose Bakcground Color");
                colorPick = sc.nextInt();
                switch (colorPick) {
                    case 1:
                        dt.foreground = "Black";
                        table.setBackground(Color.BLACK);
                        break;
                    case 2:
                        dt.foreground = "Blue";
                        table.setBackground(Color.BLUE);
                        break;
                    case 3:
                        dt.foreground = "Red";
                        table.setBackground(Color.RED);
                        break;
                    case 4:
                        dt.foreground = "White";
                        table.setBackground(Color.WHITE);
                        break;
                    case 5:
                        dt.foreground = "Cyan";
                        table.setBackground(Color.CYAN);
                        break;
                    default:
                        break;
                }
            } while (colorPick > 5);

//            Hashtable<String, String> tableData = new Hashtable<>();
//            tableData.put("rows", String.valueOf(dt.rows));
//            tableData.put("cols", String.valueOf(dt.cols));
//            tableData.put("color", dt.color);
//            table.setFont(new Font("Serif", 24));
            table.setBounds(50, 100, 200, 300);
            JScrollPane sp = new JScrollPane(table);
            frame.add(sp);
            frame.setVisible(true);
            table.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
