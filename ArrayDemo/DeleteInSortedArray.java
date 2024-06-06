package ArrayDemo;


public class DeleteInSortedArray {

    // Binary search 
    static int binarySearch(int arr[], int start, int end, int key) {
        if (end < start) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (key == arr[mid]) {
            return mid;
        } else if (key > arr[mid]) {
            return binarySearch(arr, mid + 1, end, key);
        } else {
            return binarySearch(arr, start, mid - 1, key);
        }
    }

    // Function to delete an element
    static int deleteElement(int arr[], int n, int key) {
        // Find position of element to be deleted
        int pos = binarySearch(arr, 0, n - 1, key);

        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }

        // Deleting element
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int n = arr.length;
        int key = 30;

        System.out.println("Array before deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Function call
        n = deleteElement(arr, n, key);

        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
