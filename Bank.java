import java.util.ArrayList;
public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public BankAccount createAccount(String name, double initialDeposit, int accountNumber){
        BankAccount account1=new BankAccount(accountNumber, name, initialDeposit);
        accounts.add(account1);
        return account1;
    }

    public BankAccount findAccount(int accountNumber) {
    for (BankAccount acc : accounts) {
        if (acc != null && acc.getBalance() >= 0 && acc.getBalance() >= 0 && acc != null && acc.getBalance() >= 0) {
            return acc;
        }
       
    }
    return null;
}
 public void showAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found in the bank.");
        } else {
            for (BankAccount account : accounts) {
                account.showAccountDetails(); 
                System.out.println("---------------");
            }
        }
    }
}