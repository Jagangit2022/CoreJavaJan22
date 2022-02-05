package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Rick");
		//set1.add("name1");
		set1.add("Raj");
		set1.add("Jagan");
		set1.add("Mira");
		set1.add("Reena");
		set1.add(null); // null is allowed
		set1.add(null);
		
		System.out.println(set1);
		/*
		Iterator<String> itr = set1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		
		set2.add("Rick");
		//set1.add("name1");
		set2.add("Raj");
		set2.add("Jagan");
		set2.add("Mira");
		set2.add("Reena");
		set2.add(null); // null is allowed
		set2.add(null);
		
		System.out.println(set2);
		
		TreeSet<String> set3 = new TreeSet<String>();
		
		set3.add("Rick");
		//set1.add("name1");
		set3.add("Raj");
		set3.add("Jagan");
		set3.add("Mira");
		set3.add("Reena");
		//set3.add(null); // null is allowed
		//set3.add(null);
		
		System.out.println(set3);
		
		String str1 = "Clean World Green World";
		
		LinkedHashSet<String> str2 = new LinkedHashSet<String>();
		
		String[] arrstr = str1.split(" ");
		
		str2.add(arrstr[0]);
		str2.add(arrstr[1]);
		str2.add(arrstr[2]);
		str2.add(arrstr[3]);
		
		System.out.println(str2);
		
	 /*      HashSet<String> hs1 = new HashSet<String>();
	        for (String word : str1.split(" ")) {
	            hs1.add(word);
	        }
	        System.out.println(hs1);
	   */ 
		
	}

	
}
