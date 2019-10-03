package in.co.brings;

import java.util.Scanner;

public class ReverseStringDemo {
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		String rev ="";
		int length=str.length();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String:-"+rev);
	}

	
}
