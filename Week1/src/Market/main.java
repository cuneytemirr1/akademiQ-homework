package Market;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double price = 0;
		
		PRODUCTSELECTION:
		while (true) {
			System.out.print("1- Yoghurt ($2)\n"
					+ "2- Pasta ($1)\n"
					+ "3- Fruit Juice (50 cent)\n"
					+ "0- Finish Shopping\n"
					+ "Select Product: ");
			int product = sc.nextInt();
			switch (product) {
			case 1:
				price += 2;
				System.out.println("OK!");
				break;
			case 2:
				price += 1;
				System.out.println("OK!");
				break;
			case 3:
				price += 0.5;
				System.out.println("OK!");
				break;
			case 0:
				System.out.print("1- Yes\n2- No\nDo You Have Deposit Coupon:");
				int hasDeposit = sc.nextInt();
				if (hasDeposit == 1) {
					System.out.println("10% Deposit Applied!");
					System.out.println("Price: " + price*9/10);
					break PRODUCTSELECTION;
				}else if (hasDeposit == 2) {
					System.out.println("Price: " + price);
					break PRODUCTSELECTION;
				}else {
					System.out.println("Incorrect Operation!");
				}
				break;
			default:
				System.out.println("Incorrect Product Selection!");
			}
		}
		
		
	}

}
