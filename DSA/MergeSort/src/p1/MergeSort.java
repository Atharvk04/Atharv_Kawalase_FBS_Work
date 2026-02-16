package p1;

import java.util.Scanner;

class MergeSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            combine(arr, start, mid, end);
        }
    }

    static void combine(int[] arr, int start, int mid, int end) {

        int i = start;
        int j = mid + 1;
        int k = 0;

        int[] n_arr = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                n_arr[k] = arr[i];
                i++;
            } else {
                n_arr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            n_arr[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            n_arr[k] = arr[j];
            j++;
            k++;
        }

        int y = start;
        for (int x = 0; x < n_arr.length; x++) {
            arr[y] = n_arr[x];
            y++;
        }
    }
}
