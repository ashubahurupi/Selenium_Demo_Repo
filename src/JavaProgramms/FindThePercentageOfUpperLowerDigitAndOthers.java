package JavaProgramms;

public class FindThePercentageOfUpperLowerDigitAndOthers {
	
	public static void getCharPercentage(String str)
	{
		int len=str.length();
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int digitCout=0;
		int otherCount=0;
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			
			if(Character.isUpperCase(ch))
			{
				upperCaseCount++;
			}
			
			else if(Character.isLowerCase(ch))
			{
				lowerCaseCount++;
			}
			else if(Character.isDigit(ch))
			{
				digitCout++;
			}
			else
			{
				otherCount++;
			}
			
		}
		double upperCasePercentage=(upperCaseCount*100.00)/len;
		double lowerCasePercentage=(lowerCaseCount*100.00)/len;
		double digitCountPercentage=(digitCout*100.00)/len;
		double otherCountPercentage=(otherCount*100.00)/len;
		
		System.out.println(upperCasePercentage);
		System.out.println(lowerCasePercentage);
		System.out.println(digitCountPercentage);
		System.out.println(otherCountPercentage);
		
	}
	
	
	public static void main(String[] args) {
		
		
		getCharPercentage("wASsedrfSDtgy34S5678@#ASDFG$%^ERT&546RTY7cfvbn");
	}

}
