/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author sunny
 */

public class Department extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * Creates new form ManageDepartment
     */
    
    public Department() {
        initComponents();
        conn=javaMySqlConnect.ConnectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDeptIdMD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDeptNameMD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescriptionMD = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDeptList = new javax.swing.JTable();
        btnAddDept = new javax.swing.JButton();
        btnDeleteDept = new javax.swing.JButton();
        btnUpdateDept = new javax.swing.JButton();
        btnClearDept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Department - Hospital Manager");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DEPARTMENT MANAGER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), java.awt.Color.darkGray)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setForeground(java.awt.Color.darkGray);
        jLabel4.setText("Dept. ID");

        txtDeptIdMD.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtDeptIdMD.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.darkGray);
        jLabel5.setText("Dept. Name");

        txtDeptNameMD.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtDeptNameMD.setToolTipText("Enter valid department name.");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setForeground(java.awt.Color.darkGray);
        jLabel6.setText("Description");

        txtDescriptionMD.setColumns(20);
        txtDescriptionMD.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtDescriptionMD.setRows(5);
        txtDescriptionMD.setToolTipText("Enter the short description about the department.");
        jScrollPane3.setViewportView(txtDescriptionMD);

        tblDeptList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDeptList.setToolTipText("Select the department to edit or update.");
        tblDeptList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDeptListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDeptList);

        btnAddDept.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAddDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addnew.png"))); // NOI18N
        btnAddDept.setText("Add");
        btnAddDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeptActionPerformed(evt);
            }
        });

        btnDeleteDept.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnDeleteDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnDeleteDept.setText("Delete");
        btnDeleteDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDeptActionPerformed(evt);
            }
        });

        btnUpdateDept.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnUpdateDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnUpdateDept.setText("Update");
        btnUpdateDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDeptActionPerformed(evt);
            }
        });

        btnClearDept.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnClearDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnClearDept.setText("Clear");
        btnClearDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearDeptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddDept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteDept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateDept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearDept)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDeptIdMD, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDeptNameMD)))
                        .addGap(12, 12, 12))))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddDept, btnClearDept, btnDeleteDept, btnUpdateDept});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeptIdMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtDeptNameMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDept)
                    .addComponent(btnDeleteDept)
                    .addComponent(btnUpdateDept)
                    .addComponent(btnClearDept))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(889, 633));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Program to fill Department List Table
    public void getDeptDataToTable(){
        try{
            String sql="Select * from department";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblDeptList.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //Program to fill Dept. ID Field    
    public void getDeptDataCount(){
         try{
            String sql="Select * from department";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            int deptID=1;
            while(rs.next()){
                deptID= Integer.parseInt(rs.getString("dept_ID"));
                deptID++;
            }
            txtDeptIdMD.setText(String.valueOf(deptID));
            txtDeptNameMD.setText("");
            txtDescriptionMD.setText("");
            pst.close();
        }
        catch(SQLException | NumberFormatException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private static Department obj=null;
    public static Department getObj(){
        if(obj==null){
            obj=new Department();
        }
        return obj;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        getDeptDataToTable();
        getDeptDataCount();
    }//GEN-LAST:event_formWindowOpened
    //Program to add new Department on Department Database
    public void addDepartment(){
         if(!"".equals(txtDeptIdMD.getText()) && !"".equals(txtDeptNameMD.getText()) && !"".equals(txtDescriptionMD.getText())){
            try{
                String sql="Insert into department (dept_ID,dept_Name,dept_Description)values(?,?,?)";
                pst=conn.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(txtDeptIdMD.getText()));
                pst.setString(2, txtDeptNameMD.getText());
                pst.setString(3, txtDescriptionMD.getText());
                pst.execute();
                pst.close();
                JOptionPane.showMessageDialog(null, "Data Saved.");
                getDeptDataCount();
                getDeptDataToTable();
            }
            catch(SQLException | NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Data with same Dept. ID already exist. Press [Clear] to get new Dept. ID.");
            }
        }
         else{
             JOptionPane.showMessageDialog(null, "Empty data cannot be saved.");
         }
    }
    private void btnAddDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeptActionPerformed
        // TODO add your handling code here:
       addDepartment();
    }//GEN-LAST:event_btnAddDeptActionPerformed
    //Fill selected table datarow data to fields
    public void getTblData(){
        try{
            int row=tblDeptList.getSelectedRow();
            String tblClick=tblDeptList.getModel().getValueAt(row, 0).toString();
            String sql="Select * from department where dept_ID='"+tblClick+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                txtDeptIdMD.setText(rs.getString("dept_ID"));
                txtDeptNameMD.setText(rs.getString("dept_Name"));
                txtDescriptionMD.setText(rs.getString("dept_Description"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }        
    }
    private void tblDeptListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDeptListMouseClicked
        // TODO add your handling code here:
        getTblData();
    }//GEN-LAST:event_tblDeptListMouseClicked
    //Delete selected data from database
    public void deleteDept(){
        if(!"".equals(txtDeptNameMD.getText()) && !"".equals(txtDescriptionMD.getText())){
            try{
                String sql="Delete from department where dept_ID='"+txtDeptIdMD.getText()+"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data deleted from database");
                getDeptDataToTable();
                getDeptDataCount();
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Data does not exist on database.");
        }
    }
    private void btnDeleteDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDeptActionPerformed
        // TODO add your handling code here:
        deleteDept();
    }//GEN-LAST:event_btnDeleteDeptActionPerformed
    //Update selected Department on Database
    public void updateDept(){
        if(!"".equals(txtDeptNameMD.getText()) && !"".equals(txtDescriptionMD.getText())){
            try{
                String sql="Update department set dept_Name=?, dept_Description=? where dept_ID='"+txtDeptIdMD.getText()+"'";
                pst=conn.prepareStatement(sql);
                pst.setString(1, txtDeptNameMD.getText());
                pst.setString(2, txtDescriptionMD.getText());
                pst.execute();
                pst.close();
                JOptionPane.showMessageDialog(null, "Data updated on database");
                getDeptDataToTable();
                getDeptDataCount();
            }
            catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Data does not exist on database.");
        }
    }
    private void btnUpdateDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDeptActionPerformed
        // TODO add your handling code here:
        updateDept();
    }//GEN-LAST:event_btnUpdateDeptActionPerformed

    private void btnClearDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearDeptActionPerformed
        // TODO add your handling code here:
        getDeptDataToTable();
        getDeptDataCount();
    }//GEN-LAST:event_btnClearDeptActionPerformed

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
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDept;
    private javax.swing.JButton btnClearDept;
    private javax.swing.JButton btnDeleteDept;
    private javax.swing.JButton btnUpdateDept;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblDeptList;
    private javax.swing.JTextField txtDeptIdMD;
    private javax.swing.JTextField txtDeptNameMD;
    private javax.swing.JTextArea txtDescriptionMD;
    // End of variables declaration//GEN-END:variables
}
