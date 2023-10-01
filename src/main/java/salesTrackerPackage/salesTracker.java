/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package salesTrackerPackage;
import connectionSql.mysqlConnection;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author rjber
 */
public class salesTracker extends javax.swing.JFrame {

    /**
     * Creates new form salesTracker
     */
    Connection con = new mysqlConnection().getCon();
    public salesTracker() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        headerlogo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        expensesTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        totalSalesDisplay = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalExpenses = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        profitDisplay = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        salesDateChooser = new com.toedter.calendar.JDateChooser();
        setDateButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sales Tracker");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        headerlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uniqclearLogo(header).png"))); // NOI18N
        headerlogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Sales");

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No.", "Date", "Customer", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salesTable);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Expenses");

        expensesTable.setAutoCreateRowSorter(true);
        expensesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Item Name", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(expensesTable);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Date:");

        totalSalesDisplay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalSalesDisplay.setForeground(new java.awt.Color(0, 150, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Total Expenses:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Total Profit:");

        totalExpenses.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        totalExpenses.setForeground(new java.awt.Color(255, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Total Sales:");

        profitDisplay.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        profitDisplay.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(totalExpenses)
                        .addGap(925, 925, 925))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(totalSalesDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(495, 495, 495)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profitDisplay)
                        .addGap(177, 177, 177))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profitDisplay)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalSalesDisplay)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalExpenses))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(40, 75, 135));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDateButton.setBackground(new java.awt.Color(40, 75, 135));
        setDateButton.setForeground(new java.awt.Color(255, 255, 255));
        setDateButton.setText("Set Date");
        setDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(693, 693, 693)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(salesDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(setDateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salesDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(setDateButton))))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(headerlogo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1189, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(headerlogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed
public double totalExpensesNum = 0, totalSales = 0;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String sql = "SELECT orders.order_id, concat(last_name,\",\", first_name) as 'customer_name', contact_num, orders.order_status, order_date_time, orders.amount FROM customer JOIN orders WHERE orders.customer_id = customer.customer_id;";
            try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel modelOrders = (DefaultTableModel)salesTable.getModel();
            
            
            
            while(rs.next()){
                String orderID = rs.getString("order_id");
                String custName = rs.getString("customer_name");
                String amount = rs.getString("amount");
                LocalDateTime dateTimeOrder = rs.getTimestamp("order_date_time").toLocalDateTime();
                String formattedDateTime2 = dateTimeOrder.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                
                modelOrders.addRow(new String[]{orderID, formattedDateTime2,custName,amount});
         
               
            }
            
            //totalExpenses.setText("PHP  " + String.valueOf(totalExpensesNum));
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        
        String sql2 = "SELECT expense_amount, expense_description, expense_date_time FROM expense";
        try{
            PreparedStatement pst = con.prepareStatement(sql2);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel)expensesTable.getModel();
            
            
            
            while(rs.next()){
                //String expID = rs.getString("expense_id");
                String expDesc = rs.getString("expense_description");
                String expAmount = rs.getString("expense_amount");
                double expAmount2 = rs.getDouble("expense_amount");
                LocalDateTime dateTime = rs.getTimestamp("expense_date_time").toLocalDateTime();
                String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                
                model.addRow(new String[]{formattedDateTime, expDesc,expAmount});
            }
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        calculateAll();
        alignValues();
    }//GEN-LAST:event_formWindowOpened

    private void setDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDateButtonActionPerformed
        // TODO add your handling code here:
        //Date filter feature
        //Use salesDateChooser
        //salesTable, expensesTable
        
        TableRowSorter<TableModel> expenseSorter = new TableRowSorter<TableModel>(((DefaultTableModel) expensesTable.getModel()));
        TableRowSorter<TableModel> salesSorter = new TableRowSorter<TableModel>(((DefaultTableModel) salesTable.getModel()));
        
        if(salesDateChooser.getDate()!= null){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String salesDate =dateFormat.format(salesDateChooser.getDate());
            expenseSorter.setRowFilter(RowFilter.regexFilter("(?i)" + salesDate));
            salesSorter.setRowFilter(RowFilter.regexFilter("(?i)" + salesDate));
            expensesTable.setRowSorter(expenseSorter);
            salesTable.setRowSorter(salesSorter);
        }else{
            expenseSorter.setRowFilter(RowFilter.regexFilter(" "));
            salesSorter.setRowFilter(RowFilter.regexFilter(""));
            expensesTable.setRowSorter(expenseSorter);
            salesTable.setRowSorter(salesSorter);
        }
       
        calculateAll();
        alignValues();
    }//GEN-LAST:event_setDateButtonActionPerformed

    public void calculateAll(){
        
        //Column for expenses = 3 =2, 
        //Column for sales = 3=2;
        DefaultTableModel expenses = (DefaultTableModel)expensesTable.getModel();
        DefaultTableModel sales = (DefaultTableModel)salesTable.getModel();
        
        double expensesTemp = 0;
        if (expenses.getRowCount() > 0){
            for(int i = 0; i<expensesTable.getRowCount(); i++){
                expensesTemp += Double.parseDouble(expenses.getValueAt(expensesTable.convertRowIndexToModel(i),2).toString());
            }
        }
        //.getValueAt(table.convertRowIndexToModel(row), 0)
        double salesTemp = 0;
        
        if(sales.getRowCount()>0){
            for (int i = 0; i<salesTable.getRowCount();i++){
                salesTemp += Double.parseDouble(sales.getValueAt(salesTable.convertRowIndexToModel(i), 3).toString());
            }
        }
        
        totalSalesDisplay.setText("PHP  " + String.format("%.2f", salesTemp));
        totalExpenses.setText("PHP  " + String.format("%.2f",expensesTemp));
        
        double tempProfit = salesTemp-expensesTemp;
        
        System.out.println("Profit: "+tempProfit);
        System.out.println("Sales: "+ salesTemp);
        System.out.println("Expenses: "+expensesTemp);
        
        
        if(tempProfit > 0){
            profitDisplay.setForeground(new Color(0,150,0));
            profitDisplay.setText("PHP  " + String.format("%.2f", tempProfit));
        }else if(tempProfit < 0){
            profitDisplay.setForeground(Color.RED);
            profitDisplay.setText("PHP  " + String.format("%.2f", tempProfit));
        }else{
            profitDisplay.setForeground(Color.GRAY);
            profitDisplay.setText("PHP  " + String.format("%.2f", tempProfit)); 
        }
    }
    
    public void alignValues(){
        DefaultTableCellRenderer rightAlign = new DefaultTableCellRenderer();
        //centerAlign.setHorizontalAlignment(JLabel.CENTER);
        rightAlign.setHorizontalAlignment(JLabel.RIGHT);
        expensesTable.getColumnModel().getColumn(2).setCellRenderer(rightAlign);
        salesTable.getColumnModel().getColumn(3).setCellRenderer(rightAlign);
       
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(salesTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salesTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salesTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salesTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salesTracker().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable expensesTable;
    private javax.swing.JLabel headerlogo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel profitDisplay;
    private com.toedter.calendar.JDateChooser salesDateChooser;
    private javax.swing.JTable salesTable;
    private javax.swing.JButton setDateButton;
    private javax.swing.JLabel totalExpenses;
    private javax.swing.JLabel totalSalesDisplay;
    // End of variables declaration//GEN-END:variables
}
