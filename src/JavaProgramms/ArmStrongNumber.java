package JavaProgramms;

public class ArmStrongNumber {
	
	
	public static void isArmStrongNum(int num)
	{
		int sum=0;
		int originalNum=num;
		boolean result=false;
		while(num>0)
		{
			int lastDigit=num%10;
			sum=sum+(lastDigit*lastDigit*lastDigit);
			num=num/10;
			
		}
		
		if(num==sum)
		{
			System.out.println("Given Number is Armstrong Number");
			
		}
	
		
	}
	public static void main(String[] args) {
		
		isArmStrongNum(153);
		
	
	}

}
