package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("Nik");
		pq1.add("Mathew");
		pq1.add("Lisa");
		
		System.out.println(pq1);
		
		System.out.println(pq1.peek()); //will show first element
		
		System.out.println(pq1.poll()); //remove or eliminate the first element
		
		System.out.println(pq1);
		
		ArrayDeque<String> dq1 = new ArrayDeque<String>();
		
		dq1.add("Nick"); 
		dq1.add("Mathew");
		dq1.add("Lisa");
		//dq1.add(null); // will throw exception
		
		System.out.println(dq1);
		
		System.out.println(dq1.peek()); // peek and peekFirst both will show first element in queue
		System.out.println(dq1.peekFirst()); // will display the items in the queue
		System.out.println(dq1.peekLast());
		
		//System.out.println(dq1.poll()); // will remove first element in queue
		System.out.println(dq1.pollFirst()); // will remove first element in queue
		//System.out.println(dq1.pollLast()); // will remove last element in queue
		
		System.out.println(dq1);
;
		}

}
