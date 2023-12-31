/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package inventoryPackage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import connectionSql.*;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ronjoshual.bersabal
 */
public class addStocks extends javax.swing.JDialog {

    /**
     * Creates new form addStocks
     */
    Connection con = new mysqlConnection().getCon();
    HashMap <String, String> items = new HashMap<String,String>();
    public addStocks(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        editExpense = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        quantityStockIn = new javax.swing.JSpinner();
        date = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        saveExpenseItem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        itemChooser = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 192, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Add Item Stocks");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Item Name", "Stock-in Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(itemsTable);

        editExpense.setText("Edit");
        editExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editExpenseActionPerformed(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(240, 0, 0));
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Select Item:");

        quantityStockIn.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Date:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Stock-in quantity:");

        addButton.setBackground(new java.awt.Color(40, 75, 135));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add to Table");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        saveExpenseItem.setBackground(new java.awt.Color(40, 75, 135));
        saveExpenseItem.setForeground(new java.awt.Color(255, 255, 255));
        saveExpenseItem.setText("Save");
        saveExpenseItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveExpenseItemActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.setName("cancelButton"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editExpense)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveExpenseItem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(quantityStockIn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(itemChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(removeButton)
                        .addComponent(editExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(quantityStockIn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveExpenseItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editExpenseActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)itemsTable.getModel();
        
        if(itemsTable.getSelectedRow() == -1 ){
            JOptionPane.showMessageDialog(this,"Please select a row from the table.", "Error!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int row = itemsTable.getSelectedRow();
            String tempName = itemsTable.getValueAt(row, 1).toString().trim();
            itemChooser.setSelectedItem(tempName);
            quantityStockIn.setValue(Integer.parseInt(itemsTable.getValueAt(row, 2).toString().trim()));
            
            try{
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String dateInString = itemsTable.getValueAt(row,0).toString();
                Date date2 = formatter.parse(dateInString);  
                date.setDate(date2);
            }catch(Exception ex){
                System.out.println("Error: " + ex.getMessage());
            }
            
            model.removeRow(row);
        }

    }//GEN-LAST:event_editExpenseActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
       DefaultTableModel model = (DefaultTableModel)itemsTable.getModel();

        if(itemsTable.getSelectedRow() == -1 ){
            JOptionPane.showMessageDialog(this,"Please select a row from the table.", "Error!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            model.removeRow(itemsTable.getSelectedRow());
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addToTable(){
        DefaultTableModel model = (DefaultTableModel)itemsTable.getModel();
        LocalDate today = LocalDate.now();
        DateTimeFormatter dtfNow = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        
        String item  = "";
        String quantity = "";
        int tempQuan = Integer.parseInt(quantityStockIn.getValue().toString());
        
 
      
        String dateString = "";
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
        
        if (itemChooser.getSelectedItem().toString().trim().equalsIgnoreCase("-")){
            JOptionPane.showMessageDialog(this,"Please select an item to restock","Error!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            item =itemChooser.getSelectedItem().toString().trim();
            if (tempQuan == 0){
                JOptionPane.showMessageDialog(this,"Your stock-in quantity should not be 0!", "Error!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                quantity = quantityStockIn.getValue().toString();
                if (date.getDate() != null){
                    dateString = dtf.format(date.getDate());
                }else{
                    dateString = dtfNow.format(today);
                }
                
                model.addRow(new Object []{dateString, item, quantity});
                alignValues();
                itemChooser.setSelectedIndex(0);
                quantityStockIn.setValue(0);        
            }
        } 
       
    }
    
    
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String item = itemChooser.getSelectedItem().toString().trim();
        boolean exists = false;
        if (itemsTable.getRowCount()>0){
            for(int row = 0; row < itemsTable.getRowCount(); row++){
                String tempName =itemsTable.getValueAt(row,1).toString().trim();
                if (tempName.equals(item)){
                    exists = true;
                    JOptionPane.showMessageDialog(this, item+ " already exists in the table!", "Error!", JOptionPane.INFORMATION_MESSAGE);
                }  
            }
            
            if (!exists){
                addToTable();  
            }
        }else{
            addToTable();  
        }
        
         
          
    }//GEN-LAST:event_addButtonActionPerformed

    private void alignValues(){
        DefaultTableCellRenderer rightAlign = new DefaultTableCellRenderer();

        rightAlign.setHorizontalAlignment(JLabel.RIGHT);
     
        itemsTable.getColumnModel().getColumn(2).setCellRenderer(rightAlign);
    }
    
    
    private void saveExpenseItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveExpenseItemActionPerformed
        
       // JOptionPane.showConfirmDialog(this, "Are you sure you want to finish stocking in?", "Message", , HEIGHT)
        
       if(itemsTable.getRowCount() == 0){
           JOptionPane.showMessageDialog(this, "No restock entries found! Please input first before saving.", "Warning!", JOptionPane.INFORMATION_MESSAGE);
       }else{
            for(int row = 0; row < itemsTable.getRowCount(); row++){
               String date = "'" + itemsTable.getValueAt(row,0)+"'";
               String itemName = "'" + itemsTable.getValueAt(row,1)+"'";
               String quantity = itemsTable.getValueAt(row,2).toString();
               
               String id = items.get(itemsTable.getValueAt(row,1).toString().trim());
               
              
               
               
               
               String saveSql = "UPDATE non_rental_item SET quantity = quantity + "+quantity+" WHERE non_rental_item_id ="+id+";";
               
               try{
                   PreparedStatement pst = con.prepareStatement(saveSql);
                   pst.executeUpdate();
               }catch(Exception ex){
                   System.out.println("Error: " + ex.getMessage());
               }
               
                 
            }
        this.dispose();
       }

        
      
    }//GEN-LAST:event_saveExpenseItemActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String sql = "SELECT * FROM non_rental_item WHERE NOT non_rental_item_name LIKE ('Refill');";
       
        DefaultComboBoxModel model = (DefaultComboBoxModel) itemChooser.getModel();
        model.addElement("-");
        
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                
                String tempName = rs.getString("non_rental_item_name");
                String tempId = rs.getString("non_rental_item_id");
               
                model.addElement(tempName);
                items.put(tempName,tempId);
            }
            
        }catch(Exception ex){
            System.out.println("Error: "+ ex.getMessage());
        }
       
        itemChooser.setModel(model);
        
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(addStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addStocks dialog = new addStocks(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton editExpense;
    private javax.swing.JComboBox<String> itemChooser;
    private javax.swing.JTable itemsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner quantityStockIn;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveExpenseItem;
    // End of variables declaration//GEN-END:variables
}
