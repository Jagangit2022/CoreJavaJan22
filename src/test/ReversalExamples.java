package test;

public class ReversalExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Clean India Green India";
		String revStr1="";
		
		for(int index=str1.length()-1;index>=0;index--) {
			revStr1 = revStr1 + str1.charAt(index);
			
		}
		System.out.println("Reverse String : " +revStr1);
		
		//Check count of ovels in string
		int result=0;
		for(int index=0;index<str1.length();index++) {
			if(str1.charAt(index)== 'a'|| str1.charAt(index)== 'e'|| str1.charAt(index)== 'i'|| str1.charAt(index)== 'o'|| str1.charAt(index) =='u') {
				result++;
			}
			System.out.println("Result : " +result);
		}
		
		// reversal of integer array
		
		int[] num1 = {20,30,40,50,60};
		for(int index=num1.length-1;index>=0;index--) {
			System.out.println(num1[index]);
		}
		
		//reversal of number
		int num=42536595;
		int unitval=0;
		int remval=0;
		int revval=0;
		while(num >0) {
			unitval = num%10;
			remval = num/10;
			num=remval;
			revval=revval*10+unitval;
			//System.out.println("Val : " +unitval);
			System.out.println("Reverse val : " +revval);
		}
		//System.out.println("Val : " +unitval);
		
	}
}


