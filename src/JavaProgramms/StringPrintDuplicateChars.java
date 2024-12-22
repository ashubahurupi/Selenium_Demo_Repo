package JavaProgramms;

import java.util.HashMap;
import java.util.Map;

public class StringPrintDuplicateChars {
	
	public static void main(String[] args) {
		
		String name="Ashish";
		
		char arr[]=name.toCharArray();
		
		Map<Character, Integer> mp=new HashMap<Character, Integer>();
		
		for(char ch:arr)
		{
			if(mp.containsKey(ch))
			{
				mp.put(ch, mp.get(mp)+1);
			}
			else
			{
				mp.put(ch, 1);
			}
		}
		System.out.println(mp);
	}

}
