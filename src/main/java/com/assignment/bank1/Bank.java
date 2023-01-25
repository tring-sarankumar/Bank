package com.assignment.bank1;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter Name:");
	    String name = sc.nextLine();

	    System.out.println("Enter Account Number:");
	    int account_num = sc.nextInt();

	    BankLogic obj = new BankLogic(name, account_num);
	    Boolean loop-end = true;
	    while (loop-end) {

	      System.out.println("Deposit(1), Withdraw(2), Show balance(3), Cancel(4). Enter Your Choice :");
	      int operation1 = sc.nextInt();
	      switch (operation1) {

	      case 1:
	        System.out.println("Enter The Amount To Deposit:");
	        double deposit_amount = sc.nextDouble();
	        obj.deposit(deposit_amount);
	        break;

	      case 2:
	        System.out.println("Enter The Amount You Want to Withdraw:");
	        double withdraw_amount = sc.nextDouble();
	        obj.withdrawal(withdraw_amount);
	        break;

	      case 3:
	        System.out.println("Your Balance:");
	        System.out.println(obj.show_balance());
	        break;

	      case 4:
	    	System.out.println("Your Transation Cancelled ");
	        loop-end = false;
			      
	      default:
		System.out.println("Enter correct number");   

	      }
	    }


	}

}
