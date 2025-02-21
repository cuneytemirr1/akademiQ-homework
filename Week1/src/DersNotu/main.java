package DersNotu;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] grades = new int[5];
        int total = 0, highest = 0, lowest = 100;
        boolean hasLowGrade = false;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
            total += grades[i];
            
            if (grades[i] < 30) {
                hasLowGrade = true;
            }
            
            if (grades[i] > highest) {
                highest = grades[i];
            }
            
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        
        double average = total / 5.0;
        
        if (average >= 50) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed!");
        }
        
        if (hasLowGrade) {
            System.out.println("You have subjects with low grades!");
        }
        
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
	}

}
