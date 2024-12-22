package JavaProgramms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsCount {
	
	
	public static void main(String[] args) {
		
		String str="ashish Bahurupi";
		Map<Character,Integer> dupCharMap=new HashMap<>();
		char CharArr[]=str.toCharArray();
		
		for(char key:CharArr)
		{
			if(dupCharMap.containsKey(key))
			{
				dupCharMap.put(key, dupCharMap.get(key)+1);
			}
			else
			{
				dupCharMap.put(key, 1);
			}
		}
		
		System.out.println(dupCharMap);
	}

}
