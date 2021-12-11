<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ManufacturingRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.EconomyOrganization;
import Business.Organization.ManufacturingOrganization;
import Business.Organization.Organization;

import Business.WorkQueue.LabTestWorkRequest;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vraj
 */
public class ManufacturingWorkAreaJPanel extends javax.swing.JPanel {
        
    private JPanel userProcessContainer;
    private ManufacturingOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public ManufacturingWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ManufacturingOrganization organization, Enterprise enterprise) {
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

        btnSendSample = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
<<<<<<< HEAD

        setBackground(new java.awt.Color(36, 47, 65));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
=======
        jButton1 = new javax.swing.JButton();
>>>>>>> parent of f88db4b... All WR done

        btnSendSample.setText("Send Sample for approval");
        btnSendSample.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendSampleActionPerformed(evt);
            }
        });
        add(btnSendSample, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 391, -1, -1));

        jLabel1.setText("Manufacturing Work area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 78, -1, -1));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Status"
            }
        ));
        jScrollPane1.setViewportView(requestTable);

<<<<<<< HEAD
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 112, -1, 229));
=======
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
>>>>>>> parent of f88db4b... All WR done
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendSampleActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        LabTestWorkRequest lr = new LabTestWorkRequest();
        lr.setMessage("Please approve");
=======
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
>>>>>>> parent of f88db4b... All WR done
        lr.setSender(userAccount);
        lr.setStatus("requested");
        lr.setReceiver(userAccount);
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

<<<<<<< HEAD
=======
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.vaccineDirectory = vaccineDirectory;
        AddVaccineJPanel addVaccineJPanel = new AddVaccineJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), organization, vaccineDirectory);
        userProcessContainer.add("addVaccineJPanel", addVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

>>>>>>> parent of f88db4b... All WR done

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendSample;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest l : userAccount.getWorkQueue().getWorkRequestList()){
            
                Object[] row = new Object[2];
                row[0] = l.getStatus();
                model.addRow(row);
        }
    }
}
=======
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
        btnAddVaccine = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
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

        btnAddVaccine.setText("Add Vaccine");
        btnAddVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVaccineActionPerformed(evt);
            }
        });

        btnOrder.setText("Order Management");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jButton1.setText("Delete Vaccine");
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
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(238, 238, 238)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnSendSample)
                                    .addGap(50, 50, 50)
                                    .addComponent(btnAddVaccine)
                                    .addGap(14, 14, 14))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnOrder)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(137, 137, 137)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendSample)
                    .addComponent(btnAddVaccine))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrder)
                    .addComponent(jButton1))
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendSampleActionPerformed
        // TODO add your handling code here:
//        this.network = network;
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a vaccine record to send for approval");
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
        System.out.println("Outside for");
        for(Enterprise e: currnet.getEnterpriseDirectory().getEnterpriseList()){
            System.out.println("inside for");
            if(e.getEnterpriseType()==EnterpriseType.Government){
                System.out.println("gov ep");
                for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                    System.out.println("inside org");
                    for(UserAccount u: o.getUserAccountDirectory().getUserAccountList()){
                        System.out.println("inside user");
                        if(u.getRole().toString()=="Business.Role.EconomyRole"){
                            System.out.println("user found");
                            lr.setReceiver(u);
                            System.out.println(u.getUsername());
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

    private void btnAddVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVaccineActionPerformed
        // TODO add your handling code here:
        int count = requestTable.getModel().getRowCount();
        if(count == 0){
        this.vaccineDirectory = vaccineDirectory;
        AddVaccineJPanel addVaccineJPanel = new AddVaccineJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), organization, vaccineDirectory);
        userProcessContainer.add("addVaccineJPanel", addVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(this, "You already have a vaccine produced, please delete it to create a new one");
        }
    }//GEN-LAST:event_btnAddVaccineActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        OrdersJPanel orderJPanel = new OrdersJPanel(userProcessContainer, enterprise, enterprise.getOrganizationDirectory(), organization, userAccount);
        userProcessContainer.add("orderJPanel", orderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a vaccine record to delete");
            return;
        }
        Vaccine v = (Vaccine) requestTable.getModel().getValueAt(selectedRow, 0);
        organization.deleteVaccine(v);
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVaccine;
    private javax.swing.JButton btnOrder;
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
>>>>>>> main
