/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DistributionRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ServiceEnterprise;
import Business.Network.Network;
import Business.Organization.DistributionOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.requestVaccine;
import Business.WorkQueue.vaccinate;
import Business.WorkQueue.vaccineCount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vraj
 */
public class DistributionWorkAreaJPanel extends javax.swing.JPanel {
        
    private JPanel userProcessContainer;
    private DistributionOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    public int currEP;
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public DistributionWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DistributionOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        
        currEP = ((ServiceEnterprise) enterprise).getVaccineCount();
        txtvaccineCount.setEnabled(false);
        txtvaccineCount.setEditable(false);
        System.out.println(currEP);
        txtvaccineCount.setText(Integer.toString(currEP));
        populateTable();
        populateCount();
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
        jTable1 = new javax.swing.JTable();
        btnSchedule = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtvaccineCount = new javax.swing.JTextField();
        VaccinationjDateChooser = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("DIstrubutor Work Area");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Status", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnSchedule.setText("Schedule");
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        jLabel2.setText("Current Vaccine Count");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGap(64, 64, 64)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33))
                                .addContainerGap()
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(VaccinationjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtvaccineCount))))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtvaccineCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSchedule)
                    .addComponent(VaccinationjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        // TODO add your handling code here:
//        System.out.println(VaccinationjDateChooser.getDate().toString());
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a person's request to schedule");
            return;
        }
        try{
        if(VaccinationjDateChooser.getDate().toString().length()<1){
            JOptionPane.showMessageDialog(this, "Please choose a date to schedule vaccination");
            return;
        }
        }
        catch(NullPointerException e){
            System.out.println("Null exception caught");
            JOptionPane.showMessageDialog(this, "Please select a date");
            return;
        }
        vaccinate req = (vaccinate)jTable1.getValueAt(selectedRow, 0);
        if(req.getStatus() == "Approved"){
            JOptionPane.showMessageDialog(this, "Person is already scheduled a vaccination slot");
            return;
        }
        req.setDate(VaccinationjDateChooser.getDate().toString());
        System.out.print(VaccinationjDateChooser.getDate().toString());
        req.setStatus("Approved");
        System.out.println(enterprise.getName());
        JOptionPane.showMessageDialog(this, "Vaccination Scheduled");
    }//GEN-LAST:event_btnScheduleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser VaccinationjDateChooser;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtvaccineCount;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for(WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            if(wr instanceof vaccinate){
            row[0] = wr;
            row[1] = wr.getReceiver();
            row[2] = wr.getStatus();
            String Date = ((vaccinate) wr).getDate();
            row[3] = Date;
            model.addRow(row);
        }
        }
    }

    private void populateCount() {
        for(WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()){
            if(wr instanceof requestVaccine){
                int i = ((requestVaccine) wr).getCount();
                txtvaccineCount.setText(Integer.toString(i));
            }
        }
    }
}
