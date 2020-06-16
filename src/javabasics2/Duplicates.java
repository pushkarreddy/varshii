package javabasics2;

public class Duplicates {

	public static void main(String[] args) {
		String str="1212AAaaBB35Scc";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println("duplicates : " +str.charAt(i));
				
	}
			}
		}
	}
}
		
