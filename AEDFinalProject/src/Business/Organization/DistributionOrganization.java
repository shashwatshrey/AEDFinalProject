/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DistributionRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shashwatshrey
 */
public class DistributionOrganization extends Organization {
    public DistributionOrganization() {
<<<<<<< HEAD
        super(Organization.Type.Distribution.getValue());
=======
        super(Type.Distribution.getValue());
>>>>>>> parent of f88db4b... All WR done
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributionRole());
        return roles;
    }
}
