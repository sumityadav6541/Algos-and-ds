package ocp.collections;

import java.util.ArrayList;
import java.util.List;

public class ListImplsTest {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>(); // Arraylist maintains order of insertion
		list.add(1);			// non thread safe
		list.add(4);			
		list.add(5);
		list.add(2);
		list.add(3);
		
		list.sort(null);
		for(int x : list)
			System.out.println(x);
	}
}
