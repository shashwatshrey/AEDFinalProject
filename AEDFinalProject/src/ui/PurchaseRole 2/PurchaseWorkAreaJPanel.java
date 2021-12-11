/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PurchaseRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ServiceEnterprise;
import Business.Network.Network;
import Business.Organization.DistributionOrganization;
import Business.Organization.Organization;
import Business.Organization.PurchaseInventory;
import Business.Organization.PurchaseOrganization;
import Business.Organization.VaccineCount;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.requestVaccine;
import Business.WorkQueue.vaccineCount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.ManufacturingRole.AddVaccineJPanel;

/**
 *
 * @author vraj
 */
public class PurchaseWorkAreaJPanel extends javax.swing.JPanel {
        
    private JPanel userProcessContainer;
    private PurchaseOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    public int currEP;
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public PurchaseWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PurchaseOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        currEP = ((ServiceEnterprise) enterprise).getVaccineCount();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineTable = new javax.swing.JTable();
        btnreqVaccine = new javax.swing.JButton();

        jLabel1.setText("Purchase Work Area");

        vaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Quantity", "Status"
            }
        ));
        jScrollPane1.setViewportView(vaccineTable);

        btnreqVaccine.setText("Request Vaccine");
        btnreqVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreqVaccineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnreqVaccine)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnreqVaccine)
                .addContainerGap(226, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnreqVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreqVaccineActionPerformed
        // TODO add your handling code here:
        RequestVaccineJPanel requestVaccineJPanel = new RequestVaccineJPanel(enterprise.getOrganizationDirectory(), userProcessContainer, organization, enterprise, userAccount);
        userProcessContainer.add("requestVaccineJPanel", requestVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnreqVaccineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreqVaccine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable vaccineTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) vaccineTable.getModel();
        model.setRowCount(0);
        UserAccount distributor = new UserAccount();
        try{
        for(WorkRequest rv:userAccount.getWorkQueue().getWorkRequestList()){
            System.out.println(enterprise.getName());
        ArrayList<PurchaseInventory> inv = ((requestVaccine) rv).getInventoryPurchase();
            Object row[] = new Object[4];
            row[0] = rv;
            row[1] = rv.getReceiver().getUsername();
            if(inv!=null){
            for(PurchaseInventory p : inv){
                int c = ((requestVaccine) rv).getCount();
                row[2] = p.getQty();
                
                if(rv.getStatus().equals("Approved")){
                System.out.println(enterprise.getName());
                for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount u : o.getUserAccountDirectory().getUserAccountList()){
                        System.out.println(u.getRole().toString());
                        if(u.getRole().toString().equals("Business.Role.DistributionRole")){
                            ((requestVaccine) rv).setDistribution(u);
                            distributor = u;
//                            System.out.println(o.getName());
//                            VaccineCount vc = new VaccineCount();
//                            vc.setVaccineName(rv.getReceiver().toString());
//                            vc.setCount(p.getQty());
//                            currEP += p.getQty();
                            System.out.println(p.getQty());
                            c+=p.getQty();
                            System.out.println(c);
                            
//                            DistributionOrganization org = ((DistributionOrganization) o).getVaccineDirectory().add(vc);
                        }
                    }
                }
            }
                ((requestVaccine) rv).setCount(c);
                distributor.getWorkQueue().getWorkRequestList().add(rv);
                
            }
            }
            row[3] = rv.getStatus();
            System.out.println(rv.getStatus());
            
//            row[2] = 
            model.addRow(row);
        }
        }
        catch(NullPointerException e){
            System.out.println("No records found");
        }
    }
}
