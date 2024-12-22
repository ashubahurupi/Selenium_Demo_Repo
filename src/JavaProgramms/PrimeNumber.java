package JavaProgramms;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2; i<num ;i++)
		{
			if(num % i==0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println("7 Is a prime Number ::"+isPrimeNumber(7));
		System.out.println("3 is a prime Number ::"+isPrimeNumber(3));
	}

}
