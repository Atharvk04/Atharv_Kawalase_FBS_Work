package p1;

import java.util.Scanner;

class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		bubbleSort(arr);

		System.out.println("Sorted Array: ");
		for (int i = 0; i < arr.length; i++)
			System.out.println(" " + arr[i]);

	}

	static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) 
		{
			boolean is_swapped = false;
			for (int j = 0; j < arr.length - 1; j++) 
			{
				if (arr[j] > arr[j + 1]) 
				{
					is_swapped = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			if (is_swapped == false)
				break;
		}
	}
}