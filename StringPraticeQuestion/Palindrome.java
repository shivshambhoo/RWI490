package StringPraticeQuestion;

public class Palindrome {
	
	public static void main(String[] args) {
        String str="navan";

        int left=0;
        int right=str.length()-1;
        boolean cheak=false;
        while(left<=right){
            if (str.charAt(left) != str.charAt(right)) {
                cheak=true;
            }
            left++;
            right--;
        }

        if(cheak==true){
            System.out.println("String is not palindrome");
        }
        else{
            System.out.println("String is palindrome");
        }
	}

}
