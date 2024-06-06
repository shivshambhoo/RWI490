package ArrayDemo;


/*Notes --->   In a sorted array, a search operation is performed for 
the possible position of the given element by using Binary search, 
and then an insert operation is performed followed by shifting the elements. 
And in an unsorted array, the insert operation is faster as compared to the 
sorted array because we don’t have to care about the position at which the element is placed.*/

/* for an example given the array is 1 2 4 5 6 now we want to put 3 element 
 inside this array between the element 2 and 4   */


public class InsertElementInSortedArray {
	
//	Helper function 
	static int insertsorted(int arr[], int n, int key, int capacity)
	{

		// we can't add more element in this array if n>=capacity 
		if(n>=capacity)
		{
			return n;
		}
		
		int i;
		for(i=n-1;(i>=0 && arr[i]>key); i--)
		{
			arr[i+1]=arr[i];
		}
		
		arr[i+1]=key;
		
		return (n+1);
	}
	
	public static void main(String[] args) {
		int arr[] = new int[20]; 
        arr[0] = 12; 
        arr[1] = 16; 
        arr[2] = 20; 
        arr[3] = 40; 
        arr[4] = 50; 
        arr[5] = 70; 
        
        int capacity=arr.length;
        int n=6;
        int key=26;
        
        System.out.println("Before Insertion ");
        for(int i=0; i<n; i++)
        {
        	System.out.println(arr[i]+" ");
        }
        
        // function call
        n=insertsorted(arr, n, key, capacity);
        
        System.out.println("After Insertion ");
        for( int i=0; i<n; i++)
        {
        	System.out.println(arr[i]+ " ");
        }
        
	}

}
