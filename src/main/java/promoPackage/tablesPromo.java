/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package promoPackage;

import java.awt.Color;
import connectionSql.mysqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.security.auth.callback.Callback;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class tablesPromo extends javax.swing.JFrame {
    Connection con = new mysqlConnection().getCon(); 
    DefaultTableModel table;
    /**
     * Creates new form tablesPromo
     */
    
    public tablesPromo() {
        getContentPane().setBackground(Color.white);
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        headerlogo3 = new javax.swing.JLabel();
        PanelSearchBar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableforPromo = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        editPromo = new javax.swing.JButton();
        applyPromo = new javax.swing.JButton();
        createPromo = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 15));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(310, 100));

        headerlogo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uniqclearLogo(header).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(headerlogo3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(headerlogo3)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        PanelSearchBar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Promo Record");

        searchField.setText("Search here");
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
        });
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 15));

        javax.swing.GroupLayout PanelSearchBarLayout = new javax.swing.GroupLayout(PanelSearchBar);
        PanelSearchBar.setLayout(PanelSearchBarLayout);
        PanelSearchBarLayout.setHorizontalGroup(
            PanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSearchBarLayout.createSequentialGroup()
                .addGroup(PanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSearchBarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelSearchBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSearchBarLayout.setVerticalGroup(
            PanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSearchBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSearchBarLayout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TableforPromo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "CUSTOMER NAME", "PROMO POINTS", "STATUS"
            }
        ));
        TableforPromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableforPromoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableforPromo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jButton6.setBackground(new java.awt.Color(40, 75, 135));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Home");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        editPromo.setBackground(new java.awt.Color(40, 75, 135));
        editPromo.setForeground(new java.awt.Color(255, 255, 255));
        editPromo.setText("Edit promo");
        editPromo.setEnabled(false);
        editPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPromoActionPerformed(evt);
            }
        });

        applyPromo.setBackground(new java.awt.Color(51, 153, 0));
        applyPromo.setForeground(new java.awt.Color(255, 255, 255));
        applyPromo.setText("Apply promo");
        applyPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyPromoActionPerformed(evt);
            }
        });

        createPromo.setBackground(new java.awt.Color(40, 75, 135));
        createPromo.setForeground(new java.awt.Color(255, 255, 255));
        createPromo.setText("Create promo");
        createPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPromoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PanelSearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(4, 4, 4)))
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createPromo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editPromo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(applyPromo)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(PanelSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(applyPromo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(createPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /*
    public int getValue(){
        table = (DefaultTableModel) TableforPromo.getModel(); // TableforPromo is table from GUI
            int indexRow = TableforPromo.getSelectedRow(); // Get the selected row (via ID) in Jtable
            int indexColumn = TableforPromo.getSelectedColumn(); 
            return indexRow, indexColumn;
            
    }
    */
    
    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed
    public void generateTable(){
                try{
            // Should use promo_id instead of customer_id
            String sql="SELECT C.customer_id, CONCAT(C.last_name, ', ', C.first_name) AS full_name, COUNT(COALESCE(OL.item_quantity, 0)) AS POINTS "
                    + "FROM customer AS C "
                    + "LEFT JOIN orders AS O ON C.customer_id = O.customer_id "
                    + "LEFT JOIN order_line AS OL ON O.order_id = OL.order_id "
                    + "LEFT JOIN non_rental_item AS NI ON OL.non_rental_item_id = NI.non_rental_item_id " 
                    + "WHERE C.customer_type = 'Regular' AND (NI.non_rental_item_name = 'Refill' OR NI.non_rental_item_name = 'New water bottle') "
                    + "GROUP BY C.customer_id, full_name";

             /*
            " "
              String sql1 = "SELECT C.customer_id, CONCAT(C.last_name, ', ', C.first_name) AS full_name, COALESCE(SUM(OL.item_quantity), 0) AS POINTS " +
             "FROM customer AS C " +
             "LEFT JOIN orders AS O ON C.customer_id = O.customer_id " +
             "LEFT JOIN order_line AS OL ON O.order_id = OL.order_id " +
             "LEFT JOIN non_rental_item AS NI ON OL.non_rental_item_id = NI.non_rental_item_id " +
             "WHERE NI.non_rental_item_name = 'Refill' OR NI.non_rental_item_name='new water bottle' AND C.customer_type = 'Regular' " +
             "GROUP BY C.customer_id, full_name";
                + "WHERE DC.dealer_contract_id ="+contractID+" "
                + "AND YEARWEEK(O.order_date_time) = YEARWEEK(NOW()); ";
            */
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(); // Java object that represents the result of a database query, which contains the data retrieved from the database.
            table = (DefaultTableModel) TableforPromo.getModel(); // TableforPromo - Table in ui
            table.setRowCount(0); // To print from the top
    
            while(rs.next()){ // While loop to print all the information    
                String id = rs.getString("C.customer_id"); // Set id to id from database
                String fullName = rs.getString("full_name");
                String POINTS = rs.getString("POINTS");
                String status = "";
                
                JLabel promoStatus = new JLabel();
                    if(Integer.parseInt(POINTS)>=7){
                        status = "Available";
                        promoStatus.setText(status);
                        
                    }else{
                        status = "Not available";
                        promoStatus.setText(status);
                        promoStatus.setForeground(Color.RED);
                    }

                    table.addRow(new Object[]{id, fullName, POINTS, status}); // Array to add as a row in the table
                }        
            }      
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       // TODO add your handling code here:
       generateTable();
       TableforPromo.getTableHeader().setOpaque(false);
       TableforPromo.getTableHeader().setBackground(new Color(255,192,0));
    }//GEN-LAST:event_formWindowOpened

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldMouseClicked

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        // TODO add your handling code here:
        boolean firstClick = true;
        if(firstClick){
            searchField.setText("");
            firstClick = false;
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
        // TODO add your handling code here:
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<TableModel>(((DefaultTableModel) TableforPromo.getModel()));
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchField.getText()));
        TableforPromo.setRowSorter(rowSorter);
    }//GEN-LAST:event_searchFieldKeyTyped

    private void editPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPromoActionPerformed
        // TODO add your handling code here:
        table = (DefaultTableModel) TableforPromo.getModel(); // TableforPromo is table from GUI
        int index = TableforPromo.getSelectedRow(); // Get the selected row (via ID) in Jtable    
        
        //From row and column, we get the values
        String fullname = (table.getValueAt(index,1)).toString(); // Set string into a value from row, concatenated already (from other function)
        // customerID is just temporary, should be changed to promo_record_id
        String customerID = (table.getValueAt(index, 0)).toString();
              
        String points = (table.getValueAt(index, 2)).toString();
        System.out.println(index+" "+fullname);
        
        // Declare the other frame
        editPromoRecord editRecord = new editPromoRecord(this,true);
        
        // Set fullNameDisplay (from other frame) to fullname (from parent frame)
        editRecord.fullNameDisplay.setText(fullname);
        // Set value of id from parent class to child class
        editRecord.id=(Integer.parseInt(customerID));
        
        editRecord.displayPoints.setValue(Integer.valueOf(points));
        
        // Window listener
        editRecord.addWindowListener(new java.awt.event.WindowAdapter() { @Override
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            // When the dialog is closed, call the generateTable() method
            generateTable(); // Assuming this method is within the same class
        }
        });
        editRecord.setVisible(true); // Make it visible
         
    }//GEN-LAST:event_editPromoActionPerformed

    private void applyPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyPromoActionPerformed
        // TODO add your handling code here:
        table = (DefaultTableModel) TableforPromo.getModel(); // TableforPromo is table from GUI
            int indexRow = TableforPromo.getSelectedRow(); // Get the selected row (via ID) in Jtable
            int indexColumn = TableforPromo.getSelectedColumn(); // Get the selected row (via ID) in Jtable
            String status=(String)table.getValueAt(indexRow,indexColumn+1); 
            String id=(String)table.getValueAt(indexRow,indexColumn-2); int ids = Integer.parseInt(id);
            
            String points = (String)table.getValueAt(indexRow,2);
            int counterPoints = Integer.parseInt(points);
            
            
            
           System.out.println(points);
           
           if(status.equals("Available")){
            // should use promo_id instead of customer_id
            
            try{
            String sql="UPDATE promo_record SET promo_effect_count = promo_effect_count + 1 WHERE customer_id='"+ids+"' ";
                PreparedStatement pst;
                pst = con.prepareStatement(sql);
                pst.executeUpdate(); 
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            JOptionPane.showMessageDialog(this, "Promo applied!", "Apply promo", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Promo not available");
        }
           
        /*
           
           
           
        RECORD PROMO HISTORY
           
           
           
        */
    }//GEN-LAST:event_applyPromoActionPerformed

    private void TableforPromoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableforPromoMouseClicked
        // TODO add your handling code here:
        table = (DefaultTableModel) TableforPromo.getModel(); // TableforPromo is table from GUI
            int indexRow = TableforPromo.getSelectedRow(); // Get the selected row (via ID) in Jtable
            int indexColumn = TableforPromo.getSelectedColumn(); 
        String status=(String)table.getValueAt(indexRow,indexColumn+1);
        if(status.equals("Available")){
            applyPromo.setEnabled(true);
        }else{
            applyPromo.setEnabled(false);
        }
    }//GEN-LAST:event_TableforPromoMouseClicked

    private void createPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPromoActionPerformed
        // TODO add your handling code here:
        createPromo createPromo = new createPromo(this, true);
        createPromo.setVisible(true); 
    }//GEN-LAST:event_createPromoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(tablesPromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablesPromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablesPromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablesPromo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablesPromo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelSearchBar;
    private javax.swing.JTable TableforPromo;
    private javax.swing.JButton applyPromo;
    private javax.swing.JButton createPromo;
    private javax.swing.JButton editPromo;
    private javax.swing.JLabel headerlogo3;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables


}
