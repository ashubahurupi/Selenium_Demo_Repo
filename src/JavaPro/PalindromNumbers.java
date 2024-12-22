package JavaPro;

public class PalindromNumbers {
	
	public static void main(String[] args) {
		
		int num=222;
		int originalInt=num;
		int rev=0;
		while(num>0)
		{
			int lastDigit=num%10;
			rev=rev*10+lastDigit;
			num=num/10;
		}
		
		if(rev==originalInt)
		{
			System.out.println("Palindrom Number");
		}
		else
		{
			System.out.println("Not a Palindrom Number");
		}
		
	}

}
