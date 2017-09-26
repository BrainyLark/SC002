/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc002lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class Bank {
    private String name;
    private List<Customer> customers;
    
    /**
     * This is the constructor method for Bank class.
     * @param bankName String type variable which gives the name of the bank
     * @param custs ArrayList of Customer objects means the customers who belong to the Bank object
     */
    
    public Bank(String bankName, List<Customer> custs) {
        this.name = new String(bankName);
        this.customers = new ArrayList<>();
        this.customers.addAll(custs);
    }
    
    /**
     * Simple method for adding a Customer object into the customers list that the Bank object includes
     * @param cust A Customer object which is brought to be inserted into the list
     */
    
    public void addCustomer(Customer cust) {
        this.customers.add(cust);
    }
    
    /**
     * This method gets customer number which is long type variable and search through the customers list to find and return one
     * @param custNum Customer number whose object must be found
     * @return A Customer object whose number has been delivered as the method parameter
     */
    
    public Customer getCustomer(long custNum) {
        for(Customer cust: this.customers) {
            if(cust.getCustomerNumber() == custNum) {
                return cust;
            }
        }
        return null;
    }
}
