package test;

public class DataTypesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 30;
		
		int sum = num1+num2;
		int sub = num2-num1;
		int mul = num1*num2;
		float div = (float) num2/num1;
		
		//String result = "Sum of two numbers : " +sum;
		
		System.out.println("Sum of two numbers : " +sum);
		System.out.println("Subtraction of two numbers : " +sub);
		System.out.println("Multiplication of two numbers : " +mul);
		System.out.println("Division of two numbers : " +div);
		
		String name = "Clean India Green India";
		System.out.println("Total number of chats in the string : " +name.length());
		
		char char1 = name.charAt(0);
		char char2 = name.charAt(name.length()-1);
		System.out.println("Character at first place in the string : " +char1);
		System.out.println("Character at first place in the string : " +char2);
		
		System.out.println("String in Upper Case : " +name.toUpperCase());
		System.out.println("String in Upper Case : " +name.toLowerCase());
		
		
		
	}

}
