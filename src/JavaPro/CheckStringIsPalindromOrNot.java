package JavaPro;

public class CheckStringIsPalindromOrNot {
	
	public static void main(String[] args) {
		
		String str="ASA";
		String originalStr=str;
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(originalStr.equals(rev))
		{
			System.out.println("Given String is Palindrom Number");
		}
		else
		{
			System.out.println("Given String is not a Palidrom Number");
		}
	}

}
