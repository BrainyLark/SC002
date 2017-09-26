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
public class ATM {
    private Bank bank;
    private int state;
    private Customer currentCustomer;
    private Account currentAccount;
    
    /**
     * This method is constructor of ATM class. The method must be initialized with two parameters where bankInit to which the ATM belongs and the current state of ATM.
     * 
     * @param bankInit This is the Bank object to which the ATM belongs
     * @param stateInit This is a current state which initialize ATM's current functionality situation 
     */
    
    public ATM(Bank bankInit, int stateInit) {
        this.bank = bankInit;
        this.state = stateInit;
    }
    
    /**
     * It's the most significant method of ATM which takes on customer's bank, account, and amount for withdrawing money, regardless of its bank, searching by means of the given parameters.
     * @param cust Customer object who tries to withdraw some amount of cash from this ATM
     * @param acc Account object that is read from customer's card
     * @param bnk Bank object which indicates the bank of customer's account
     * @param withdrawAmount Regular double type variable which represents the amount of cash customer wants to withdraw
     */
    
    public void withdraw(Customer cust, Account acc, Bank bnk, double withdrawAmount) {
        if(this.state == 0) {
            System.out.println("We are sorry for informing you that ATM is currently not functional! Please come by the next time!");
        } else if(this.state == 1) {
            System.out.println("The machine is getting some fix for a short amount of time. Please wait a little patiently!");
        } else {
            this.bank = bnk;
            this.currentAccount = acc;
            this.currentCustomer = cust;
            proceedWithdraw(withdrawAmount);
        }
    }
    
    private void proceedWithdraw(double withdrawAmount) {
        if(this.bank.getCustomer(this.currentCustomer.getCustomerNumber()).getAccount(this.currentAccount.getAccountNumber()).withdrawMoney(withdrawAmount) == 0) {
            System.out.println("Your balance is not sufficient to retrieve the amount of money you just inserted. Please try a lower one!");
        } else {
            System.out.println("Please take a debit card first and get the money afterwards. Make sure you get the right balance counting the money in front of the machine!");
        }
    }
}
