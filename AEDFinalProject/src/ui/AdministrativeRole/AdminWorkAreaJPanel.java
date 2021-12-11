

package ui.AdministrativeRole;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        enterpriseLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        onePanel = new javax.swing.JPanel();
        lblOrganizations = new javax.swing.JLabel();
        iconOrganizations = new javax.swing.JLabel();
        twoPanel = new javax.swing.JPanel();
        lblEmployees = new javax.swing.JLabel();
        iconEmployees = new javax.swing.JLabel();
        threePanel = new javax.swing.JPanel();
        lblUsers = new javax.swing.JLabel();
        iconUsers = new javax.swing.JLabel();
        cardWorkPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(36, 47, 65));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(36, 47, 65));
        menuPanel.setMaximumSize(new java.awt.Dimension(250, 848));
        menuPanel.setMinimumSize(new java.awt.Dimension(250, 848));
        menuPanel.setPreferredSize(new java.awt.Dimension(250, 848));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("Enterprise:");
        menuPanel.add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("<value>");
        menuPanel.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, 30));

        onePanel.setBackground(new java.awt.Color(36, 47, 65));
        onePanel.setMaximumSize(new java.awt.Dimension(250, 40));
        onePanel.setMinimumSize(new java.awt.Dimension(250, 40));
        onePanel.setPreferredSize(new java.awt.Dimension(250, 40));
        onePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onePanelMouseClicked(evt);
            }
        });

        lblOrganizations.setFont(new java.awt.Font("Optima", 1, 16)); // NOI18N
        lblOrganizations.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrganizations.setText("Manage Organizations");
        lblOrganizations.setMaximumSize(new java.awt.Dimension(180, 20));
        lblOrganizations.setMinimumSize(new java.awt.Dimension(180, 20));
        lblOrganizations.setPreferredSize(new java.awt.Dimension(180, 20));

        iconOrganizations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-company-45.png"))); // NOI18N

        javax.swing.GroupLayout onePanelLayout = new javax.swing.GroupLayout(onePanel);
        onePanel.setLayout(onePanelLayout);
        onePanelLayout.setHorizontalGroup(
            onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, onePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconOrganizations)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOrganizations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        onePanelLayout.setVerticalGroup(
            onePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, onePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrganizations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(iconOrganizations)
        );

        menuPanel.add(onePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        twoPanel.setBackground(new java.awt.Color(36, 47, 65));
        twoPanel.setMaximumSize(new java.awt.Dimension(250, 40));
        twoPanel.setMinimumSize(new java.awt.Dimension(250, 40));
        twoPanel.setPreferredSize(new java.awt.Dimension(250, 40));
        twoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoPanelMouseClicked(evt);
            }
        });

        lblEmployees.setFont(new java.awt.Font("Optima", 1, 16)); // NOI18N
        lblEmployees.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmployees.setText("Manage Employees");
        lblEmployees.setMaximumSize(new java.awt.Dimension(180, 20));
        lblEmployees.setMinimumSize(new java.awt.Dimension(180, 20));
        lblEmployees.setPreferredSize(new java.awt.Dimension(180, 20));

        iconEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-employee-50 (1).png"))); // NOI18N

        javax.swing.GroupLayout twoPanelLayout = new javax.swing.GroupLayout(twoPanel);
        twoPanel.setLayout(twoPanelLayout);
        twoPanelLayout.setHorizontalGroup(
            twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, twoPanelLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(iconEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        twoPanelLayout.setVerticalGroup(
            twoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(twoPanelLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(lblEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuPanel.add(twoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        threePanel.setBackground(new java.awt.Color(36, 47, 65));
        threePanel.setMaximumSize(new java.awt.Dimension(250, 40));
        threePanel.setMinimumSize(new java.awt.Dimension(250, 40));
        threePanel.setPreferredSize(new java.awt.Dimension(250, 40));
        threePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threePanelMouseClicked(evt);
            }
        });

        lblUsers.setFont(new java.awt.Font("Optima", 1, 16)); // NOI18N
        lblUsers.setForeground(new java.awt.Color(255, 255, 255));
        lblUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsers.setText("Manage Users");
        lblUsers.setMaximumSize(new java.awt.Dimension(180, 20));
        lblUsers.setMinimumSize(new java.awt.Dimension(180, 20));
        lblUsers.setPreferredSize(new java.awt.Dimension(180, 20));

        iconUsers.setForeground(new java.awt.Color(255, 255, 255));
        iconUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-employee-50.png"))); // NOI18N
        iconUsers.setToolTipText("");

        javax.swing.GroupLayout threePanelLayout = new javax.swing.GroupLayout(threePanel);
        threePanel.setLayout(threePanelLayout);
        threePanelLayout.setHorizontalGroup(
            threePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, threePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconUsers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        threePanelLayout.setVerticalGroup(
            threePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(threePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconUsers)
                .addContainerGap())
            .addGroup(threePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.add(threePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cardWorkPanel.setBackground(new java.awt.Color(36, 47, 65));
        cardWorkPanel.setMinimumSize(new java.awt.Dimension(1190, 848));
        cardWorkPanel.setPreferredSize(new java.awt.Dimension(1190, 848));
        cardWorkPanel.setLayout(new java.awt.CardLayout());
        add(cardWorkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void twoPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoPanelMouseClicked
        // TODO add your handling code here:
        setColor(twoPanel);
        resetColor(new JPanel[]{onePanel,threePanel});
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(cardWorkPanel, enterprise.getOrganizationDirectory());
        cardWorkPanel.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_twoPanelMouseClicked

    private void onePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onePanelMouseClicked
        // TODO add your handling code here:
        setColor(onePanel);
        resetColor(new JPanel[]{twoPanel,threePanel});
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(cardWorkPanel, enterprise.getOrganizationDirectory());
        cardWorkPanel.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_onePanelMouseClicked

    private void threePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threePanelMouseClicked
        // TODO add your handling code here:
        setColor(threePanel);
        resetColor(new JPanel[]{onePanel,twoPanel});
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(cardWorkPanel, enterprise);
        cardWorkPanel.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_threePanelMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardWorkPanel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel iconEmployees;
    private javax.swing.JLabel iconOrganizations;
    private javax.swing.JLabel iconUsers;
    private javax.swing.JLabel lblEmployees;
    private javax.swing.JLabel lblOrganizations;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel onePanel;
    private javax.swing.JPanel threePanel;
    private javax.swing.JPanel twoPanel;
    private javax.swing.JLabel valueLabel;
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
