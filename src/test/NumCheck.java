package test;

import java.util.Scanner;

public class NumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Age : ");
		
		int num = scanner.nextInt();
		
		if (num%2 !=0) {
			System.out.println("Entered number is Odd");
		}else {
			System.out.println("Entered number is Even");
		}
		scanner.close();

	}

}
