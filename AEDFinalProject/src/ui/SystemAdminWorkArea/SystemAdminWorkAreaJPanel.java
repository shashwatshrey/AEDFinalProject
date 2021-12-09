/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author vraj
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        onePanel = new javax.swing.JPanel();
        lblNetwork = new javax.swing.JLabel();
        twoPanel = new javax.swing.JPanel();
        lblEnterprise = new javax.swing.JLabel();
        threePanel = new javax.swing.JPanel();
        lblProfile = new javax.swing.JLabel();
        cardWorkPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(36, 47, 65));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(23, 35, 51));
        background.setFocusTraversalKeysEnabled(false);
        background.setMaximumSize(new java.awt.Dimension(1440, 848));
        background.setMinimumSize(new java.awt.Dimension(1440, 848));
        background.setPreferredSize(new java.awt.Dimension(1440, 848));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(36, 47, 65));
        menuPanel.setMaximumSize(new java.awt.Dimension(200, 848));
        menuPanel.setMinimumSize(new java.awt.Dimension(200, 848));
        menuPanel.setPreferredSize(new java.awt.Dimension(200, 848));

        onePanel.setBackground(new java.awt.Color(36, 47, 65));
        onePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                onePanelMousePressed(evt);
            }
        });

        lblNetwork.setFont(new java.awt.Font("Optima", 1, 16)); // NOI18N
        lblNetwork.setForeground(new java.awt.Color(255, 255, 255));
        lblNetwork.setText("CREATE NETWORK ");

        javax.swing.GroupLayout onePanelLayout = new javax.swing.GroupLayout(onePanel);
        onePanel.setLayout(onePanelLayout);
        onePanelLayout.setHorizontalGroup(
            onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, onePanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lblNetwork)
                .addGap(20, 20, 20))
        );
        onePanelLayout.setVerticalGroup(
            onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNetwork, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        twoPanel.setBackground(new java.awt.Color(36, 47, 65));
        twoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                twoPanelMousePressed(evt);
            }
        });

        lblEnterprise.setFont(new java.awt.Font("Optima", 1, 16)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterprise.setText("CREATE ENTERPRISE");

        javax.swing.GroupLayout twoPanelLayout = new javax.swing.GroupLayout(twoPanel);
        twoPanel.setLayout(twoPanelLayout);
        twoPanelLayout.setHorizontalGroup(
            twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(twoPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblEnterprise)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        twoPanelLayout.setVerticalGroup(
            twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(twoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        threePanel.setBackground(new java.awt.Color(36, 47, 65));
        threePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                threePanelMousePressed(evt);
            }
        });

        lblProfile.setFont(new java.awt.Font("Optima", 1, 16)); // NOI18N
        lblProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblProfile.setText("CREATE ADMIN PROFILE");

        javax.swing.GroupLayout threePanelLayout = new javax.swing.GroupLayout(threePanel);
        threePanel.setLayout(threePanelLayout);
        threePanelLayout.setHorizontalGroup(
            threePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(threePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        threePanelLayout.setVerticalGroup(
            threePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(threePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(onePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(twoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(threePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(onePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(twoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(threePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cardWorkPanel.setBackground(new java.awt.Color(36, 47, 65));
        cardWorkPanel.setPreferredSize(new java.awt.Dimension(1240, 848));
        cardWorkPanel.setLayout(new java.awt.CardLayout());
        background.add(cardWorkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void threePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threePanelMousePressed
        // TODO add your handling code here:
        setColor(threePanel);
        resetColor(new JPanel[]{twoPanel,onePanel});
        ManageEnterpriseAdminJPanel manageEnterpriseAdminPanel = new ManageEnterpriseAdminJPanel(cardWorkPanel, ecosystem);
        cardWorkPanel.add("ManageEnterpriseAdminJPanel",manageEnterpriseAdminPanel);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_threePanelMousePressed

    private void twoPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoPanelMousePressed
        // TODO add your handling code here:
        setColor(twoPanel);
        resetColor(new JPanel[]{onePanel,threePanel});
        ManageEnterpriseJPanel manageEnterprisePanel = new ManageEnterpriseJPanel(cardWorkPanel, ecosystem);
        cardWorkPanel.add("ManageEnterprisePanel",manageEnterprisePanel);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_twoPanelMousePressed

    private void onePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onePanelMousePressed
        // TODO add your handling code here:
        setColor(onePanel);
        resetColor(new JPanel[]{twoPanel,threePanel});
        ManageNetworkJPanel manageNetworkPanel = new ManageNetworkJPanel(cardWorkPanel, ecosystem);
        cardWorkPanel.add("ManageNetworkJPanel",manageNetworkPanel);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_onePanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel cardWorkPanel;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel onePanel;
    private javax.swing.JPanel threePanel;
    private javax.swing.JPanel twoPanel;
    // End of variables declaration//GEN-END:variables
    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(23,35,51));
    }
    private void resetColor(JPanel [] pane)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(36,47,65));
           
        }
    }
}
