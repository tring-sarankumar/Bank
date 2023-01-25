import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Name:");
    String name = sc.nextLine();

    System.out.println("Enter Account Number:");
    int account_num = sc.nextInt();

    BankLogic obj = new BankLogic(name, account_num);
    Boolean loop_end = true;
    while (loop_end) {

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
        loop_end = false;

      }

    }

  }
}