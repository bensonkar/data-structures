package main;

/**
 * @author bkariuki
 */
public class SearchAlgorithm {

    /**
     * Linear search is used to search a key element from multiple elements.
     * Linear search is less used today because it is slower than binary search and hashing.
     */
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Binary search is used to search a key element from multiple elements.
     * Binary search is faster than linear search.
     */
    static int binarySearch(int array[], int element, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;

            // check if mid element is searched element
            if (array[mid] == element)
                return mid;

            // Search the left half of mid
            if (array[mid] > element)
                return binarySearch(array, element, low, mid - 1);

            // Search the right half of mid
            return binarySearch(array, element, mid + 1, high);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 50, 70, 90};
        int key = 50;
        System.out.println(key + " using linear sort is found at index: " + linearSearch(a1, key));
        System.out.println(key + " using binary search is found at index: " + binarySearch(a1, key, 2, 4));
    }
}
