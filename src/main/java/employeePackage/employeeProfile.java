/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employeePackage;
import connectionSql.mysqlConnection;
/**
 *
 * @author rjber
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class employeeProfile extends javax.swing.JFrame {

    /**
     * Creates new form employeeProfile
     */
    Connection con = new mysqlConnection().getCon();
    public employeeProfile() {
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
        headerlogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        addEmployee = new javax.swing.JButton();
        viewEmployee = new javax.swing.JButton();
        deleteEmployee = new javax.swing.JButton();
        home = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        selectBranch = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employees");
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
                .addContainerGap()
                .addComponent(headerlogo)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(headerlogo))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Employees");

        employeeTable.setAutoCreateRowSorter(true);
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Role", "Contact No."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        addEmployee.setBackground(new java.awt.Color(40, 75, 135));
        addEmployee.setForeground(new java.awt.Color(255, 255, 255));
        addEmployee.setText("Add Employee");
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });

        viewEmployee.setBackground(new java.awt.Color(40, 75, 135));
        viewEmployee.setForeground(new java.awt.Color(255, 255, 255));
        viewEmployee.setText("View Employee Details");
        viewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmployeeActionPerformed(evt);
            }
        });

        deleteEmployee.setBackground(new java.awt.Color(255, 0, 0));
        deleteEmployee.setForeground(new java.awt.Color(255, 255, 255));
        deleteEmployee.setText("Delete employee ");
        deleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(40, 75, 135));
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });

        selectBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBranchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel1.setText("Select Branch:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        jLabel2.setText("Search:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addEmployee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewEmployee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteEmployee))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(home))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(home)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteEmployee)
                    .addComponent(viewEmployee)
                    .addComponent(addEmployee))
                .addGap(43, 43, 43))
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

    private void viewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmployeeActionPerformed
        // TODO add your handling code here:
        //DefaultTableModel model = (DefaultTableModel)employeeTable.getModel();
     
        
        if (employeeTable.getSelectedRow() > -1){
            int idRow = employeeTable.getSelectedRow();
            String selectedID = employeeTable.getModel().getValueAt(idRow,0).toString();

            employeeInfo viewEmployee = new employeeInfo(this,false);
            viewEmployee.employeeID = selectedID;
            viewEmployee.setVisible(true);
            
            viewEmployee.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e)
            {
             loadBranch();
            }
          });
        }
        
        
    }//GEN-LAST:event_viewEmployeeActionPerformed

    private void deleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)employeeTable.getModel();
        //customerTable.getModel()
        int idColumn = 0;
        int idRow = employeeTable.getSelectedRow();
        String selectedID = employeeTable.getModel().getValueAt(idRow,idColumn).toString();
        String sql = "DELETE FROM employee WHERE employee_id='"+selectedID + "'";
        String sqlHistory = "DELETE FROM employee_branch_history WHERE employee_id = " +selectedID+";";
        try{
            PreparedStatement pst = con.prepareStatement(sqlHistory);
            pst.executeUpdate();
            
            PreparedStatement pst2 = con.prepareStatement(sql);
            pst2.executeUpdate();
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        
        if (employeeTable.getSelectedRow() != -1) {
            // remove selected row from the model
            model.removeRow(employeeTable.getSelectedRow());
        }
        
    }//GEN-LAST:event_deleteEmployeeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:     
        
        setBranches();
        loadBranch();
    }//GEN-LAST:event_formWindowOpened

   
    private void setBranches(){
        String sql = "SELECT branch_name FROM branch;";
        DefaultComboBoxModel model = (DefaultComboBoxModel) selectBranch.getModel();
        
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                model.addElement(rs.getString("branch_name"));
            }
            
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        
        selectBranch.setModel(model);
        // setting model with new data
       loadBranch();
    }
    
    private void loadBranch(){
        
        String defaultBranch = "'"+selectBranch.getSelectedItem().toString().trim()+"'";
        
        String sql2 = "SELECT branch_id FROM branch WHERE branch_name = "+defaultBranch+";";
        String branch_id = "";
        try{
            PreparedStatement getBranch = con.prepareStatement(sql2);
            ResultSet set2 = getBranch.executeQuery();
            while(set2.next()){
                branch_id = set2.getString("branch_id");
            }
        }catch(Exception ex){
            System.out.println("Error: "+ ex.getMessage());
        }
        
        branchFilterTable(branch_id);
    }
    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        // TODO add your handling code here:
        employeeNew addEmployee = new employeeNew(this,true);
        addEmployee.setVisible(true);
        addEmployee.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e)
            {
             loadBranch();
            }
          });
        
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
        // TODO add your handling code here:
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) employeeTable.getModel()));
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchField.getText()));
        employeeTable.setRowSorter(sorter);
    }//GEN-LAST:event_searchFieldKeyTyped

    private void selectBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBranchActionPerformed
       String branch = "'"+selectBranch.getSelectedItem().toString().trim()+"'";
       
       String sql = "SELECT branch_id FROM branch WHERE branch_name = "+branch+";";
       String branchID ="";
       
       
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                branchID = rs.getString("branch_id");
            }
            
        }catch(Exception ex){
            System.out.println("Error:" + ex.getMessage());
        }
        
       
        branchFilterTable(branchID);
        
    }//GEN-LAST:event_selectBranchActionPerformed

    private void branchFilterTable(String id){
        DefaultTableModel model = (DefaultTableModel)employeeTable.getModel();
        
        model.setRowCount(0);
        String sql = "SELECT employee_id, concat(last_name,', ',first_name,' ', middle_name), employee_role, contact_num FROM employee WHERE branch_id = "+id+";";
        
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4)});
            }
            
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
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
            java.util.logging.Logger.getLogger(employeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployee;
    private javax.swing.JButton deleteEmployee;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel headerlogo;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> selectBranch;
    private javax.swing.JButton viewEmployee;
    // End of variables declaration//GEN-END:variables
}
