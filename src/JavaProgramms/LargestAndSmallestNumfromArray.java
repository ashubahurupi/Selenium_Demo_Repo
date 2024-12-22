package JavaProgramms;

public class LargestAndSmallestNumfromArray {
	
	public static void main(String[] args) {
		
		
		int arr[]= {10,20,30,46,45,34,76};
		
		int smallestNum=arr[0];
		int largestNum=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>smallestNum)
			{
				largestNum=arr[i];
			}
			if(arr[i]<smallestNum)
			{
				smallestNum=arr[i];
			}
		}
		
		System.out.println(largestNum);
		System.out.println(smallestNum);
	}

}
