package Java;
import java.util.*;

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient funds.");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

class Bank {
    private ArrayList<Account> accounts;
    Scanner scanner = new Scanner(System.in);

    public Bank() {
        accounts = new ArrayList<>();
    }
    
    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    public void addAccount() {
        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter account holder name:");
        String accountHolderName = scanner.nextLine();
        System.out.println("Enter initial balance:");
        double balance = scanner.nextDouble();
        scanner.nextLine(); 

        Account account = new Account(accountNumber, accountHolderName, balance);
        accounts.add(account);
        System.out.println("Account added:");
        account.displayAccountDetails();
    }
    public void removeAccount() {
        System.out.println("Enter account number to remove:");
        String accountNumber = scanner.nextLine();
        Account accountToRemove = findAccount(accountNumber);
        if (accountToRemove != null) {
            accounts.remove(accountToRemove);
            System.out.println("Account removed:");
            accountToRemove.displayAccountDetails();
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }
    public void deposit() {
        System.out.println("Enter account number for deposit:");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter deposit amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }
    public void withdraw() {
        System.out.println("Enter account number for withdrawal:");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter withdrawal amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    public void displayAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account account : accounts) {
                account.displayAccountDetails();
                System.out.println(); 
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println("Bank Menu:");
            System.out.println("1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display Accounts");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    addAccount();
                    break;
                case 2:
                    removeAccount();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    displayAccounts();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("You have entered an invalid option, please try again.");
                    break;
            }
        }
    }

}

public class traitsBank{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.menu();
    }
}
