package Arrays;

import java.util.Arrays;

public class SortingAnArraysDemo {
	
	public static void main(String[] args) {
		
		
		int arr[]= {12,11,34,23,10,14,16,17,18};
		
		Arrays.sort(arr);
		
	   String newArr=Arrays.toString(arr);
	   System.out.println(newArr);
	   
	   StringBuffer sb=new StringBuffer("newArr");
	   sb.reverse();
	   System.out.println(sb);
	  
	}

}
