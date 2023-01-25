package com.assignment.bank1;


public class BankLogic {
    private String name;
    private int accountnum;
    private double balance=0;

    BankLogic(String name ,int accountnum){
        this.name=name;
        this.account-num=account-num;
    }

    void deposit(double depositamount){
        balance +=depositamount;
        System.out.println("Successfully Deposited!!!"); 
    }

    void withdrawal(double withdrawalamount){
        if(withdrawalamount<=balance){
            balance-=withdrawalamount;
            System.out.println("Withdrawal Completed");
        }
        else{
            System.out.println("Insufficient Balance");
        }    
    }

    double showbalance(){
        return balance;
    }

}

