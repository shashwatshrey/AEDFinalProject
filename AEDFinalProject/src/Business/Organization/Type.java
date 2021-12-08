/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

/**
 *
 * @author abhis
 */
public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization") , Manufacturing("Manufacturer Organization")
        ,Sales("Sales Organization") , Purchase("Purchase Organization"),Distribution("Distribution Organization"),Health("Health Organization"),
        Economy("Economy Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
