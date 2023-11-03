/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ordersPackage;
import connectionSql.mysqlConnection;
/**
 *
 * @author ronjoshual.bersabal
 */
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class orderAdjustments extends javax.swing.JDialog {

    /**
     * Creates new form orderAdjustments
     */
    Connection con = new mysqlConnection().getCon();
    public ArrayList<String>promoList =new ArrayList();
    
    HashMap<String,Double> feesTableValues = new HashMap<String,Double>();
    HashMap<String,Double> discountTableValues = new HashMap<String, Double>();
    
    //public boolean forDelivery;
    public boolean addedCustomDisc = false, addedCustomFee = false, cancelPressed;// tenPlusOne;
    public double custFee, custDisc;
    public double feesTotal, discountsTotal, deliveryFee;
    
    
    public orderAdjustments(java.awt.Frame parent, boolean modal) {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        headerlogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        applyButton = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        feesTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        customPanel = new javax.swing.JPanel();
        customDiscount = new javax.swing.JSpinner();
        cdEnable = new javax.swing.JRadioButton();
        customAddFee = new javax.swing.JSpinner();
        caEnable = new javax.swing.JRadioButton();
        addCustom = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        activeDiscounts = new javax.swing.JTable();
        custom = new javax.swing.JRadioButton();
        existingPromos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        addToActive = new javax.swing.JButton();
        removeDiscount = new javax.swing.JButton();
        removeFees = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        headerlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uniqclearLogo(header).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerlogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerlogo)
        );

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Active discounts:");

        applyButton.setBackground(new java.awt.Color(40, 75, 135));
        applyButton.setForeground(new java.awt.Color(255, 255, 255));
        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(200, 0, 0));
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        feesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(feesTable);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Active additional fees:");

        customPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        customPanel.setEnabled(false);

        customDiscount.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        customDiscount.setToolTipText("Input discount amount in peso");

        cdEnable.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cdEnable.setText("Custom Discount");
        cdEnable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cdEnableMouseClicked(evt);
            }
        });

        customAddFee.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        customAddFee.setToolTipText("Input custom additional fee in Peso");

        caEnable.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        caEnable.setText("Custom Additional Fee");
        caEnable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caEnableMouseClicked(evt);
            }
        });

        addCustom.setBackground(new java.awt.Color(40, 75, 135));
        addCustom.setForeground(new java.awt.Color(255, 255, 255));
        addCustom.setText("Add");
        addCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customPanelLayout = new javax.swing.GroupLayout(customPanel);
        customPanel.setLayout(customPanelLayout);
        customPanelLayout.setHorizontalGroup(
            customPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(customPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cdEnable)
                    .addComponent(caEnable))
                .addGap(36, 36, 36)
                .addGroup(customPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customAddFee, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(addCustom)
                .addGap(33, 33, 33))
        );
        customPanelLayout.setVerticalGroup(
            customPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(customPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdEnable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customAddFee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caEnable))
                .addGap(50, 50, 50))
            .addGroup(customPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(addCustom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        activeDiscounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Promo Description", "Discount Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(activeDiscounts);

        custom.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        custom.setText("Custom");
        custom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customMouseClicked(evt);
            }
        });

        existingPromos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Select additional existing promo:");

        addToActive.setBackground(new java.awt.Color(40, 75, 135));
        addToActive.setForeground(new java.awt.Color(255, 255, 255));
        addToActive.setText("Add");
        addToActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToActiveActionPerformed(evt);
            }
        });

        removeDiscount.setBackground(new java.awt.Color(200, 0, 0));
        removeDiscount.setForeground(new java.awt.Color(255, 255, 255));
        removeDiscount.setText("Remove");
        removeDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDiscountActionPerformed(evt);
            }
        });

        removeFees.setBackground(new java.awt.Color(200, 0, 0));
        removeFees.setForeground(new java.awt.Color(255, 255, 255));
        removeFees.setText("Remove");
        removeFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFeesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(custom)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(removeDiscount)
                                .addComponent(removeFees))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(existingPromos, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addToActive))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(customPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeDiscount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeFees)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(existingPromos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToActive))
                .addGap(18, 18, 18)
                .addComponent(custom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String sql = "SELECT promo_description FROM promo;";
        
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
                promoList.add(rs.getString("promo_description"));
            
            
        }catch(Exception ex){
            System.out.println("Error: "+ ex.getMessage());
        }
        
        //DefaultTableModel model = (DefaultTableModel)existingPromos.getModel();
        DefaultComboBoxModel model = (DefaultComboBoxModel)existingPromos.getModel();
        model.removeAllElements();
         for (String item: promoList){
               model.addElement(item);
         }
         
        
         caEnable.setEnabled(false);
         cdEnable.setEnabled(false);
         customDiscount.setEnabled(false);
         customAddFee.setEnabled(false);
         
        // DefaultTableModel feeTable = (DefaultTableModel)feesTable.getModel();
         DefaultTableModel feeTable = (DefaultTableModel)feesTable.getModel();
         DefaultTableModel discountTable = (DefaultTableModel)activeDiscounts.getModel();
         
         if(!discountTableValues.isEmpty()){
             for(Map.Entry<String,Double> set : discountTableValues.entrySet()){
                 discountTable.addRow(new Object[]{set.getKey(),String.format("%.2f",set.getValue())});
             }
         }
         
         if (!feesTableValues.isEmpty()){
             for(Map.Entry<String,Double> set : feesTableValues.entrySet()){
                 feeTable.addRow(new Object[]{set.getKey(),String.format("%.2f",set.getValue())});
             }
         }
         
         
         //This line needs work
         
         if (deliveryFee >0 ){
             if (feesTable.getRowCount() > 0){
                 for(int i =0; i<feeTable.getRowCount();i++){
                    if (feesTable.getValueAt(i, 0).toString().equalsIgnoreCase("Delivery Fee per Bottle")){
                        double tempDeliveryPrice = Double.parseDouble(feesTable.getValueAt(i, 1).toString());
                        if(deliveryFee != tempDeliveryPrice){
                            feeTable.removeRow(i);
                            feeTable.addRow(new String[]{"Delivery Fee per Bottle", String.format("%.2f",deliveryFee)});    
                        }
                    }
             }
             }else{
                  feeTable.addRow(new String[]{"Delivery Fee per Bottle", String.format("%.2f", deliveryFee)});   
             }
         }else{
             for(int i =0; i<feeTable.getRowCount();i++){
                if (feesTable.getValueAt(i, 0).toString().equalsIgnoreCase("Delivery Fee per Bottle")){
                    feeTable.removeRow(i);
                }
            }
         }
         
   
        /*for (Map.Entry<String,Double> set: discountTableValues.entrySet()){
            if (set.getKey().equals("10+1")){
                String sql3 = "SELECT promo_description, promo_discount_amount FROM promo WHERE promo_description LIKE ('10+1');";
                try{
                    PreparedStatement pst = con.prepareStatement(sql3);
                    ResultSet rs = pst.executeQuery();

                    while(rs.next()){
                       discountTable.addRow(new String[]{rs.getString(1),rs.getString(2)});
                    }

                }catch(Exception ex){
                    System.out.println("Error: " +ex.getMessage());
                }
            }
        }*/
        
         
         custom.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    customPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    caEnable.setEnabled(true);
                    cdEnable.setEnabled(true);
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    customPanel.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
                    caEnable.setEnabled(false);
                    cdEnable.setEnabled(false);
                    customDiscount.setEnabled(false);
                    customAddFee.setEnabled(false);
                }
            }
        });
        
    }//GEN-LAST:event_formWindowOpened
   
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        calculateAll(true);
        cancelPressed=true;
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void addToActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToActiveActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)activeDiscounts.getModel();
        String promo = existingPromos.getSelectedItem().toString().trim();
        String name = "";
        double amount = 0;
        String sql = "SELECT promo_description, promo_discount_amount FROM promo WHERE promo_description LIKE ('"+promo+"'); ";
                    try{
                        PreparedStatement pst = con.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery();

                        while(rs.next()){
                            name = rs.getString("promo_description");
                            amount = rs.getDouble("promo_discount_amount");
                        }

                    }catch(Exception ex){
                        System.out.println("Error: " +ex.getMessage());
                    }
       
        if (model.getRowCount() != 0){
            for(int row=0; row<model.getColumnCount();row++){
                if (model.getValueAt(row, 0).equals(promo)){
                    JOptionPane.showMessageDialog(this, "The promo already exists in the active discounts table.", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
        
            }
        }else if(model.getRowCount() == 0){
            model.addRow(new String[]{name,String.format("%.2f", amount)});
        }
    }//GEN-LAST:event_addToActiveActionPerformed

    private void customMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customMouseClicked
        // TODO add your handling code here:
        
        if (custom.isSelected()){
            
            //customDiscount.setEnabled(true);
            //customAddFee.setEnabled(true);
            
        }else{
            customPanel.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
            caEnable.setEnabled(false);
            cdEnable.setEnabled(false);
            customDiscount.setEnabled(false);
            customAddFee.setEnabled(false);
        }
    }//GEN-LAST:event_customMouseClicked

    private void cdEnableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cdEnableMouseClicked
         if (cdEnable.isSelected()){
            customDiscount.setEnabled(true);
        }else{
            customDiscount.setEnabled(false);
        }
    }//GEN-LAST:event_cdEnableMouseClicked

    private void caEnableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caEnableMouseClicked
        // TODO add your handling code here:
        if(caEnable.isSelected()){
            customAddFee.setEnabled(true);
        }else{
            customAddFee.setEnabled(false);
        }
    }//GEN-LAST:event_caEnableMouseClicked

    private void addCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomActionPerformed
        // TODO add your handling code here:
        DefaultTableModel discountTableModel = (DefaultTableModel)activeDiscounts.getModel();
        DefaultTableModel feesTableModel = (DefaultTableModel)feesTable.getModel();
        
        custDisc = (Double)customDiscount.getValue();
        custFee = (Double)customAddFee.getValue();
        
        if ((custDisc>0 && !addedCustomDisc) && (cdEnable.isSelected())){
            discountTableModel.addRow(new String[]{"Custom", Double.toString(custDisc)});
            addedCustomDisc = true;
        }
        
        if ((custFee>0 && !addedCustomFee) && caEnable.isSelected()){
            feesTableModel.addRow(new String[]{"Custom", Double.toString(custFee)});
            addedCustomFee = true;
        }
        
    }//GEN-LAST:event_addCustomActionPerformed

    private void removeDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDiscountActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)activeDiscounts.getModel();
        
        if (activeDiscounts.getSelectedRow() != -1) {
            // remove selected row from the mode
           // String data = model.getValueAt(activeDiscounts.getSelectedRow() , 0).toString();
            model.removeRow(activeDiscounts.getSelectedRow());
            /*if (data.equals("Custom")){
                addedCustomDisc = false;
                custDisc=0;
            }else if (data.equals("10+1")){
                tenPlusOne = false;
            }*/
        }
    }//GEN-LAST:event_removeDiscountActionPerformed

    private void removeFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFeesActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)feesTable.getModel();
        
        if (feesTable.getSelectedRow() != -1) {
            // remove selected row from the mode
            String data = model.getValueAt(feesTable.getSelectedRow() , 0).toString();
            if (data.equals("Delivery Fee per Bottle")){
               JOptionPane.showMessageDialog(this, "Error! Delivery fee cannot be removed. Please uncheck the 'for delivery' button in the order page first.", "Error", JOptionPane.INFORMATION_MESSAGE);
            }else{
                model.removeRow(feesTable.getSelectedRow());
               /* if (data.equals("Custom")){
                    addedCustomFee = false;
                    custFee = 0;
                } */
            } 
        }
    }//GEN-LAST:event_removeFeesActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
         // TODO add your handling code here:
        DefaultTableModel discounts = (DefaultTableModel)activeDiscounts.getModel();
        DefaultTableModel fees = (DefaultTableModel)feesTable.getModel();
        feesTableValues.clear();
        discountTableValues.clear();
        for (int row = 0; row < discounts.getRowCount(); row++) {
            discountTableValues.put(discounts.getValueAt(row,0).toString(), Double.valueOf(discounts.getValueAt(row, 1).toString()));
        }
        
        for (int row = 0; row < fees.getRowCount(); row++) {
            feesTableValues.put(fees.getValueAt(row, 0).toString(),Double.valueOf(fees.getValueAt(row, 1).toString()));
        }
        calculateAll(false);
        cancelPressed = false;
        this.dispose();
        
    }//GEN-LAST:event_applyButtonActionPerformed
    public void calculateAll(Boolean cancel){
        DefaultTableModel discounts = (DefaultTableModel)activeDiscounts.getModel();
        DefaultTableModel fees = (DefaultTableModel)feesTable.getModel();
        
        if(!cancel){
            for (int row = 0; row < discounts.getRowCount(); row++) {
                Object rowData = discounts.getValueAt(row, 1);
                discountsTotal = discountsTotal + Double.parseDouble(rowData.toString());
            }
        
            for (int row = 0; row < fees.getRowCount(); row++) {
                Object rowData2 = fees.getValueAt(row, 1);
                feesTotal = feesTotal + Double.parseDouble(rowData2.toString());
            }
        }else{
            if (!feesTableValues.isEmpty()){
                for(Map.Entry<String,Double> set : feesTableValues.entrySet()){
                   feesTotal = feesTotal + set.getValue();
                }
            }
            
            if (!discountTableValues.isEmpty()){
                for(Map.Entry<String,Double>set: discountTableValues.entrySet()){
                    discountsTotal = discountsTotal+set.getValue();
                }
            }
        }
           
    }
    
    
    public void setActives(HashMap<String, Double> fees , HashMap<String, Double> discounts){
        if (fees != null){
            for (Map.Entry<String, Double> set : fees.entrySet()){
                feesTableValues.put(set.getKey(), set.getValue());
            }
        }
        
        if (discounts != null){
            for (Map.Entry<String, Double> set: discounts.entrySet()){
                discountTableValues.put(set.getKey(),set.getValue());
            }
        }
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
            java.util.logging.Logger.getLogger(orderAdjustments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderAdjustments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderAdjustments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderAdjustments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                orderAdjustments dialog = new orderAdjustments(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable activeDiscounts;
    private javax.swing.JButton addCustom;
    private javax.swing.JButton addToActive;
    private javax.swing.JButton applyButton;
    private javax.swing.JRadioButton caEnable;
    private javax.swing.JButton cancel;
    private javax.swing.JRadioButton cdEnable;
    private javax.swing.JRadioButton custom;
    private javax.swing.JSpinner customAddFee;
    private javax.swing.JSpinner customDiscount;
    private javax.swing.JPanel customPanel;
    private javax.swing.JComboBox<String> existingPromos;
    private javax.swing.JTable feesTable;
    private javax.swing.JLabel headerlogo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeDiscount;
    private javax.swing.JButton removeFees;
    // End of variables declaration//GEN-END:variables
}
