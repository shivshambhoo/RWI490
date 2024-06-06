package ArrayDemo;

public class QuickSort {
	
	// Swap function
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Partition function
    static int partition(int arr[], int s, int e) {
        int pivot = arr[s];
        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }

        // Place pivot at right position
        int PivotIndex = s + count;
        swap(arr, PivotIndex, s);

        // Left and right parts
        int i = s;
        int j = e;
        while (i < PivotIndex && j > PivotIndex) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < PivotIndex && j > PivotIndex) {
                swap(arr, i++, j--);
            }
        }

        return PivotIndex;
    }

    // QuickSort function
    static void QuickSort(int arr[], int s, int e) {
        // Base case
        if (s >= e)
            return;

        // Partition
        int p = partition(arr, s, e);

        // Recursive call
        // Sort left part
        QuickSort(arr, s, p - 1);

        // Sort right part
        QuickSort(arr, p + 1, e);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 6, 9, 9, 9, 9, 9, 9};
        int n = arr.length;

        QuickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
