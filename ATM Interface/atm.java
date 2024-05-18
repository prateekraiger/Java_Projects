import java.util.*;

class BankAccount {
    private double balance=0;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double checkBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter Your choice: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful!");
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    if(account.withdraw(withdrawAmount))
                        System.out.println("Withdrawal successful!");
                    else
                        System.out.println("Insufficient balance!");
                    break;
                case 3:
                    System.out.println("Your balance is: " + account.checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Have a Great Day!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

public class atm {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        System.out.println("---------------------------------------");
        System.out.println("Welcome to SWISS Bank ATM!");
        System.out.println("---------------------------------------");
        System.out.println();
        ATM atm = new ATM(account);
        atm.start();
    }
}
