package Bank_Account;

import java.util.Scanner;

/*

 */
 /*
Here is a designed main method that test a class called Account to add, 
withdraw and inquire current balance.The main method creates a new bank object
from the bank class that has a checking and savings data field, can deposit, 
withdraw, transfer and print balance. If no value is passed the initial balance 
is set to $0. A $5 penalty is made if more money is withdrawn than 
in the account.
 */
public class BankDemo {

    public static void main(String[] args) {

        System.out.println("___________________________\n");

        Bank bank6 = new Bank();
        bank6.printBalance();
        
        System.out.println("\nSet Checking balance to $500");
        bank6.checking.setBalance(500);
        System.out.println("Set Saving balance to $1000\n");
        bank6.savings.setBalance(1000);
        bank6.printBalance();
        System.out.println("___________________________");

        System.out.println("\nDeposit $50 to Checking");
        bank6.deposit(50, "C");
        System.out.println("Deposit $200 to Saving\n");
        bank6.deposit(200, "S");
        bank6.printBalance();
        System.out.println("___________________________");

        System.out.println("\nWithdraw $300 from Checking");
        bank6.withdraw(300, "C");
        System.out.println("Withdraw $500 from Saving\n");
        bank6.withdraw(500, "S");
        bank6.printBalance();
        System.out.println("___________________________");

        System.out.println("\nAttempted to withdraw $1000 from checking. Funds not available. $5 penalty");
        bank6.withdraw(1000, "C");
        System.out.println("Attempted to withdraw $2000 from saving. Funds not available. $5 penalty\n");
        bank6.withdraw(2000, "S");
        bank6.printBalance();
        System.out.println("___________________________");

        System.out.println("\nTransfer $100 Checking to Savings\n");
        bank6.transfer(100, "C");
        bank6.printBalance();
        System.out.println("___________________________");

        System.out.println("\nTransfer $100 Savings to Checking\n");
        bank6.transfer(100, "S");
        bank6.printBalance();


        System.out.println("___________________________");

    } 

}

