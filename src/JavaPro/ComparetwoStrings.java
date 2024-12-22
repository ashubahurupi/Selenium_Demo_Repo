package JavaPro;

public class ComparetwoStrings {
	
	
	public void isEqualsString(String str)
	{
		str.equalsIgnoreCase("str1");
	}
	
	public static void main(String[] args) {
		
		String strOne="Ashish";
		String strTwo="ashish";
		
		if(strOne.equals(strTwo))
		{
			System.out.println("Both The String are Equals");
		}
		else
		{
			System.out.println("Both The String are not Equals");
		}
	}

}
