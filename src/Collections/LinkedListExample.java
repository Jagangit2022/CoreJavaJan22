package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("John");
		list1.add("Donald");
		list1.add("Jack");
		list1.add("jack");
		
		System.out.println(list1);
		
		list1.addFirst("Rick");
		
		System.out.println("After inserting value at first place : " +list1);
		
		list1.add(2, "Jagan");
		System.out.println("After inserting value inbetween : " +list1);
		
		for(int index=0;index < list1.size();index++) {
			System.out.println("Value of array at each index : " +list1.get(index));
		}
		
		Collections.sort(list1);
		System.out.println(list1);
	}

}
