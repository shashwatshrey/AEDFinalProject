/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SalesOrganization;
import Business.UserAccount.UserAccount;
import ui.SalesRole.SalesWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vraj
 */
public class SalesRole extends Role{
   
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new SalesWorkAreaJPanel(userProcessContainer, account, (SalesOrganization)organization, enterprise, network);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
