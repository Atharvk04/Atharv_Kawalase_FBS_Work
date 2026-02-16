package p1;

import java.util.*;

class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 = new int[4];
		int [] arr2 = new int[6];
		int [] arr3 = new int[arr1.length + arr2.length];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements for arr1: ");
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Enter elements for arr: ");
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int k = 0;
        for (int i = 0; i < arr1.length; i++)
            arr3[k++] = arr1[i];

        for (int i = 0; i < arr2.length; i++)
            arr3[k++] = arr2[i];

        // Sort the merged array
        Arrays.sort(arr3);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i] + " ");
    }
}

