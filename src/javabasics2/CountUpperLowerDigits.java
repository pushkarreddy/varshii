package javabasics2;

public class CountUpperLowerDigits {
	public static void main(String[] args) {

		int upper=0,lower=0,digits=0,special=0;
		String st ="ABCsdfg6234632!@##$$";
		int len=st.length();
		for(int i=0;i<len;i++)
		{
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				upper++;
			}
			else if (ch>='a' && ch<='z')
			{
			lower++;
			}
			else if(ch>='0' && ch<='9')
			{
				digits++;
			}
			else
				special++;
 		}
		System.out.println("upper characters are: "+upper);
		System.out.println("lower characters are: "+lower);
		System.out.println("digits are: "+digits);
		System.out.println("special characters are: "+special);
		

	}

}
	
