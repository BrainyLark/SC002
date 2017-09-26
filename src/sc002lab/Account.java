/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc002lab;

/**
 *
 * @author root
 */
public class Account {
    
    private double balance;
    private long accountNumber;
    
    /**
     * This is the constructor with parameters which is for initializing Account object
     * @param balanceInit Double type variable that represents the base money for the account
     * @param accNumInit Account number belongs to long variable type which is given by especially operators
     */
    
    public Account(double balanceInit, long accNumInit) {
        this.balance = balanceInit;
        this.accountNumber = accNumInit;
    }
    
    /**
     * It's the simple method to contribute some cash into the account just by taking a deposit amount
     * @param dptAmount Deposit amount which implies how much money you want to deposit into your account. Must be double type.
     */
    
    public void depositMoney(double dptAmount) {
        this.balance += dptAmount;
    }
    
    /**
     * It's the method for withdrawing money from the account
     * @param wthMoney The amount of money the customer wishes to retrieve back
     * @return int It returns integer based off of if the balance is sufficient enough to provide the given withdrawl amount. It returns 0 when it's not, else 1
     */
    
    public int withdrawMoney(double wthMoney) {
        if(wthMoney > this.balance) {
            return 0;
        } else {
            this.balance -= wthMoney;
            return 1;
        }
    }
    
    /**
     * This is a simple function for retrieving the account number
     * @return It returns just the account number which is long variable type
     */
    
    public long getAccountNumber() {
        return this.accountNumber;
    }
}
