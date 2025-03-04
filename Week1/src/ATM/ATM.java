package ATM;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		// PASSWORD IS "password"

		User user = new User(5000);
		Scanner sc = new Scanner(System.in);
		AUTH: while (true) {
			System.out.print("Password: ");
			String password = sc.nextLine();
			if (password.equals(getPassword())) {
				mainMenu(user);
			} else if (password.equals("x")) {
				break AUTH;
			} else {
				System.out.println("Incorrect Password. For Quit Press (x)");
			}
		}

	}

	private static void mainMenu(User user) {
		System.out.println("Welcome To CuneytBank");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("1- Show Current Balance\n" + "2- Deposit Transaction\n" + "3- Withdraw\n" + "0- Quit\n"
					+ "Select Operation: ");
			String operationId = sc.nextLine();
			OPERATION: while (true) {
				switch (operationId) {
				case "1":
					currentBalance(user);
					break OPERATION;
				case "2":
					deposit(user);
					break OPERATION;
				case "3":
					withdraw(user);
					break OPERATION;
				case "0":
					System.exit(0);
				default:
					System.out.println("Please Select Correct Operation!");
				}
			}
		}
	}

	private static void withdraw(User user) {
		System.out.println("Balance: " + user.balance);
		System.out.print("Withdraw Amount: ");
		Scanner sc = new Scanner(System.in);
		int withdrawAmount = sc.nextInt();
		if (user.balance < withdrawAmount) {
			System.out.println("Balance too low");
		} else {
			user.balance -= withdrawAmount;
			System.out.println("Transaction Successful");
		}
	}

	private static void deposit(User user) {
		System.out.print("Deposit Amount: ");
		Scanner sc = new Scanner(System.in);
		int depositAmount = sc.nextInt();
		user.balance += depositAmount;
		System.out.println("Current Balance: " + user.balance);
	}

	private static void currentBalance(User user) {
		System.out.println("Current Balance: " + user.balance);
	}

	// Static Password
	public static String getPassword() {
		return "password";
	}

}
