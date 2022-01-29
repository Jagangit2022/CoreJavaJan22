package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int[] array1 = {1,34,59,102};
		int result;
		
		try {
			result = num / 0;	
			System.out.println(array1[10]);
		}catch(ArithmeticException e) {
			System.out.println("Inside Arithmetic exception block"); //specific block gets executed, if specific exception occurs, instead of default exception
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside Array Index out of bound Exception block");
		}catch(Exception e) { //parent class or default class -- goes to this in case no other exception match
			System.out.println("Inside catch block");
		}finally{ // this gets executed irrespective of exception occurs or not
			System.out.println("Inside finally block"); // this block can be used to close or remove the unused resources
		}
		
		System.out.println("After try and catch block");
	}

}
