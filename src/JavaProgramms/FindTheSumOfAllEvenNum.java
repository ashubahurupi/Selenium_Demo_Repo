package JavaProgramms;

public class FindTheSumOfAllEvenNum {
	
	public static void main(String[] args) {
		
		int num=10;
		int sum=0;
		for(int i=0; i<=num ;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
