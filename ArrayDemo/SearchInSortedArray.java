package ArrayDemo;


// Implement Binary search --> Find The Element in Sorted Array 
// Given an Array is 1 2 3 4 5 6 our Tasks is to find the 3 element in this sorted array 
// Time complexity of this algo is O(nlog(n)) and space complexity is O(log(n)) due to recursive calls,

public class SearchInSortedArray {
	// function to implement 
    // binary search 
    static int binarySearch(int arr[], int start, int end, 
                            int key) 
    { 
    	
        if (end < start) 
            return -1; 
  
        /*  mid = low + (high - low)/2;*/
        
        
        int mid = (start + end) / 2; 
        if (key == arr[mid]) 
            return mid; 
        
        
        if (key > arr[mid]) 
        {
        	  return binarySearch(arr, (mid + 1), end, key);
        }
        else
        {
        	return binarySearch(arr, start, (mid - 1), key); 
        }
        	 
    } 
  
    public static void main(String[] args) 
    { 
       
        int arr[] = { 5, 6, 7, 8, 9, 10 }; 
        int n, key; 
        n = arr.length - 1; 
        key = 10; 
  
        // Function call 
        System.out.println("Index: " + binarySearch(arr, 0, n, key)); 
    } 

}
