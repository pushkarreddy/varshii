package javabasics2;

public class Swap2stringswithouttemp {

	public static void main(String[] args) {
		String N1="ram";
		String N2="sita";
		N1=N1.replace("ram", "sita");
		N2=N2.replace("sita", "ram");
		System.out.println(N1);
		System.out.println(N2);

	}

}
