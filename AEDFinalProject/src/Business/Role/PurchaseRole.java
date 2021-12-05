/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PurchaseOrganization;
import Business.UserAccount.UserAccount;
import ui.PurchaseRole.PurchaseWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vraj
 */
public class PurchaseRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PurchaseWorkAreaJPanel(userProcessContainer, account, (PurchaseOrganization)organization, enterprise);
    }

}