package first;

// FIRST JAVA TASK

// 1. Create a Class Bank and declare variables
// acno, balance, accountHolderName and BankName

// Create a Method Display and
// create At least 3 objects and assign the values with object reference and call the method
public class Bank {

	int acno;
	double balance; // Changed to double to represent money accurately
	String accountHolderName; // Fixed typo in variable name
	String BankName;

	void Display() {
		System.out.println("Bank Name: " + BankName);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account No: " + acno);
		System.out.println("Balance: " + balance);
		System.out.println("----------------------------");
	}

	public static void main(String[] args) {
		Bank account1 = new Bank();
		Bank account2 = new Bank();
		Bank account3 = new Bank();

		account1.acno = 1234;
		account1.BankName = "ANDHRA";
		account1.accountHolderName = "Ganesh";
		account1.balance = 10000;

		account2.acno = 12345;
		account2.BankName = "Telangana";
		account2.accountHolderName = "mahesh";
		account2.balance = 10000;

		account3.acno = 123456;
		account3.BankName = "Utterpradesh";
		account3.accountHolderName = "maheshwar";
		account3.balance = 10000;

		account1.Display();
		account2.Display();
		account3.Display();
	}
}