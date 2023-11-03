/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventoryPackage;
import connectionSql.mysqlConnection;
import customerPackage.editCustomerPage;
/**
 *
 * @author rjber
 */
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class inventory extends javax.swing.JFrame {

    /**
     * Creates new form inventory
     */
    Connection con = new mysqlConnection().getCon();
    public inventory() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nonRentalTable = new javax.swing.JTable();
        addItemBTN = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rentalTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        delNonRentalItem = new javax.swing.JButton();
        editNonRentalItem = new javax.swing.JButton();
        editRentalItem = new javax.swing.JButton();
        delRentalItem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        headerlogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventory");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Non-Rental Items");

        nonRentalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ITEM NAME", "QTY", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(nonRentalTable);

        addItemBTN.setBackground(new java.awt.Color(40, 75, 135));
        addItemBTN.setForeground(new java.awt.Color(255, 255, 255));
        addItemBTN.setText("Add new item");
        addItemBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBTNActionPerformed(evt);
            }
        });

        jTextField1.setToolTipText("Search");

        jButton2.setBackground(new java.awt.Color(40, 75, 135));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Restock");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Rental Items");

        rentalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODE", "ITEM NAME", "ITEM AVAILABILITY", "CONDITION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(rentalTable);

        jButton3.setBackground(new java.awt.Color(40, 75, 135));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uniqclearLogo.png"))); // NOI18N

        delNonRentalItem.setBackground(new java.awt.Color(200, 0, 0));
        delNonRentalItem.setForeground(new java.awt.Color(255, 255, 255));
        delNonRentalItem.setText("Delete");
        delNonRentalItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delNonRentalItemActionPerformed(evt);
            }
        });

        editNonRentalItem.setBackground(new java.awt.Color(40, 75, 135));
        editNonRentalItem.setForeground(new java.awt.Color(255, 255, 255));
        editNonRentalItem.setText("Edit Item");
        editNonRentalItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNonRentalItemActionPerformed(evt);
            }
        });

        editRentalItem.setBackground(new java.awt.Color(40, 75, 135));
        editRentalItem.setForeground(new java.awt.Color(255, 255, 255));
        editRentalItem.setText("Edit item");

        delRentalItem.setBackground(new java.awt.Color(200, 0, 0));
        delRentalItem.setForeground(new java.awt.Color(255, 255, 255));
        delRentalItem.setText("Delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()

                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(546, 546, 546)
                        .addComponent(editNonRentalItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delNonRentalItem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addItemBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(779, 779, 779)
                        .addComponent(logo))
                    .addComponent(jLabel2))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editRentalItem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delRentalItem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))

                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3)))
                .addGap(218, 218, 218))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(logo))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(6, 6, 6)
                        .addComponent(addItemBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3))
                    .addComponent(editNonRentalItem)
                    .addComponent(delNonRentalItem))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delRentalItem)
                    .addComponent(editRentalItem))
                .addGap(14, 14, 14))

        );

        jScrollPane1.setViewportView(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        headerlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uniqclearLogo(header).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(headerlogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerlogo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addItemBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBTNActionPerformed
        addItem addItemWindow = new addItem(this, true);
        addItemWindow.setVisible(true);

        addItemWindow.addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e)
            {  
               itemsList();
                    
            }
          });
        

    }//GEN-LAST:event_addItemBTNActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void itemsList(){
        String sql = "SELECT item.item_id, item_name, non_rental_item.item_quantity, item_price FROM item JOIN non_rental_item WHERE item.item_id = non_rental_item.item_id;";
        DefaultTableModel nonRental = (DefaultTableModel)nonRentalTable.getModel();
        nonRental.setRowCount(0);
 
            try{
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                 nonRental.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});}
            }catch(Exception ex){
                 System.out.println("Error: "+ ex.getMessage());
            }
            
            
        String sql2 = "SELECT rental_item.item_code, item_name, rental_item.item_availability, rental_item.item_condition FROM item JOIN rental_item WHERE item.item_id = rental_item.item_id;";
        DefaultTableModel rental = (DefaultTableModel)rentalTable.getModel();
        rental.setRowCount(0);
            try{
                PreparedStatement pst = con.prepareStatement(sql2);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                 rental.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});}
            }catch(Exception ex){
                 System.out.println("Error: "+ ex.getMessage());
            }
        
       alignValues();
    }
    
    public void alignValues(){
        DefaultTableCellRenderer rightAlign = new DefaultTableCellRenderer();
        rightAlign.setHorizontalAlignment(JLabel.RIGHT);
        nonRentalTable.getColumnModel().getColumn(3).setCellRenderer(rightAlign); 
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        itemsList();
    }//GEN-LAST:event_formWindowOpened

    private void delNonRentalItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delNonRentalItemActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)nonRentalTable.getModel();
        int idColumn = 0;
        int idRow = nonRentalTable.getSelectedRow();
        String selectedID = nonRentalTable.getModel().getValueAt(idRow,idColumn).toString();
        String sql = "DELETE FROM non_rental_item WHERE item_id='"+selectedID + "';"; 
        String sql2 = "DELETE FROM item WHERE item_id='"+selectedID +"';";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            
            PreparedStatement pst2 = con.prepareStatement(sql2);
            pst2.executeUpdate();
            
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        
        if (nonRentalTable.getSelectedRow() != -1) {
            // remove selected row from the model
            model.removeRow(nonRentalTable.getSelectedRow());
        }

        
    }//GEN-LAST:event_delNonRentalItemActionPerformed

    private void editNonRentalItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNonRentalItemActionPerformed
        // TODO add your handling code here:
       
         DefaultTableModel model = (DefaultTableModel)nonRentalTable.getModel();
        int idColumn = 0;
        int idRow = nonRentalTable.getSelectedRow();
        
       
        String selectedID = nonRentalTable.getModel().getValueAt(idRow,idColumn).toString();
       
       
        String toeditItemName = nonRentalTable.getModel().getValueAt(idRow,1).toString();
        String toeditQuantity = nonRentalTable.getModel().getValueAt(idRow,2).toString();
        String toeditItemPrice = nonRentalTable.getModel().getValueAt(idRow,3).toString();
        
        
        
        editItem editRental = new editItem(this, true);
        
        editRental.editItemName.setText(toeditItemName);
        editRental.editItemPrice.setValue(Integer.parseInt(toeditQuantity));
        editRental.editItemQuantity.setValue(Double.parseDouble(toeditItemPrice));
        
        
        /*
         editRental.selectedID = selectedID;
         editRental.editFirstName.setText(toeditFirstName);
         editRental.editLastName.setText(toeditLastName);
         editCustomer.editMiddleName.setText(toeditMiddleName);
         editCustomer.editContactNumber.setText(toeditContact);
         editCustomer.editCustomerType.setSelectedItem(toeditCType);*/
         
          String sql = "SELECT customer_address,birthdate,sex FROM customer WHERE "
                  + "customer_id =" +selectedID+";";
        //try{
            //PreparedStatement pst = con.prepareStatement(sql);
           // ResultSet rs = pst.executeQuery();
            //DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
            /*
            while(rs.next()){
                String address = rs.getString("customer_address");
                String address2[] = address.split(",");
                String findAddressLine[] = address.split(address2[address2.length-3].trim());
                editCustomer.editBarangay.setSelectedItem(address2[address2.length-3].trim());                
                String adl1 = findAddressLine[0].trim();
                String oldAddress1 = adl1;
                if (oldAddress1.endsWith(",")) {
                    oldAddress1 = oldAddress1.substring(0, oldAddress1.length() - 1);
                }
               
                editCustomer.editLine1Address.setText(oldAddress1);
     
                char sex = rs.getString( "sex").charAt(0);
              
                switch (sex) {
                    case 'M' -> editCustomer.editSM.setSelected(true);
                    case 'F' -> editCustomer.editSF.setSelected(true);
                    default -> editCustomer.editSO.setSelected(true);
                }
                String birthdate = rs.getString("birthdate");
                SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date edDate = formatDate.parse(birthdate);
                editCustomer.editBdate.setDate(edDate);
            }
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }*/
        
        
        
        editRental.setVisible(true);
    }//GEN-LAST:event_editNonRentalItemActionPerformed

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
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemBTN;

    private javax.swing.JButton delNonRentalItem;
    private javax.swing.JButton delRentalItem;
    private javax.swing.JButton editNonRentalItem;
    private javax.swing.JButton editRentalItem;

    private javax.swing.JLabel headerlogo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    private javax.swing.JTable nonRentalTable;
    private javax.swing.JTable rentalTable;
    // End of variables declaration//GEN-END:variables
}
