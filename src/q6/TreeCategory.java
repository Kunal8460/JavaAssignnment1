/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q6;

import java.sql.*;
import java.util.*;

/**
 *
 * @author kunal
 */
public class TreeCategory {

    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdb", "root", "");
            if (!con.isClosed()) {
                System.out.println("Connection Established");
                System.out.println("");
            } else {
                System.out.println("Connecction Failed");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            PreparedStatement stmt = con.prepareStatement("select * from categorymaster");
            ResultSet cat = stmt.executeQuery();
            int rows = 0;
            while (cat.next()) {
                rows += 1;
                int pid = cat.getInt("categoryId");
                String ParentCategory = cat.getString("categoryName");
                PreparedStatement temp = con.prepareStatement("select * from categorymaster where parentCategory = " + pid);
                ResultSet subcat = temp.executeQuery();
                System.out.println("Parent Category : " + ParentCategory);
                while (subcat.next()) {
                    System.out.println("Child Category : " + subcat.getString("categoryName"));
                }

                System.out.println("");
            }

            while (cat.next()) {

            }
        } catch (Exception ex) {
            System.out.println(ex);;
        }
    }

}
