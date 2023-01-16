/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package q5_and_q2;

import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;

/**
 *
 * @author kunal
 */
public class NewJFrame extends javax.swing.JFrame {

    static Connection con = null;
    int customerId;
    ArrayList<Customers> customers = new ArrayList<Customers>();

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        PopulateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableScroll = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        labeladdress = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblcontact = new javax.swing.JLabel();
        labeladdress2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextPane();
        labelbcontact = new javax.swing.JLabel();
        txtbcontact = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtbaddress = new javax.swing.JTextPane();
        faxno = new javax.swing.JLabel();
        txtfax = new javax.swing.JTextField();
        txtpager = new javax.swing.JTextField();
        labelpager = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        maritialStatus = new javax.swing.JComboBox<>();
        lblincome = new javax.swing.JLabel();
        txtincome = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        lblchildren = new javax.swing.JLabel();
        txtchildren = new javax.swing.JTextField();
        formeditbtn = new javax.swing.JButton();
        formbtndelete = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        addbtn = new javax.swing.JMenu();
        editbtn = new javax.swing.JMenu();
        btndelete = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableScroll.setName(""); // NOI18N

        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Name", "Address", "Contact no.", "Business Address", "Business Contact no.", "Fax no.", "Pager no.", "Maritial Status", "No. of Children", "Annual Income"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataTableMouseClicked(evt);
            }
        });
        tableScroll.setViewportView(DataTable);

        labeladdress.setText("Address");

        jLabel2.setText("Name");

        lblcontact.setText("Contact No.");

        labeladdress2.setText("Business Address");

        jScrollPane3.setViewportView(txtaddress);

        labelbcontact.setText("Business Contact No.");

        jScrollPane4.setViewportView(txtbaddress);

        faxno.setText("Fax  no.");

        labelpager.setText("Pager no.");

        jLabel1.setText("Maritial Status");

        maritialStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "Married", "Unmarried" }));

        lblincome.setText("Annual Income");

        btnsave.setBackground(new java.awt.Color(204, 204, 204));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        lblchildren.setText("No. of Children");

        formeditbtn.setText("Edit");
        formeditbtn.setEnabled(false);
        formeditbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formeditbtnMouseClicked(evt);
            }
        });

        formbtndelete.setText("Delete");
        formbtndelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formbtndeleteMouseClicked(evt);
            }
        });

        menubar.setBackground(new java.awt.Color(0, 204, 204));
        menubar.setAlignmentX(20.0F);
        menubar.setMargin(new java.awt.Insets(0, 20, 0, 20));
        menubar.setPreferredSize(new java.awt.Dimension(70, 40));

        addbtn.setText("Add");
        addbtn.setIconTextGap(10);
        addbtn.setMargin(new java.awt.Insets(3, 20, 3, 20));
        menubar.add(addbtn);

        editbtn.setText("Edit");
        editbtn.setAlignmentX(50);
        editbtn.setMargin(new java.awt.Insets(3, 20, 3, 20));
        editbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbtnMouseClicked(evt);
            }
        });
        menubar.add(editbtn);

        btndelete.setText("Delete");
        btndelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleteMouseClicked(evt);
            }
        });
        menubar.add(btndelete);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(txtcontact))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(labeladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(86, 86, 86)
                                        .addComponent(jScrollPane3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(98, 98, 98)
                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelbcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblincome, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtbcontact, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                            .addComponent(txtincome))))
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelpager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(faxno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labeladdress2)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                    .addComponent(lblchildren, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtfax)
                                    .addComponent(jScrollPane4)
                                    .addComponent(txtpager)
                                    .addComponent(maritialStatus, 0, 215, Short.MAX_VALUE)
                                    .addComponent(txtchildren)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(formeditbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(formbtndelete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faxno)
                    .addComponent(txtfax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(labeladdress))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeladdress2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcontact)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelpager)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelbcontact)
                    .addComponent(jLabel1)
                    .addComponent(maritialStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblincome)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblchildren)
                        .addComponent(txtchildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formeditbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formbtndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        AddCustomerData();
//        PopulateData();
    }//GEN-LAST:event_btnsaveActionPerformed
    private void DataTableActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void DataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataTableMouseClicked

        // TODO add your handling code here:
