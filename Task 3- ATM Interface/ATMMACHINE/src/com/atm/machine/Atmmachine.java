package com.atm.machine;

import java.util.Scanner;

class ATM {
    private Bankaccount account;

    public ATM(Bankaccount bankaccount) {
        account = bankaccount;
    }

    public void options() {
    	System.out.println();
    	System.out.println();
        System.out.println("\t\t\t\t\t\t ATM \t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t 1. Check Balance \t\t\t\t\t");
        System.out.println("\t\t\t\t\t 2. Deposit \t\t\t\t\t");
        System.out.println("\t\t\t\t\t 3. Withdraw \t\t\t\t\t");
        System.out.println("\t\t\t\t\t 4. Exit \t\t\t\t\t");
    }

    public void start() {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        while (true) {
            options();
            System.out.print("Select a Option: ");
            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Your Account Balance: Rs. " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter Amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit Successfully. Your Account Balance: Rs. " + account.getBalance());
                    System.out.println("Thank you for your Transaction");
                    break;
                case 3:
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Amount Withdrawal Successfully. Your Balance: Rs. " + account.getBalance());
                    }
                    else {
                    	System.out.println("This is Too High Amount, Maximum Limit of Withdraw is 25000 Rs");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                  
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}




class Bankaccount {
    private double balance;

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }

    public Bankaccount(double initialBalance) {
        balance = initialBalance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance && amount<=25000) {
            balance -= amount;
            return true;
        }
        return false;
    }
}


public class Atmmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bankaccount userAccount = new Bankaccount(10000); 
	        ATM a1 = new ATM(userAccount);
	        a1.start();
	}

}
