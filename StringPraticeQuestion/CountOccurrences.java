package StringPraticeQuestion;

import java.util.HashMap;

public class CountOccurrences {
	
//	public static int count(String s, char c)
//    {
//        int res = 0;
// 
//        for (int i=0; i<s.length(); i++)
//        {
//            // checking character in string
//            if (s.charAt(i) == c)
//            res++;
//        } 
//        return res;
//    }
//	
//    public static void main(String args[])
//    {
//        String str= "geeksforgeeks";
//        char c = 'e';
//        System.out.println(count(str, c));
//    }
	
	
	/*Another Method To solve this question using hashmap  */
	
	public static void main(String[] args) {
		
		String str="Hello";
		HashMap<Character,Integer>mp=new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++)
		{
			if(mp.containsKey(str.charAt(i)))
			{
				int count=mp.get(str.charAt(i));
				mp.put(str.charAt(i), ++count);
			}
			else
			{
				mp.put(str.charAt(i),1);
			}
		}
		
		System.out.println(mp);
	}

}
