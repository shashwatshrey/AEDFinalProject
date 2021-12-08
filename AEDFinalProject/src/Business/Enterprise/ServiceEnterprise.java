/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network.Network;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shashwatshrey
 */
public class ServiceEnterprise extends Enterprise {
     public ServiceEnterprise(String name, Network network){
        super(name,EnterpriseType.Service, network);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