//        System.out.println(DataTable.getSelectedRow());
//        System.out.println(DataTable.getSelectedColumn());
        customerId = Integer.parseInt(DataTable.getValueAt(DataTable.getSelectedRow(), 0).toString());
        System.out.println(customerId);

    }//GEN-LAST:event_DataTableMouseClicked

    private void editbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtnMouseClicked
        // TODO add your handling code here:
        formeditbtn.setEnabled(true);
        btnsave.setEnabled(false);
        formbtndelete.setEnabled(false);
        PreparedStatement ptst;
        try {
            String sql = "Select * from customerdetails where customerId = " + customerId;
            ptst = con.prepareStatement(sql);
            ptst.executeQuery();
            ResultSet rs = ptst.getResultSet();
            while (rs.next()) {
                txtname.setText(rs.getString("name"));
                txtaddress.setText(rs.getString("address"));
                txtcontact.setText(rs.getString("contactno"));
                txtbaddress.setText(rs.getString("businessAddress"));
                txtbcontact.setText(rs.getString("businessContactno"));
                txtfax.setText(rs.getString("faxno"));
                txtchildren.setText(String.valueOf(rs.getInt("noofchildren")));
                txtincome.setText(rs.getString("annualIncome"));
                txtpager.setText(rs.getString("pagerno"));
                maritialStatus.setSelectedItem(rs.getString("maritialStatus"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editbtnMouseClicked

    private void formeditbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formeditbtnMouseClicked
        // TODO add your handling code here:
        try {
            String sql = "update customerdetails set name = '" + txtname.getText() + "', address =  '" + txtaddress.getText() + "',contactno =  '" + txtcontact.getText() + "', businessAddress = '" + txtbaddress.getText() + "', businessContactno = '" + txtbcontact.getText() + "', faxno = '" + txtfax.getText() + "',pagerno =  '" + txtpager.getText() + "',maritialStatus =  '" + maritialStatus.getSelectedItem() + "', noofchildren = " + txtchildren.getText() + " , annualIncome =  '" + txtincome.getText() + "' where customerId = " + customerId;
            PreparedStatement ptst = con.prepareStatement(sql);
            ptst.executeUpdate();
            RefreshTable();
            EmptyFields();
            formeditbtn.setEnabled(false);
            btnsave.setEnabled(true);
            btndelete.setEnabled(false);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_formeditbtnMouseClicked

    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked
        // TODO add your handling code here:
        formeditbtn.setEnabled(false);
        btnsave.setEnabled(false);
        formbtndelete.setEnabled(true);
        PreparedStatement ptst;
        try {
            String sql = "Select * from customerdetails where customerId = " + customerId;
            ptst = con.prepareStatement(sql);
            ptst.executeQuery();
            ResultSet rs = ptst.getResultSet();
            while (rs.next()) {
                txtname.setText(rs.getString("name"));
                txtaddress.setText(rs.getString("address"));
                txtcontact.setText(rs.getString("contactno"));
                txtbaddress.setText(rs.getString("businessAddress"));
                txtbcontact.setText(rs.getString("businessContactno"));
                txtfax.setText(rs.getString("faxno"));
                txtchildren.setText(String.valueOf(rs.getInt("noofchildren")));
                txtincome.setText(rs.getString("annualIncome"));
                txtpager.setText(rs.getString("pagerno"));
                maritialStatus.setSelectedItem(rs.getString("maritialStatus"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndeleteMouseClicked

    private void formbtndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formbtndeleteMouseClicked
        // TODO add your handling code here:
         try{
            PreparedStatement ptst = con.prepareStatement("Delete from customerdetails where customerid = " + customerId);
            ptst.executeUpdate();
            var res = ptst.getResultSet();
            RefreshTable();
            EmptyFields();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_formbtndeleteMouseClicked

    private void RefreshTable() {
        DefaultTableModel table = new DefaultTableModel();
        table = (DefaultTableModel) DataTable.getModel();
        table.setRowCount(0);
        PopulateData();
    }

    private void EmptyFields() {
        txtname.setText("");
        txtaddress.setText("");
        txtcontact.setText("");
        txtbaddress.setText("");
        txtbcontact.setText("");
        txtfax.setText("");
        txtchildren.setText("");
        txtincome.setText("");
        txtpager.setText("");
        maritialStatus.setSelectedIndex(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdb", "root", "");

            if (!con.isClosed()) {
                System.out.println("Connection established");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    private void AddCustomerData() {

        String sql = "insert into customerdetails "
                + "(customerid, name, address, contactno, businessAddress, businessContactno, faxno, pagerno, maritialStatus,noofchildren, annualIncome) " + "VALUES " + "(NULL,'" + txtname.getText() + "', '" + txtaddress.getText() + "', '" + txtcontact.getText() + "', '" + txtbaddress.getText() + "', '" + txtbcontact.getText() + "', '" + txtfax.getText() + "', '" + txtpager.getText() + "', '" + maritialStatus.getSelectedItem() + "'," + txtchildren.getText() + " ," + txtincome.getText() + ")";
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            RefreshTable();
            EmptyFields();
            Customers customer = new Customers();
            customer.name = txtname.getText();
            customer.address = txtaddress.getText();
            customer.contactno = txtcontact.getText();
            customer.bcontact = txtbcontact.getText();
            customer.baddress = txtbaddress.getText();
            customer.faxno = txtfax.getText();
            customer.noofchildren = Integer.parseInt(txtchildren.getText());
            customer.pagerno = txtpager.getText();
            customer.maritialStatus = maritialStatus.getSelectedItem().toString();
            customers.add(customer);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void PopulateData() {
        DefaultTableModel table = new DefaultTableModel();
        table = (DefaultTableModel) DataTable.getModel();
        String sql = "select * from customerdetails";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeQuery();
            ResultSet rs = pstm.getResultSet();

            while (rs.next()) {
                Customers customer = new Customers();
                Vector data = new Vector();
                data.add(rs.getInt("customerid"));
                customer.customerId = rs.getInt("customerid");
                data.add(rs.getString("name"));
                customer.name = rs.getString("name");
                data.add(rs.getString("address"));
                customer.address = rs.getString("address");
                data.add(rs.getString("contactno"));
                customer.contactno = rs.getString("contactno");
                data.add(rs.getString("businessAddress"));
                customer.baddress = rs.getString("businessAddress");
                data.add(rs.getString("businessContactno"));
                customer.bcontact = rs.getString("businessContactno");
                data.add(rs.getString("faxno"));
                customer.faxno = rs.getString("faxno");
                data.add(rs.getString("pagerno"));
                customer.pagerno = rs.getString("pagerno");
                data.add(rs.getString("maritialStatus"));
                customer.maritialStatus = rs.getString("maritialStatus");
                data.add(rs.getInt("noofchildren"));
                customer.noofchildren = rs.getInt("noofchildren");
                data.add(rs.getInt("annualIncome"));
                customer.annualIncome = rs.getString("annualIncome");
                table.addRow(data);
                customers.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DataTable;
    private javax.swing.JMenu addbtn;
    private javax.swing.JMenu btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JMenu editbtn;
    private javax.swing.JLabel faxno;
    private javax.swing.JButton formbtndelete;
    private javax.swing.JButton formeditbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labeladdress;
    private javax.swing.JLabel labeladdress2;
    private javax.swing.JLabel labelbcontact;
    private javax.swing.JLabel labelpager;
    private javax.swing.JLabel lblchildren;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblincome;
    private javax.swing.JComboBox<String> maritialStatus;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JTextPane txtaddress;
    private javax.swing.JTextPane txtbaddress;
    private javax.swing.JTextField txtbcontact;
    private javax.swing.JTextField txtchildren;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtfax;
    private javax.swing.JTextField txtincome;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpager;
    // End of variables declaration//GEN-END:variables
}

class Customers {

    public int customerId;
    public String name;
    public String address;
    public String contactno;
    public String baddress;
    public String bcontact;
    public String faxno;
    public String pagerno;
    public int noofchildren;
    public String annualIncome;
    public String maritialStatus;
}
