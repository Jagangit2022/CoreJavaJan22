package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map1 = new HashMap<Integer,String>();
		
		map1.put(1, "Suraj");
		map1.put(2, "Niraj");
		map1.put(3, "Sam");
		
		System.out.println(map1);
		
		map1.put(2, "John");
		System.out.println(map1);
		
		//delete the entry
		
		map1.remove(3);
		System.out.println(map1);
		System.out.println(map1.get(3));
		
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		
		map2.put(1, "Suraj");
		map2.put(10, "Jagan");
		map2.put(2, "Niraj");
		map2.put(3, "Sam");
		
		System.out.println(map2);
		
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		
		map3.put(1, "Suraj");
		map3.put(10, "Jagan");
		map3.put(2, "Niraj");
		map3.put(3, "Sam");
		
		System.out.println(map3);
		
		for(Map.Entry<Integer, String> entry1:map3.entrySet()) {
			//System.out.println();
			System.out.println(entry1.getKey()+" " +entry1.getValue());
		}
		
		for(Integer val: map1.keySet()) {
			System.out.println("Key is : " +val);
			System.out.println("value is : " +map1.get(val)); // to get value as well
		}
		
		for(String val: map1.values()) {
			System.out.println("Value is : " +val);
		}

	}

}
