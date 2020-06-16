package javabasics2;

public class UppercaseAndCount {

	public static void main(String[] args) {
		String name="TRHGHvdvsdh12342163";
		int uppercasecount=0;
		int lowercasecount=0;
		
		for(int i=0;i<name.length();i++) {
			char upp=name.charAt(i);
			char low=name.charAt(i);
			if(Character.isUpperCase(upp))
			{
				uppercasecount++;	
				System.out.println("uppercase letters are:" +upp);
			}
			
			else if(Character.isLowerCase(low)){
				lowercasecount++;
				System.out.println("lowercase letters are:" +low);
				
			}
			
		}
System.out.println("uppercase char count is:"+uppercasecount);
System.out.println("lowercase char count is:"+lowercasecount);

	}

}
