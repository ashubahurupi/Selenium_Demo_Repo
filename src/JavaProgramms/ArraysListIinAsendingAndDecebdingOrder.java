package JavaProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysListIinAsendingAndDecebdingOrder {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<>();
		
		arr.add(20);
		arr.add(12);
		arr.add(13);
		arr.add(86);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);
		
		
		
	}

}
