package ArrayDemo;

import java.util.Scanner;

public class CheckPalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0; 
        int j = arr.length - 1;
        
        boolean isPalindrome = true;

        while (i <= j) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (!isPalindrome) {
            System.out.println("Array is not a palindrome");
        } else {
            System.out.println("Array is a palindrome");
        }
    }
}