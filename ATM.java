package task2;
import java.util.Scanner;
class BankAccount{
    private double Balance;
    private double amount;
  public void  setBalance(double Balance){
    	this.Balance=Balance;
    }
  public void  setamount(double amount){
    	this.amount=amount;
    }
    public BankAccount(double Balance) {
       this. Balance = Balance;
    }       

    public BankAccount() {

	}
	public double getBalance() {
        return Balance;
    }

    public void deposit(double amount) {
    	if (amount>0) {
        Balance += amount;
        System.out.println("Deposited successful. Your balance: Rs. " + getBalance());
        }
    	else {
            System.out.println("Insufficient amount.");
        }
    }

    public void withdraw(double Amount) {
        if (amount <= Balance) {
            Balance -= Amount;
            System.out.println("Withdrawal successful. Your balance: Rs. " + getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
public class ATM {
	
	 public static void main(String[] arg) {
    	 ATM a=new ATM();
    	 a.run();
	 }

	
	    public void displayMenu() {
	        System.out.println("ATM Menu:");
	        System.out.println("1.Check Balance");
	        System.out.println("2. Deposit");
	        System.out.println("3. Withdraw");
	        System.out.println("4. Exit");
	    }

	    public void run() {
	        Scanner scanner = new Scanner(System.in);
	        BankAccount b=new BankAccount();
	        b.setBalance(10000);
	        ATM a=new ATM();
	        a.displayMenu();
	        System.out.print("Select an option: ");
	        while (true) {
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Your balance: Rs. " + b.getBalance());
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double amount = scanner.nextDouble();
	                   b.deposit(amount);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double Amount = scanner.nextDouble();
	                    b.withdraw( Amount);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM!");
	                    scanner.close();
	                    
	                default:
	                    System.out.println("Invalid option. Please select a valid option");
	            }
	        }

	    }
	    

}  
	   

