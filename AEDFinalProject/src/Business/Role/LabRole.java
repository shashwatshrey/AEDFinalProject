/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;
import ui.LabRole.LabWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vraj
 */
public class LabRole extends Role{
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new LabWorkAreaJPanel(userProcessContainer, account, (LabOrganization)organization, enterprise, network);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
<<<<<<< HEAD
        return new LabWorkAreaJPanel(userProcessContainer, account, (LabOrganization)organization, enterprise);
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> parent of f88db4b... All WR done
    }

}