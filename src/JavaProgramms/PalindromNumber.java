package JavaProgramms;

import java.util.Scanner;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int revNum=0;
		while(num!=0)
		{
			int lastDigit=num%10;
			revNum=revNum*10+lastDigit;
			num=num/10;
		}
	
	}

}
