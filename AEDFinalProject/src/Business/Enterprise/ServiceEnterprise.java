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
<<<<<<< HEAD
<<<<<<< HEAD
     public ServiceEnterprise(String name){
        super(name,EnterpriseType.Service);
=======
     public ServiceEnterprise(String name, Network network){
        super(name,EnterpriseType.Service, network);
>>>>>>> parent of f88db4b... All WR done
=======
    private int vaccineCount;

    public int getVaccineCount() {
        return vaccineCount;
    }

    public void setVaccineCount(int vaccineCount) {
        this.vaccineCount = vaccineCount;
    }
     public ServiceEnterprise(String name, Network network){
        super(name,EnterpriseType.Service, network);
>>>>>>> main
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
