/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.EconomyRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.EconomyOrganization;
import Business.Organization.Vaccine;
import Business.Organization.VaccineDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.approveVaccine;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vraj
 */
public class EconomyWorkAreaJPanel extends javax.swing.JPanel {
        
    private JPanel userProcessContainer;
    private EconomyOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    private VaccineDirectory directory;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public EconomyWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EconomyOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        lblValue.setText(account.getEmployee().getName());
        populateTable();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        lblQuantity = new javax.swing.JLabel();
        lblDose = new javax.swing.JLabel();
        lblGap = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtDose = new javax.swing.JTextField();
        txtGap = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        separatorLine = new javax.swing.JSeparator();
        separatorLine1 = new javax.swing.JSeparator();
        separatorLine2 = new javax.swing.JSeparator();
        separatorLine3 = new javax.swing.JSeparator();
        lblTitle = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnApprove.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnApprove.setText("Approve Vaccine");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, -1, -1));

        btnReject.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnReject.setText("Reject Vaccine");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, -1, -1));

        tblWorkRequest.setBackground(new java.awt.Color(97, 212, 195));
        tblWorkRequest.setForeground(new java.awt.Color(36, 47, 65));
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Vaccine Name", "Sender", "Receiver", "Status"
            }
        ));
        tblWorkRequest.setGridColor(new java.awt.Color(97, 212, 195));
        tblWorkRequest.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblWorkRequest.setRowHeight(20);
        jScrollPane1.setViewportView(tblWorkRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 520, 180));

        lblQuantity.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Quantity per dose(in mg):");
        add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        lblDose.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblDose.setForeground(new java.awt.Color(255, 255, 255));
        lblDose.setText("Number of doses:");
        add(lblDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        lblGap.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblGap.setForeground(new java.awt.Color(255, 255, 255));
        lblGap.setText("Gap between dose(in days):");
        add(lblGap, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        txtQuantity.setBackground(new java.awt.Color(36, 47, 65));
        txtQuantity.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(255, 255, 255));
        txtQuantity.setBorder(null);
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 210, -1));

        txtDose.setBackground(new java.awt.Color(36, 47, 65));
        txtDose.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtDose.setForeground(new java.awt.Color(255, 255, 255));
        txtDose.setBorder(null);
        add(txtDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 220, 20));

        txtGap.setBackground(new java.awt.Color(36, 47, 65));
        txtGap.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtGap.setForeground(new java.awt.Color(255, 255, 255));
        txtGap.setBorder(null);
        txtGap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGapActionPerformed(evt);
            }
        });
        add(txtGap, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 230, -1));

        lblPrice.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setText("Price (in USD):");
        add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, -1));

        txtPrice.setBackground(new java.awt.Color(36, 47, 65));
        txtPrice.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice.setBorder(null);
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 250, -1));

        separatorLine.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 180, -1));

        separatorLine1.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine1.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine1.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 180, -1));

        separatorLine2.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine2.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine2.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 180, -1));

        separatorLine3.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine3.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine3.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 180, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ECONOMYWORKAREA.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 100, 850));

        lblText.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("Currently Logged in as:");
        add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 30));

        lblValue.setFont(new java.awt.Font("Optima", 1, 22)); // NOI18N
        lblValue.setForeground(new java.awt.Color(97, 212, 195));
        lblValue.setText("<value>");
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblWorkRequest.getModel();
        
        model.setRowCount(0);
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
    }
    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        if(txtGap.getText().equals("") || txtDose.getText().equals("") || txtPrice.getText().equals("") || txtQuantity.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all fields", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
        int selectedRow = tblWorkRequest.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        approveVaccine request = (approveVaccine)tblWorkRequest.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Vaccine already approved");
            return;
        }
     
        if(validate(txtQuantity.getText(),txtDose.getText(),txtGap.getText(),txtPrice.getText())){
        request.setStatus("Approved");
        request.getVaccine().setStatus("Approved");
        
        request.getVaccine().setMgQty(txtQuantity.getText());
        request.getVaccine().setNoOfDoses(Integer.parseInt(txtDose.getText()));
        request.getVaccine().setGap(Integer.parseInt(txtGap.getText()));
        request.getVaccine().setPrice(Double.parseDouble(txtPrice.getText()));
        populateTable();
        }
        dB4OUtil.storeSystem(system);
        txtGap.setText("");
        txtDose.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkRequest.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        approveVaccine request = (approveVaccine)tblWorkRequest.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Rejected") || request.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Vaccine already processed");
            return;
        }
     
        request.setStatus("Rejected");
        request.getVaccine().setStatus("Rejected");
        request.getVaccine().setMgQty(txtQuantity.getText());
        request.getVaccine().setNoOfDoses(Integer.parseInt(txtDose.getText()));
        request.getVaccine().setGap(Integer.parseInt(txtGap.getText()));
        populateTable();
    }//GEN-LAST:event_btnRejectActionPerformed

    private void txtGapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGapActionPerformed
        // TODO add your handling code here:
        if(Integer.parseInt(txtDose.getText())==1){
            txtGap.setText("0");
            txtGap.setEditable(false);
        }
        
        
    }//GEN-LAST:event_txtGapActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDose;
    private javax.swing.JLabel lblGap;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSeparator separatorLine;
    private javax.swing.JSeparator separatorLine1;
    private javax.swing.JSeparator separatorLine2;
    private javax.swing.JSeparator separatorLine3;
    private javax.swing.JTable tblWorkRequest;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtGap;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private boolean validate(String qty, String noDose, String gap, String price) {
        if(qty.length()<1){
            JOptionPane.showMessageDialog(this, "Please enter dosage quantity before approving");
            return false;
        }
        if(noDose.length()<1){
            JOptionPane.showMessageDialog(this, "Please enter number of doses before approving");
            return false;
        }
        if(gap.length()<1){
            JOptionPane.showMessageDialog(this, "Please enter gap between both doses before approving");
            return false;
        }
        if(price.length()<1){
            JOptionPane.showMessageDialog(this, "Please enter vaccine price before approving");
            return false;
        }
        return true;
    }
}
