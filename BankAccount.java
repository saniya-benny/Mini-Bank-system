public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String name, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = name;
        this.balance = initialBalance;
    }
  public int getAccountNumber() {
        return accountNumber;
    }

    
    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount >= balance) {
            System.out.println("insufficient balance");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public void transfer(BankAccount receiver, double amount) {
        if (withdraw(amount)) {
            receiver.deposit(amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void showAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

}
