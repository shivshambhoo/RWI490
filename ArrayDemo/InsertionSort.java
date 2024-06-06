package ArrayDemo;


/*Insertion sort is a simple sorting algorithm that works by building a sorted array one element at a time. 
It is considered an “in-place” sorting algorithm, meaning it doesn’t require any additional memory space beyond 
original array.

Algorithm:
To achieve insertion sort, follow these steps:
1. We have to start with second element of the array as first element in the array is assumed to be sorted.
2. Compare second element with the first element and check if the second element is smaller then swap them.
3. Move to the third element and compare it with the second element, then the first element and swap as necessary 
   to put it in the correct position among the first three elements.
4. Continue this process, comparing each element with the ones before it and swapping as needed to place it 
   in the correct position among the sorted elements.
5. Repeat until the entire array is sorted.  */

public class InsertionSort {
	
	 void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	             int key = arr[i];
	             int j = i - 1;

	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }

	    static void printArray(int arr[])
	    {
	       
	        for (int i = 0; i <arr.length; ++i)
	            System.out.print(arr[i] + " ");

	        System.out.println();
	    }

	    
	    public static void main(String args[])
	    {
	        int arr[] = { 12, 11, 13, 5, 6 };

	        InsertionSort ob = new InsertionSort();
	        ob.sort(arr);

	        printArray(arr);
	    }
}

/*Time Complexity of Insertion Sort
  *Best case: O(n), If the list is already sorted, where n is the number of elements in the list.
  *Average case: O(n2), If the list is randomly ordered
  *Worst case: O(n2), If the list is in reverse order
  
Space Complexity of Insertion Sort
  *Auxiliary Space: O(1), Insertion sort requires O(1) additional space, making it a space-efficient 
  sorting algorithm.
*/
