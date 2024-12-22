package JavaProgramms;

public class RemoveTheDuplicateArrays {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,3,2,6,7,8};
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length-1; i++)
		{
                if(arr[i]!=arr[i+1])
				{
					temp[j++]=arr[i];
				}
		}

       temp[j++]=arr[arr.length-1];
       
       for(int k=0; k<j; k++)
       {
    	   System.out.println(temp[k]);
       }
       
}
}