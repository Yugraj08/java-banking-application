import java.util.ArrayList;
import java.util.Scanner;

public class BankApp extends Account{
    public static void main(String[] args) {

        // ArrayList
        ArrayList<Account> accounts = new ArrayList<>();

        Account a1 = new Account("Yugraj Mewara" , 10000);

        Scanner sc = new Scanner(System.in) ;

        // while loop with switch statement
        while(true){
        System.out.println("1.Add Account");
        System.out.println("2.Check Details");
        System.out.println("3.Deposit Amount");
        System.out.println("4.Withdraw Amount");
        System.out.println("5.Exit");
        System.out.println("Select the desire task from above list -->>");
        int num = sc.nextInt();
        sc.nextLine();
            switch (num) {
                case 1:
                    System.out.print("Enter the name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter the Initial Balance: ₹");
                    int ini_bal = sc.nextInt();
                    sc.nextLine();

                    // Create the new account object
                    Account newAccount = new Account(name, ini_bal);

                    // Add the new object to our list
                    accounts.add(newAccount);

                    System.out.println("Account created successfully!");
                    break;
                case 2 :
                    for (Account tem_account : accounts) {
                        tem_account.printDetails();
                    }
                    break;
                case 3 :
                    System.out.println("Enter Account Number: ");
                    int desire_acc = sc.nextInt();
                    System.out.println("Enter the amount to deposit");
                    int dep_amount = sc.nextInt();
                        boolean dep_find = false ;
                    for (Account currentAccount : accounts) {
                        // Check if this account's number matches the one the user wants
                        if (currentAccount.getAccountNumber() == desire_acc) {

                            currentAccount.deposit(dep_amount);
                            dep_find = true ;
                            break;

                        }

                    }
                        if(!dep_find)System.out.println("invalid Account");
                    break;
                case 4 :
                    System.out.println("Enter Account Number: ");
                    int desire_account = sc.nextInt();
                    System.out.println("Enter the amount to deposit");
                    int with_amount = sc.nextInt();
                        boolean with_find = false;
                    for (Account currentAccount : accounts) {
                        // Check if this account's number matches the one the user wants
                        if (currentAccount.getAccountNumber() == desire_account) {

                            currentAccount.withdraw(with_amount);
                            with_find = true;
                            break;

                        }

                    }
                        if(!with_find)System.out.println("invalid Account");
                    break;
                case 5 :
                    System.out.println("Thank you for using the Bank App!");
                    return;
                default:
                    System.out.println("Enter Valid Number");


            }
        }
    }
}
