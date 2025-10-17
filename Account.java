import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    // 1. Data (Instance Variables)
    private String name;
    private long accountNumber;
    private int balance;

    // A static variable shared by all accounts
    private static int accountCounter = 0;

     Account(){

    }

    // 2. Constructor (To build new accounts)
    public Account(String name, int initialBalance) {
        this.name = name;
        this.balance = initialBalance;
        accountCounter++;
        this.accountNumber = 100 + accountCounter;
    }

    // 3. Actions (Methods)
    public void deposit(int amount) {
        balance += amount;
        System.out.println("SUCCESSFULLY DEPOSITED");
        System.out.println("---------------------------");
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("SUCCESSFULLY WITHDRAW");
            System.out.println("---------------------------");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public long getAccountNumber(){
    return accountNumber;
    }

    // A helper method to see account details
    public void printDetails() {
        System.out.println("Counter Number: " + accountCounter);
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("--------------------");
    }
}