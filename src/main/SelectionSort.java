package main;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        int pos, temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                }
            }
            temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    static void display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {23, 12, 54, 7, 89, 21, 8, 4, 56, 87, 98, 3, 55, 600};
        selectionSort(arr);
        display(arr);
    }
}
