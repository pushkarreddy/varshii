package collections;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesUsingset {

	public static void main(String[] args) {
		int[] arr= {1,2,3,1,4,5,5};
		Set<Integer> s =new HashSet<Integer>();
		for(int num:arr) {
			if(s.add(num)==false)
			{
				System.out.println(num);
			}
		}
		
	}

}
