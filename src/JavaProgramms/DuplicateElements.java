package JavaProgramms;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		String arr[]= {"java","python","c++","c++","javaScript","java"};
		
		// Compare each Element
		
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=i+1; j<=arr.length-1; j++)
			{
				if(arr[i].equals(arr[j]))
				{
					System.out.println("Duplicate elements are ::"+arr[i]);
					
				}
			}
			
		}
		
	}

}
