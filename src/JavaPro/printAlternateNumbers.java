package JavaPro;

import java.util.Scanner;

public class printAlternateNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the any Number");
		int num=sc.nextInt();
		
		for(int i=0; i<=num ; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
