package JavaProgramms;

public class FindSubString {

	public static boolean isSubString(String main, String sub)
	{
		return main.matches(".*"+sub+".*");
		
	}
	
	public static void main(String[] args) {
		 System.out.println(isSubString("AshishBahurupi", "abc"));
	}
}
