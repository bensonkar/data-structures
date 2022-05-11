package main;

public class BubbleSort {

    static void bubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {23, 12, 54, 7, 89, 21, 8, 4, 56, 87, 98, 3, 55, 600};
        bubbleSort(arr, arr.length);
        display(arr);
    }
}
