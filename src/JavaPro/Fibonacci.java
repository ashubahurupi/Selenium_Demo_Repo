package JavaPro;

public class Fibonacci {
	
	public static void main(String[] args) {
	
		int a=0;
		int b=1;
		
		for(int i=0; i<=10; i++)
		{
			int next=a+b;
			a=b;
			b=next;
			System.out.println(a);
		}
		
		
	}

}
