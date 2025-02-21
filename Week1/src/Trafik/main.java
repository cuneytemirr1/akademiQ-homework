package Trafik;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter your speed (km/h): ");
        int speed = scanner.nextInt();
        
        if (speed > 130) {
            System.out.println("Your license has been revoked!");
        } else if (speed > 110) {
            System.out.println("You received a fine of 2000 TL.");
        } else if (speed > 90) {
            System.out.println("You received a fine of 1000 TL.");
        } else {
            System.out.println("You are obeying the speed limit.");
        }
	}

}
