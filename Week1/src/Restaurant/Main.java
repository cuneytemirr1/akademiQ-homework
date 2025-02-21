package Restaurant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int totalBill = 0;
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Kebab - 50 TL");
            System.out.println("2. Pizza - 80 TL");
            System.out.println("3. Burger - 60 TL");
            System.out.println("4. Exit and Show Bill");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    totalBill += 50;
                    System.out.println("Kebab added.");
                    break;
                case 2:
                    totalBill += 80;
                    System.out.println("Pizza added.");
                    break;
                case 3:
                    totalBill += 60;
                    System.out.println("Burger added.");
                    break;
                case 4:
                    System.out.println("Total bill: " + totalBill + " TL");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            
        } while (choice != 4);
        
        scanner.close();
	}

}
