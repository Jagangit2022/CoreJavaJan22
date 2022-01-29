package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop to print 1 to 10
		
		int num1=1;
		
		while(num1 <= 10) {
			if(num1 == 5) {
				num1 = num1 + 1;
				continue;
			}
			System.out.println("Num1 : " +num1);
			num1 = num1 + 1;
		}
		
		//for loop to print 1 to 10
		
		for(num1 = 1;num1 <= 10; num1++) {
			if(num1 == 5) {
				//continue;
				break;
			}
			System.out.println("Num1 in for loop : " +num1);
		}
		
		//for loop to print from 10 to 1
		
		for (num1 = 10;num1 >=1;num1--) {
			System.out.println("Num1 in for loop : " +num1);
		}

		//Arrays with loop
		int[] num2 = {20,30,40,50,60};
		
		for(int index=0;index<num2.length;index++) {
			System.out.println("Array value at position : " +num2[index]);
		}
		
		//for each example - couldn't do continue or break
		for (int value:num2) {
			System.out.println(value);
		}
		
	}

}
