package JavaProgramms;

import java.util.Scanner;

public class PalindromNumberDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int originalNum=num;
		int revNum=0;
		while(num !=0)
		{
			int lastDigit=num%10;
			revNum=revNum*10+lastDigit;
			num=num/10;
		}
		
		if(originalNum==revNum)
		{
			System.out.println("Given Number is Palindrom Number");
		}
		else
		{
			System.out.println("Given Number is not a palindrom Number");
		}
	}

}
