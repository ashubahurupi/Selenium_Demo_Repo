package JavaPro;

public class RemoveDuplicateChars {
	
	public static void main(String[] args) {
		
		String str="Ashish Bahurupi";
		String newStr="";
		for(int i=0; i<str.length(); i++)
		{
				if(str.charAt(i)==str.charAt(i+1))
				{
					char ch=str.charAt(i);
					newStr=newStr+ch;
				}
		}	
		
		System.out.println(newStr);
		}
		
}
