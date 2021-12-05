/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.EconomyRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EconomyOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author vraj
 */
public class EconomyWorkAreaJPanel extends javax.swing.JPanel {
        
    private JPanel userProcessContainer;
    private EconomyOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public EconomyWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EconomyOrganization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        
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
        jTextField1 = new javax.swing.JTextField();

        btnApprove.setText("Approve Vaccine");

        btnReject.setText("Reject Vaccine");

        jTextField1.setText("EconomyWorkArea");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addComponent(btnApprove)
                .addGap(18, 18, 18)
                .addComponent(btnReject)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addGap(170, 170, 170))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
