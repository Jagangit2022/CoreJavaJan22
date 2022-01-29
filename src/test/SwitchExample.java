package test;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String str1 = scanner.nextLine(); //next will take one word, nextline will take entire line
		int vowelcnt = 0;
		for(int index=0;index<str1.length();index++){
			char temp = str1.charAt(index);
			
			switch(temp) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelcnt++;
				break;
			}
		}
		System.out.println("Vowel count value in string : " +vowelcnt);
		scanner.close();
	}

}
