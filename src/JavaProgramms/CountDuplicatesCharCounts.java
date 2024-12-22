package JavaProgramms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesCharCounts {
	
	public static void main(String[] args) {
		
		String str="Ashish bahurupi";
		
		Map<Character, Integer> dupChars=new HashMap<>();
		
		char charArr[]=str.toCharArray();
		
		for(char key:charArr)
		{
			if(dupChars.containsKey(key))
			{
				dupChars.put(key, dupChars.get(key)+1);
			}
			else
			{
				dupChars.put(key, 1);
			}
		}
		
		System.out.println(dupChars);
	}

}
