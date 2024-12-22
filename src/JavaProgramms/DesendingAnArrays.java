package JavaProgramms;

import java.util.ArrayList;
import java.util.Collections;

public class DesendingAnArrays {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>  al=new ArrayList<>();
		al.add(55);
		al.add(12);
		al.add(13);
		al.add(43);
		al.add(14);
		
		Collections.sort(al);
		// Asending Order 
		System.out.println(al);
		
		// Desending Oder
		
		Collections.sort(al, Collections.reverseOrder());
	}

}
