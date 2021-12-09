/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ManufacturingRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Organization.EconomyOrganization;
import Business.Organization.ManufacturingOrganization;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.Vaccine;
import Business.Organization.VaccineDirectory;
import Business.Role.EconomyRole;
import Business.Role.Role;
//import Business.Role;

import Business.WorkQueue.LabTestWorkRequest;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.approveVaccine;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.AdministrativeRole.ManageOrganizationJPanel;

/**
 *
 * @author vraj
 */
public class ManufacturingWorkAreaJPanel extends javax.swing.JPanel {
        
    private Network network;
    private EcoSystem system;
    private JPanel userProcessContainer;
    private ManufacturingOrganization organization;
    private Enterprise enterprise;
    private VaccineDirectory vaccineDirectory;
    private UserAccount userAccount;
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public ManufacturingWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ManufacturingOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
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

        btnSendSample = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        btnSendSample.setText("Send Sample for approval");
        btnSendSample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendSampleActionPerformed(evt);
            }
        });

        jLabel1.setText("Manufacturing Work area");

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Vaccine Name", "Scientific Name", "Manufacturer Name", "Quantity per dose", "Number of Doses", "Status"
            }
        ));
        jScrollPane1.setViewportView(requestTable);

        jButton1.setText("Add Vaccine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnSendSample)
                        .addGap(50, 50, 50)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendSample)
                    .addComponent(jButton1))
                .addGap(129, 129, 129))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendSampleActionPerformed
        // TODO add your handling code here:
//        this.network = network;
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        approveVaccine lr = new approveVaccine();
        Vaccine v = (Vaccine) requestTable.getValueAt(selectedRow, 0);
        if(v.getStatus().equals("Approved")){
            JOptionPane.showMessageDialog(this, "Vaccine already approved!!");
            return;
        }
        if(v.getStatus().equals("Rejected")){
            JOptionPane.showMessageDialog(this, "Vaccine was rejected, please send new vaccine for approval");
            return;
        }
        UserAccount cg = new UserAccount();
        Network currnet = enterprise.getNetwork();
        for(Enterprise e: currnet.getEnterpriseDirectory().getEnterpriseList()){
            if(e.getEnterpriseType()==EnterpriseType.Government){
                for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount u: o.getUserAccountDirectory().getUserAccountList()){
                        if(u.getRole().toString()=="Business.Role.EconomyRole"){
                            lr.setReceiver(u);
                            cg = u;
                            break;
                        }                        
                        
                    }
                }
            }
        }
        lr.setVaccine(v);
        lr.setMessage(v.getName());
        lr.setSender(userAccount);
        lr.setStatus("requested");
        cg.getWorkQueue().getWorkRequestList().add(lr);
        JOptionPane.showMessageDialog(this, "Approval Requested!!");
        populateTable();
        
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof EconomyOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(lr);
            userAccount.getWorkQueue().getWorkRequestList().add(lr);
        }
    }//GEN-LAST:event_btnSendSampleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.vaccineDirectory = vaccineDirectory;
        AddVaccineJPanel addVaccineJPanel = new AddVaccineJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), organization, vaccineDirectory);
        userProcessContainer.add("addVaccineJPanel", addVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendSample;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
        model.setRowCount(0);
        
        for(Vaccine v : organization.getVaccineDirectory()){
            Object[] row = new Object[6];
            row[0] = v;
            row[1] = v.getScientificName();
            row[2] = v.getManufacturerName();
            row[3] = v.getMgQty();
            row[4] = v.getNoOfDoses();
            row[5] = v.getStatus();
            model.addRow(row);
        }
    }
}
