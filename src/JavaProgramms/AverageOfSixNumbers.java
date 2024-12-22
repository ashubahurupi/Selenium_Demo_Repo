package JavaProgramms;

import java.util.Scanner;

public class AverageOfSixNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int numOne=sc.nextInt();
		
		int numTwo=sc.nextInt();
		
		int numThree=sc.nextInt();
		
		int numFour=sc.nextInt();
		
		int numFive=sc.nextInt();
		
		int numSix=sc.nextInt();
		
		
		int totalSum=0;
		
		totalSum=numOne+numTwo+numThree+numFour+numFive+numSix;
		int avg=totalSum/6;

		
		System.out.println(avg);
	}

}
