/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package inventoryPackage;
import connectionSql.mysqlConnection;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author ronjoshual.bersabal
 */
public class rentalInventory extends javax.swing.JDialog {

    /**
     * Creates new form rentalInventory
     */
    Connection con = new mysqlConnection().getCon();
    public rentalInventory(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        addItemButton = new javax.swing.JButton();
        rentOutButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        returnItemButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        availabilityFilter = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        viewItemInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(205, 205, 205));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uniqclearLogo(header).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Availability", "Life Span"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemsTable);

        addItemButton.setBackground(new java.awt.Color(40, 75, 135));
        addItemButton.setForeground(new java.awt.Color(255, 255, 255));
        addItemButton.setText("Add New Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        rentOutButton.setText("Rent Item");
        rentOutButton.setEnabled(false);
        rentOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentOutButtonActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(40, 75, 135));
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Rental Items");

        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
            }
        });
        searchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchBoxKeyTyped(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uniqclearLogo.png"))); // NOI18N

        returnItemButton.setText("Return Item");
        returnItemButton.setEnabled(false);
        returnItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnItemButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Search:");

        availabilityFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Available", "Unavailable" }));
        availabilityFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityFilterActionPerformed(evt);
            }
        });

        jLabel5.setText("Filter by availability:");

        viewItemInfo.setText("View Item");
        viewItemInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(viewItemInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(returnItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rentOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availabilityFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(homeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(homeButton)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(availabilityFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewItemInfo)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rentOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(returnItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rentOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentOutButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)itemsTable.getModel();
        int row = itemsTable.getSelectedRow();
        
        boolean available = itemsTable.getValueAt(row,2).toString().equalsIgnoreCase("Available");
        if(available){
            rentOutItem rentOut = new rentOutItem(new javax.swing.JFrame(),true);
            if(itemsTable.getSelectedRow() > -1){

                rentOut.itemId.setText(itemsTable.getValueAt(row, 0).toString());
                rentOut.itemName.setText(itemsTable.getValueAt(row,1).toString());
                rentOut.dispenserLife.setText(itemsTable.getValueAt(row, 3).toString());
                rentOut.rentalItemID = itemsTable.getValueAt(row, 0).toString();
            }

            rentOut.setVisible(true);
            rentOut.addWindowListener(new WindowAdapter (){
                public void WindowClosed(WindowEvent e){
                    model.setRowCount(0);
                    loadTable();
                }
            });
        }else{
            JOptionPane.showMessageDialog(this, "Please select an \"available\" item!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_rentOutButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loadTable();
    }//GEN-LAST:event_formWindowOpened

    private void loadTable(){
        
        DefaultTableModel items = (DefaultTableModel)itemsTable.getModel();
        items.setRowCount(0);
        
        String sql = "SELECT rental_item_id, rental_item_name, branch_id, created_at FROM rental_item";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime today = LocalDateTime.now();
            String itemID, itemName, branchID, dateCreated;

            while (rs.next()){
                itemID = rs.getString("rental_item_id");
                itemName = rs.getString("rental_item_name");
                branchID = rs.getString("branch_id");
                dateCreated= rs.getString("created_at");
           
                LocalDateTime createdAt = LocalDateTime.parse(dateCreated, dtf);
                
                long daysBetween = Duration.between(today,createdAt).toDays();
                
                String tempDays = Math.abs(daysBetween) + " days";
                items.addRow(new String[]{itemID, itemName, checkAvailability(itemID), tempDays});
            }
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
    private String checkAvailability(String id){
        String availability ="";
        
        String getRentedOut = "SELECT * FROM rented_out WHERE rental_item_id = "+id+" ORDER BY out_datetime DESC LIMIT 1;";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime today = LocalDateTime.now();
                String dateTime = "";
                String rentedOutId = "";
                String returnTime = "";
                
                try{
                    PreparedStatement pst2 = con.prepareStatement(getRentedOut);
                    ResultSet rs2 = pst2.executeQuery();
                    
                    if(!rs2.next()){
                         availability = "Available";
                    }else{
                        dateTime = rs2.getString("out_datetime");
                        rentedOutId = rs2.getString("rented_out_id");
                      
                        String getRentedIn = "SELECT rented_in_id,in_datetime FROM rented_in WHERE rented_out_id = "+rentedOutId+" ORDER BY in_datetime DESC LIMIT 1;";

                            try{
                                PreparedStatement pst3 = con.prepareStatement(getRentedIn);
                                ResultSet rs3 = pst3.executeQuery();

                                if (!rs3.next()){
                                    availability = "Unavailable";
                                }else{
                                    returnTime = rs3.getString("in_datetime");

                                    LocalDateTime latestReturn = LocalDateTime.parse(returnTime,dtf);
                                    LocalDateTime latestRent = LocalDateTime.parse(dateTime, dtf);

                                    int knowLatest = latestReturn.compareTo(latestRent);

                                    if (knowLatest > 0){
                                        availability = "Available";
                                    }else{
                                        availability = "Unavailable";
                                    }
                                }
                            }catch(Exception ex){
                                System.out.println("Error: " + ex.getMessage());
                            }
                        
 
                    }
                    
               
                    

                }catch(Exception ex){
                    System.out.println("Error:"+ ex.getMessage());
                }

        //System.out.println(availability);
        return availability;
    }
    
    
    
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_homeButtonActionPerformed

    private void returnItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnItemButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)itemsTable.getModel();
        int row = itemsTable.getSelectedRow();
        boolean unavailable = (itemsTable.getValueAt(row,2).toString().trim().equalsIgnoreCase("Unavailable"));
        if (unavailable){
            rentInItem returnPage = new rentInItem(new javax.swing.JFrame(), true);
            returnPage.rental_item_id = itemsTable.getValueAt(row,0).toString();
            returnPage.setVisible(true);
            
            returnPage.addWindowListener(new WindowAdapter(){
                public void WindowClosed(WindowEvent e){
                    //function to reload tables;
                    model.setRowCount(0);
                    loadTable();
  
                }});
            
        }else{
            JOptionPane.showMessageDialog(this, "Please select an \"unavailable\" item!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_returnItemButtonActionPerformed

    private void itemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsTableMouseClicked
        // TODO add your handling code here:
        if (itemsTable.getSelectedRow() > -1){
            rentOutButton.setEnabled(true);
            returnItemButton.setEnabled(true);
        }else{
            rentOutButton.setEnabled(false);
            returnItemButton.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_itemsTableMouseClicked

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed

    private void searchBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBoxKeyTyped
        // TODO add your handling code here:
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) itemsTable.getModel()));
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchBox.getText()));
        itemsTable.setRowSorter(sorter);
    }//GEN-LAST:event_searchBoxKeyTyped

    private void availabilityFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityFilterActionPerformed
        // TODO add your handling code here:
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) itemsTable.getModel()));
        String filter = availabilityFilter.getSelectedItem().toString().trim();
        
        if (!filter.equalsIgnoreCase("All")){
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + filter));
        }else{
            String tempFilter = "";
              sorter.setRowFilter(RowFilter.regexFilter("(?i)" + tempFilter));
        }
  
        itemsTable.setRowSorter(sorter);
    }//GEN-LAST:event_availabilityFilterActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // TODO add your handling code here:
        
        addItem newItem = new addItem(new javax.swing.JFrame(),true, "rental");
        newItem.setVisible(true);
        newItem.addWindowListener(new WindowAdapter(){
            public void WindowClosed(WindowEvent e){
               // loadTable();
                DefaultTableModel items = (DefaultTableModel)itemsTable.getModel();
                items.setRowCount(0);

                String sql = "SELECT rental_item_id, rental_item_name, branch_id, created_at FROM rental_item";
                try{
                    PreparedStatement pst = con.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    LocalDateTime today = LocalDateTime.now();
                    String itemID, itemName, branchID, dateCreated;
                    items.setRowCount(0);
                    while (rs.next()){
                        itemID = rs.getString("rental_item_id");
                        itemName = rs.getString("rental_item_name");
                        branchID = rs.getString("branch_id");
                        dateCreated= rs.getString("created_at");

                        LocalDateTime createdAt = LocalDateTime.parse(dateCreated, dtf);

                        long daysBetween = Duration.between(today,createdAt).toDays();

                        String tempDays = Math.abs(daysBetween) + " days";
                        items.addRow(new String[]{itemID, itemName, checkAvailability(itemID), tempDays});
                    }
                }catch(Exception ex){
                    System.out.println("Error: " + ex.getMessage());
                }
                    }
        });
        
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void viewItemInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemInfoActionPerformed
        // TODO add your handling code here:
        
        rentalItemInfo viewItem = new rentalItemInfo(new javax.swing.JFrame(), true);
        
        if (itemsTable.getSelectedRow() > 0){
           int row = itemsTable.getSelectedRow();
           viewItem.setItemID(itemsTable.getValueAt(row, 0).toString()); 
           viewItem.setLifeSpan(itemsTable.getValueAt(row, 3).toString());
        }
        
        viewItem.setVisible(true);
    }//GEN-LAST:event_viewItemInfoActionPerformed

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
            java.util.logging.Logger.getLogger(rentalInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rentalInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rentalInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rentalInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                rentalInventory dialog = new rentalInventory(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addItemButton;
    private javax.swing.JComboBox<String> availabilityFilter;
    private javax.swing.JButton homeButton;
    private javax.swing.JTable itemsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rentOutButton;
    private javax.swing.JButton returnItemButton;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton viewItemInfo;
    // End of variables declaration//GEN-END:variables
}
