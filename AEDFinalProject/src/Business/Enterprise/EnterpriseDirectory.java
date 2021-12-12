/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network.Network;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author shashwatshrey
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type, Network network){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name, network);
            enterpriseList.add(enterprise);
        } else if (type==Enterprise.EnterpriseType.Service){
            enterprise=new ServiceEnterprise(name, network);
            enterpriseList.add(enterprise);
        }else if (type==Enterprise.EnterpriseType.Pharmaceutical){
            enterprise=new PharmaceuticalEnterprise(name, network);
            enterpriseList.add(enterprise);
        }else if (type==Enterprise.EnterpriseType.Government){
            enterprise=new GovernmentEnterprise(name, network);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
