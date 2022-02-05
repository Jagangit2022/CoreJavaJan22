package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Jagan");
		arraylist1.add("Prashanth");
		arraylist1.add("Reena");
		arraylist1.add("Nikunj");
		
		System.out.println("Size of array list is : " +arraylist1.size());
		System.out.println("Value of array list is : " +arraylist1);
		System.out.println("Element at 0th index is : " +arraylist1.get(0));
		
		arraylist1.remove(0);
		
		System.out.println("Size of array list is : " +arraylist1.size());
		System.out.println("Value of array list is : " +arraylist1);
		
		arraylist1.set(1, "Prashanth");
		System.out.println("Replaced value at 2nd position : " +arraylist1.get(1));
		
		for(int index=0;index < arraylist1.size();index++) {
			System.out.println("Value of array at each index : " +arraylist1.get(index));
		}
		
		//Reversing the array list
		for(int index=arraylist1.size()-1;index >= 0;index--) {
			System.out.println("Value of array at each index in reverse order : " +arraylist1.get(index));
		}
		
		for(String value:arraylist1) {
			System.out.println("Foreach loop value at index : " +value);
		}
		
		Iterator<String> itr = arraylist1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//this will sort in ascending order
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		
		
	}

}
