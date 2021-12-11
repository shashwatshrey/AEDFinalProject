/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ManufacturingRole;

import Business.Enterprise.Enterprise;
import Business.Organization.ManufacturingOrganization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.Vaccine;
import Business.Organization.VaccineDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author abhis
 */
public class AddVaccineJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private ManufacturingOrganization organization;
    private VaccineDirectory vaccineDirectory;
    /**
     * Creates new form AddVaccineJPanel
     */
    public AddVaccineJPanel(JPanel userProcessContainer, OrganizationDirectory directory, ManufacturingOrganization organization, VaccineDirectory vaccineDirectory) {
        initComponents();
        this.directory = directory;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.vaccineDirectory = vaccineDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAddVaccine = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtScientificName = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();

        setBackground(new java.awt.Color(36, 47, 65));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setText("Add Vaccine");
        add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 6, -1, -1));

        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 53, -1, -1));

        jLabel1.setText("Scientific Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 102, -1, -1));

        btnAddVaccine.setText("Add");
        btnAddVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVaccineActionPerformed(evt);
            }
        });
        add(btnAddVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 202, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 48, 86, -1));
        add(txtScientificName, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 97, 86, -1));

        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 202, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVaccineActionPerformed
        // TODO add your handling code here:
        if(validate(txtName.getText(), txtScientificName.getText())){
            Vaccine newVaccine = new Vaccine();
            newVaccine.setName(txtName.getText());
            newVaccine.setScientificName(txtScientificName.getText());
            newVaccine.setManufacturerName(organization.getName());
            newVaccine.setStatus("Pending");
            organization.addVaccine(newVaccine);
            JOptionPane.showMessageDialog(this, "Vaccine Added");
        }
        txtName.setText("");
        txtScientificName.setText("");
    }//GEN-LAST:event_btnAddVaccineActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVaccine;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtScientificName;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables

    private boolean validate(String name, String sciName) {
        //To change body of generated methods, choose Tools | Templates.
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Name cannot be empty");
            return false;
        }
        if(sciName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Scientific Name cannot be empty");
            return false;
        }
        return true;
    }
}
