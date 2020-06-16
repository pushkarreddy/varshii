package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(2);
		l.add("pushkar");
		l.add("varshitha");
		l.add("varshitha");
		System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		for(Object value:l) {
			System.out.println(value);
			
		}

	}

}
