package com.assignment.bank1;


public class BankLogic {
    private String name;
    private int account_num;
    private double balance=0;

    BankLogic(String name ,int account_num){
        this.name=name;
        this.account_num=account_num;
    }

    void deposit(double deposit_amount){
        balance +=deposit_amount;
        System.out.println("Successfully Deposited!!!"); 
    }

    void withdrawal(double withdrawal_amount){
        if(withdrawal_amount<=balance){
            balance-=withdrawal_amount;
            System.out.println("Withdrawal Completed");
        }
        else{
            System.out.println("Insufficient Balance");
        }    
    }

    double show_balance(){
        return balance;
    }

}

