/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.HealthOrganization;
import Business.UserAccount.UserAccount;
import ui.HealthRole.HealthWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vraj
 */
public class HealthRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HealthWorkAreaJPanel(userProcessContainer, account, (HealthOrganization)organization, enterprise);
    }

}