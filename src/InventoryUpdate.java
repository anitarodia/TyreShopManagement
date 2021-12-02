
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Animesh
 */
public class InventoryUpdate extends javax.swing.JFrame {
    double cp,pp,sp;

    /**
     * Creates new form InventoryUpdate
     */
    public InventoryUpdate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Brand", "Product Name", "Product Type", "Cost Price", "Profit Percentage", "Quantity", "Selling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setFillsViewportHeight(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField5.setEditable(false);

        jLabel8.setText("Product Brand");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ceat", "Goodyear", "MRF", "Apollo", "Michelin", "Bridgestone", "JK", "ELF Lubricant", "Castrol Lubricant", "Valvoline Lubricant", "Gulf Lubricant" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Product Name");

        jLabel7.setText("Product Type");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Tyre (Other than rear Tractor Tyre)", "Rear Tractor Tyre", "Tube(Other than rear Tractor Tyre)", "Tube of Rear Tractor Tyre", "Lubricant" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Cost Price (₹) ");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel4.setText("Profit (%)");

        jLabel11.setText("Quantity");

        jLabel5.setText("Selling Price (₹)");

        jLabel12.setText("Product Code");

        jButton1.setText("Update Product Brand");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update Product Name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update Product Type");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update Cost Price &  Profit Percentage");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Update Quantity");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Delete This Product");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Close");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel12)))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField3)
                                        .addComponent(jTextField4)
                                        .addComponent(jTextField2)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jButton7)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        
   DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         MainClass mc = new MainClass();
        // Clear the existing table
        int rows = model.getRowCount();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        // SQL Query
        String query = "SELECT * FROM INVENTORY ";
        try {
           
            Connection con = (Connection)
            DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String sno = rs.getString("SR_NO");
                String pbrand = rs.getString("ProductBrand");
                String pname = rs.getString("ProductName");
                String ptype = rs.getString("ProductType");
                String cp = rs.getString("Cost_price");
                String pp = rs.getString("Profit_percent");
                String qty = rs.getString("Quantity");
                String sp = rs.getString("Selling_Price");
                
                model.addRow(new Object[] {sno, pbrand, pname, ptype, cp, pp, qty, sp});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
  
    }//GEN-LAST:event_formWindowGainedFocus

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        jTextField5.setText(jTable1.getModel().getValueAt(row, 0).toString());
        jTextField1.setText(jTable1.getModel().getValueAt(row, 2).toString());
        jTextField2.setText(jTable1.getModel().getValueAt(row, 4).toString());
        jTextField3.setText(jTable1.getModel().getValueAt(row, 5).toString());
        jTextField4.setText(jTable1.getModel().getValueAt(row, 6).toString());
        jLabel6.setText(jTable1.getModel().getValueAt(row, 7).toString());
        
        String brand = jTable1.getModel().getValueAt(row, 1).toString();
        switch (brand) {
            case "Ceat":
                jComboBox3.setSelectedIndex(0);
                break;
            case "Goodyear":
                jComboBox3.setSelectedIndex(1);
                break;
            case "MRF":
                jComboBox3.setSelectedIndex(2);
                break;
            case "Apollo":
                jComboBox3.setSelectedIndex(3);
                break;
            case "Michelin":
                jComboBox3.setSelectedIndex(4);
                break;
            case "Bridgestone":
                jComboBox3.setSelectedIndex(5);
                break;
            case "JK":
                jComboBox3.setSelectedIndex(6);
                break;
            case "ELF Lubricant":
                jComboBox3.setSelectedIndex(7);
                break;
            case "Castrol Lubricant":
                jComboBox3.setSelectedIndex(8);
                break;
            case "Valvoline Lubricant":
                jComboBox3.setSelectedIndex(9);
                break;
            case "Gulf Lubricant":
                jComboBox3.setSelectedIndex(10);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Error");
                break; 
        }
        /*
        Select
Tyre (Other than rear Tractor Tyre)
Rear Tractor Tyre
Tube(Other than rear Tractor Tyre)
Tube of Rear Tractor Tyre
Lubricant
        */
        String type= jTable1.getModel().getValueAt(row, 3).toString();;
        switch (type)
        {
            case "Select":
                jComboBox4.setSelectedIndex(0);
                break;
            case "Tyre (Other than rear Tractor Tyre)":
                jComboBox4.setSelectedIndex(1);
                break;
            case "Rear Tractor Tyre":
                jComboBox4.setSelectedIndex(2);
                break;
            case "Tube(Other than rear Tractor Tyre)":
                jComboBox4.setSelectedIndex(3);
                break;
            case "Tube of Rear Tractor Tyre":
                jComboBox4.setSelectedIndex(4);
                break;
            case "Lubricant":
                jComboBox4.setSelectedIndex(5);
                break;
            
            default:
                JOptionPane.showMessageDialog(this, "Error");
                break;
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
          cp = Double.parseDouble(jTextField2.getText());
          pp = Double.parseDouble(jTextField3.getText());
          sp= (cp*pp/100)+cp;
         jLabel6.setText(""+sp);
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainClass mc = new MainClass();
        String pb = jComboBox3.getSelectedItem().toString();
        String pcode = jTextField5.getText();
        try
    {
        Connection con = (Connection)
        DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
        Statement stmt = (Statement) con.createStatement();
        String query="UPDATE INVENTORY SET PRODUCTBRAND = ('"+pb+"') where sr_no= ('"+pcode+"');";
        JOptionPane.showMessageDialog(null,"Updated Successfully");
        stmt.executeUpdate(query);
       
        
    }
     catch (SQLException e)
             {
                JOptionPane.showMessageDialog(this,e.getMessage());
             }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MainClass mc = new MainClass();
        String pn = jTextField1.getText();
        String pcode = jTextField5.getText();
        try
    {
        Connection con = (Connection)
        DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
        Statement stmt = (Statement) con.createStatement();
        String query="UPDATE INVENTORY SET PRODUCTNAME = ('"+pn+"') where sr_no= ('"+pcode+"');";
        JOptionPane.showMessageDialog(null,"Updated Successfully");
        stmt.executeUpdate(query);
       
        
    }
     catch (SQLException e)
             {
                JOptionPane.showMessageDialog(this,e.getMessage());
             }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         MainClass mc = new MainClass();
        String pt = jComboBox4.getSelectedItem().toString();
        String pcode = jTextField5.getText();
        try
    {
        Connection con = (Connection)
        DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
        Statement stmt = (Statement) con.createStatement();
        String query="UPDATE INVENTORY SET PRODUCTType = ('"+pt+"') where sr_no= ('"+pcode+"');";
        JOptionPane.showMessageDialog(null,"Updated Successfully");
        stmt.executeUpdate(query);
       
        
    }
     catch (SQLException e)
             {
                JOptionPane.showMessageDialog(this,e.getMessage());
             }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MainClass mc = new MainClass();
        String pcode = jTextField5.getText();
        cp =Double.parseDouble( jTextField2.getText());
        pp =Double.parseDouble( jTextField3.getText());
        
        sp =(cp*pp/100)+cp;
        jLabel6.setText(""+sp);
        
        try
    {
        Connection con = (Connection)
        DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
        Statement stmt = (Statement) con.createStatement();
        String query="UPDATE INVENTORY SET cost_price = ('"+cp+"') where sr_no= ('"+pcode+"');";
        String query1="UPDATE INVENTORY SET profit_percent = ('"+pp+"') where sr_no= ('"+pcode+"');";
        String query2="UPDATE INVENTORY SET selling_price = ('"+sp+"') where sr_no= ('"+pcode+"');";
        JOptionPane.showMessageDialog(null,"Updated Successfully");
        stmt.executeUpdate(query);
        stmt.executeUpdate(query1);
        stmt.executeUpdate(query2);
       
        
    }
     catch (SQLException e)
             {
                JOptionPane.showMessageDialog(this,e.getMessage());
             }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          MainClass mc = new MainClass();
        String qty = jTextField4.getText();
        String pcode = jTextField5.getText();
        try
    {
        Connection con = (Connection)
        DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
        Statement stmt = (Statement) con.createStatement();
        String query="UPDATE INVENTORY SET Quantity = ('"+qty+"') where sr_no= ('"+pcode+"');";
        JOptionPane.showMessageDialog(null,"Updated Successfully");
        stmt.executeUpdate(query);
       
        
    }
     catch (SQLException e)
             {
                JOptionPane.showMessageDialog(this,e.getMessage());
             }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         MainClass mc = new MainClass();
         String pcode = jTextField5.getText();
           try
    {
        Connection con = (Connection)
        DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
        Statement stmt = (Statement) con.createStatement();
        String query="Delete from INVENTORY where sr_no= ('"+pcode+"');";
        JOptionPane.showMessageDialog(null,"Deleted Successfully");
        stmt.executeUpdate(query);
       
        
    }
     catch (SQLException e)
             {
                JOptionPane.showMessageDialog(this,e.getMessage());
             }
         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
         cp = Double.parseDouble(jTextField2.getText());
          pp = Double.parseDouble(jTextField3.getText());
          sp= (cp*pp/100)+cp;
         jLabel6.setText(""+sp);
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         MainForm mf = new MainForm();
        this.setVisible(false);
       mf.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InventoryUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
