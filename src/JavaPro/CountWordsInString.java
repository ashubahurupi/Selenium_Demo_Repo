package JavaPro;

public class CountWordsInString {
	
	public static void main(String[] args) {
		
		String str="My name is Ashish";
	
		String words[]=str.split(" ");
		int count=0;
		for(String word:words)
		{
			System.out.println(word);
			count++;
		}
		
		System.out.println(count);
	}

}
