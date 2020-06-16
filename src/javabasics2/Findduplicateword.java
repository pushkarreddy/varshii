package javabasics2;

public class Findduplicateword {

	public static void main(String[] args) {
		String str = "we first need to divide the sentence from a sentence";
		int count=0;
		String [] st=str.split(" ");
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].equals(st[j])) {
					count++;
					System.out.println("Duplicate word is :" +st[i]);
					System.out.println("Duplicate word count " +count);
				}
				
			}
		}

	}

}
