package JavaProgramms;

import java.util.Scanner;

public class ReverseTheString {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the any String");
		String str=sc.next();
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		
		System.out.println(rev);
	}
	

}
