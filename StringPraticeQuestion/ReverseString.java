package StringPraticeQuestion;

public class ReverseString {
	public static void main(String[] args) {
		String str="java";
		StringBuilder newstr= new StringBuilder();
		
		char ch;
		for(int i=str.length()-1; i>=0; i--)
		{
			ch=str.charAt(i);
			newstr.append(ch);
		}
		
		System.out.println("Reverse string is : ");
		System.out.println(newstr);
	}

}
