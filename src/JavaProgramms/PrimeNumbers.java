package JavaProgramms;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static boolean isPrimeNuber(int num) {
		
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2; i<num ; i++)
		{
			if(num % i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println("2 is PrimeNumber"+isPrimeNuber(3));
		System.out.println("7 is Prime number"+isPrimeNuber(7));
	
	}
}
