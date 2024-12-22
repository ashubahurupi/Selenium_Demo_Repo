package JavaPro;

public class MaxOccuringChars {
	
	
	public static void main(String[] args) {
		
		int maxChar=getMaximumOccuringChars("ashish");
		System.out.println(maxChar);
	}
	
	public static char getMaximumOccuringChars(String str)
	{
		// Create an arrays to store the frequency of chars
		
		int[] frequency=new int[256];
		
		for(char ch : str.toCharArray())
		{
			frequency [ch]++;
		}
		
		char maxChar=' ';
		int maxCount=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(frequency[i] > maxCount)
			{
				maxCount = frequency[i];
				maxChar=(char)i;
			}
		}
		return maxChar;
	}

}
