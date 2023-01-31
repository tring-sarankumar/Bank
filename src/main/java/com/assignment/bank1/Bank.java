package com.assignment.bank1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Bank {

    public static void main(String[] args) {
        Logger log = Logger.getLogger("Bank");
        Scanner sc = new Scanner(System.in);

        log.info("Enter Name:");
        String name = sc.nextLine();

        log.info("Enter Account Number:");
        int accountnum = sc.nextInt();

        BankLogic obj = new BankLogic(name, accountnum);
        Boolean loopend = true;
        int operation1 = 0;
        while (Boolean.TRUE.equals(loopend)) {

            log.info("Deposit(1), Withdraw(2), Show balance(3), Cancel(4). Enter Your Choice :");

            operation1 = sc.nextInt();

            switch (operation1) {

            case 1:

                log.info("Enter The Amount To Deposit:");

                double depositamount = sc.nextDouble();
                obj.deposit(depositamount);

                break;

            case 2:

                log.info("Enter The Amount You Want to Withdraw:");
                double withdrawamount = sc.nextDouble();
                obj.withdrawal(withdrawamount);
                break;

            case 3:
                obj.showbalance();
                break;

            case 4:
                log.info("Your Transation Cancelled ");
                loopend = false;
                break;
            default:
                log.info("Choose correct option");

            }
        }

    }

}
