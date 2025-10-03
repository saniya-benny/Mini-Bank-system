import java.util.Scanner;

public class MainApp {
 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int accountCounter = 101;

while(true) {
    System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Transfer\n5. View Account\n6. Exit");
    System.out.print("Enter choice: ");
    int choice = sc.nextInt();

if(choice==1){

 sc.nextLine(); System.out.print("Enter your name: "); 
String name = sc.nextLine();
 System.out.print("Enter initial deposit: ");
  double deposit = sc.nextDouble();
   BankAccount acc = bank.createAccount(name, deposit, accountCounter++);
    System.out.println("Account created! Your account number is: " + acc.getAccountNumber());

}

 else if(choice == 2) {  System.out.print("Enter account number: ");
  int accNum = sc.nextInt();
   BankAccount acc = bank.findAccount(accNum);
    if(acc != null) { System.out.print("Enter amount to deposit: "); 
    double amount = sc.nextDouble();
     acc.deposit(amount); 
    System.out.println("Deposited successfully! New balance: " + acc.getBalance()); }
     else { System.out.println("Account not found!"); } }

else if(choice == 3) {

System.out.print("Enter account number: ");
 int accNum = sc.nextInt();
  BankAccount acc = bank.findAccount(accNum);
   if(acc != null) { System.out.print("Enter amount to withdraw: ");
    double amount = sc.nextDouble();
     if(acc.withdraw(amount)) { System.out.println("Withdrawal successful! New balance: " + acc.getBalance()); } }
      else { System.out.println("Account not found!"); } }




else if(choice == 4) {
    System.out.print("Enter your account number: ");
    int fromAccNum = sc.nextInt();
    BankAccount fromAcc = bank.findAccount(fromAccNum);

    System.out.print("Enter receiver's account number: ");
    int toAccNum = sc.nextInt();
    BankAccount toAcc = bank.findAccount(toAccNum);

    if(fromAcc != null && toAcc != null) {
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();
        fromAcc.transfer(toAcc, amount);
    } 
    else {
        System.out.println("One or both accounts not found!");
    }
}
else if(choice == 5) { // View Account
    System.out.print("Enter account number: ");
    int accNum = sc.nextInt();
    BankAccount acc = bank.findAccount(accNum);
    if(acc != null) {
        acc.showAccountDetails();
    } else {
        System.out.println("Account not found!");
    }
}
else if(choice == 6) { // Exit
    System.out.println("Exiting...");
    break;
}
else {
    System.out.println("Invalid choice! Try again.");
}


}

 }


}