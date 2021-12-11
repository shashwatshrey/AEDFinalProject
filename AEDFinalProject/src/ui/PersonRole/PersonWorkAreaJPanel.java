/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PersonRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PersonOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.appointment;
import Business.WorkQueue.vaccinate;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abhis
 */
public class PersonWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonWorkAreaJPanel
     */
     private JPanel userProcessContainer;
     private UserAccount account;
     private PersonOrganization organization;
     private Enterprise enterprise;
     private EcoSystem business;
    
    public PersonWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PersonOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        populateVaccineTable();
        populateAppointmentTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnvcn = new javax.swing.JButton();
        btnappt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        VaccinationRequestjTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppointmentjTable = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        btnvcn.setText("Schedule Vaccination");
        btnvcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvcnActionPerformed(evt);
            }
        });

        btnappt.setText("Schedule Appointment");
        btnappt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapptActionPerformed(evt);
            }
        });

        VaccinationRequestjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Vaccination Date", "Status", "Distribution Center", "Vaccine Name"
            }
        ));
        jScrollPane2.setViewportView(VaccinationRequestjTable);

        AppointmentjTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(AppointmentjTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnvcn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnappt))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnvcn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnappt)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnvcnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvcnActionPerformed
        // TODO add your handling code here:
        ScheduleVaccineJPanel scheduleVaccineJPanel = new ScheduleVaccineJPanel(userProcessContainer, organization, enterprise, business, account);
        userProcessContainer.add("scheduleVaccineJPanel", scheduleVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnvcnActionPerformed

    private void btnapptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapptActionPerformed
        // TODO add your handling code here:
        ScheduleAppointmentJPanel scheduleAppointmentJPanel = new ScheduleAppointmentJPanel(userProcessContainer, organization, enterprise, business, account);
        userProcessContainer.add("scheduleAppointmentJPanel", scheduleAppointmentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnapptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentjTable;
    private javax.swing.JTable VaccinationRequestjTable;
    private javax.swing.JButton btnappt;
    private javax.swing.JButton btnvcn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void populateVaccineTable() {
        DefaultTableModel model = (DefaultTableModel) VaccinationRequestjTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest wr : account.getWorkQueue().getWorkRequestList()){
           Object[] row = new Object[5];
           
           if(wr instanceof vaccinate){
           String Date = ((vaccinate) wr).getDate();
           try{
           if(Date.length()>0){
           row[0] = wr;
           row[1] = Date;
           row[2] = wr.getStatus();
           String dc = ((vaccinate) wr).getDistributionCenter();
           row[3] = dc;
           row[4] = null;
           model.addRow(row);
        }
        }
        catch(NullPointerException e){
                System.out.println("Null Pointer Exception caught");
                }
    }
        }
    }

    private void populateAppointmentTable() {
        DefaultTableModel model = (DefaultTableModel) AppointmentjTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest wr : account.getWorkQueue().getWorkRequestList()){
           Object[] row = new Object[4];
           if(wr instanceof appointment){
           String hospitalName = ((appointment) wr).getHospitalName();
           if(hospitalName.length()!=0){
           row[0] = wr;
           String Date = ((appointment) wr).getDate();
           row[1] = hospitalName;
           row[2] = wr.getStatus();
           row[3] = Date;
           
           model.addRow(row);
           }
        }
        }
    }
}