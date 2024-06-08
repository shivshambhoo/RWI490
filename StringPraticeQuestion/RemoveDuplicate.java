package StringPraticeQuestion;

import java.util.HashMap;

public class RemoveDuplicate {

   public static void main(String[] args) {
	String str="heelloo";
	HashMap<Character, Integer> mp= new HashMap<>();
	
	String st=" ";
	for(int i=0; i<str.length(); i++)
	{
		if(!mp.containsKey(str.charAt(i)))
		{
			st +=str.charAt(i);
			mp.put(str.charAt(i), 1);
		}
	}
	
	System.out.println(st);
}
}
