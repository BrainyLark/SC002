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
public class Customer {
    private String name;
    private long customerNumber;
    private int pin;
    private List<Account> accounts;
    
    /**
     * The constructor method for creating a Customer object which takes on various types of parameters
     * @param custName It's a simple string which is the customer's name
     * @param custNum This is just an identification number whose type is long
     * @param custPin Customer pin code which must be initialized beforehand
     * @param custAccs It is the ArrayList which could contain one or many accounts
     */
    
    public Customer(String custName, long custNum, int custPin, List<Account> custAccs) {
        this.name = custName;
        this.customerNumber = custNum;
        this.pin = custPin;
        this.accounts = new ArrayList<>();
        this.accounts.addAll(custAccs);
    }
    
    /**
     * This is the method for getting back an account of the customer by means of account number filtering
     * @param accNumber This is the parameter for filtering that account object the customer is looking for
     * @return Account object whose number matched with the passed parameter
     */
    
    public Account getAccount(long accNumber) {
        for(Account acc : this.accounts) {
            if(acc.getAccountNumber() == accNumber) {
                return acc;
            }
        }
        return null;
    }
    
    /**
     * This is a simple method for retrieving a customer number
     * @return A long type variable which is the customer number of the called object
     */
    
    public long getCustomerNumber() {
        return this.customerNumber;
    }
}
