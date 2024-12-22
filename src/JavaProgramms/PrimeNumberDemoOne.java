package JavaProgramms;

import java.util.Scanner;

public class PrimeNumberDemoOne {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Please enter Any Value");
		int num=sc.nextInt();
		
		for(int i=1; i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count>2)
		{
			System.out.println("Entered Values us Prime not a prime Number");
		}
		else {
			System.out.println("Entered Value is Prime Number");
		}
		
	}

}
