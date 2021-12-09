/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author abhis
 */
public class requestVaccine extends WorkRequest{
    
    private String testResult;
    private UserAccount purchaser;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    private int qty;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public UserAccount getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(UserAccount purchaser) {
        this.purchaser = purchaser;
    }
}
