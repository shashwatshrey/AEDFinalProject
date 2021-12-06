/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.EconomyOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
//import Business.WorkQueue.LabTestWorkRequest;
//import Business.WorkQueue.WorkRequest;
//import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vraj
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());
        //populateRequestTable();
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

        jLabel1 = new javax.swing.JLabel();
        btnTest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();

        jLabel1.setText("Doctor Work Area");

        btnTest.setText("Test Record");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ));
        jScrollPane1.setViewportView(requestTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTest)
                        .addGap(588, 588, 588))))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnTest)
                .addGap(77, 77, 77))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        // TODO add your handling code here:
         LabTestWorkRequest lr = new LabTestWorkRequest();
        lr.setMessage("Please approve");
        lr.setSender(userAccount);
        lr.setStatus("requested");
        lr.setReceiver(userAccount);
        JOptionPane.showMessageDialog(this, "Approval Requested!!");
        populateTable();
        
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof LabOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(lr);
            userAccount.getWorkQueue().getWorkRequestList().add(lr);
        }
    }//GEN-LAST:event_btnTestActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)requestTable.getModel();
        
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
}
