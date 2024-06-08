package StringPraticeQuestion;

public class CountLowerUpparcase {
	
	public static void main(String[] args) {
		String str="BeatTKilO";
		int lower=0;
		int upar=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				upar++;
			}
			else
			{
				lower++;
			}
		}
		
		System.out.println("Number of upparCase Latter is : "+ upar);
		System.out.println("Number os lowerCase Latter is : "+ lower);
	}

}
