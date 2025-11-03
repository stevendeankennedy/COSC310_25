package edu.frostburg.cosc310.sorts;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		Sort s = new Sort();

		int[] list = new int[] { 2, 9, 5, 7, 1, 8, 4, 3, 6 };
		int n = list.length;
		
		System.out.println(Arrays.toString(list));
//		s.quicksort(list, 0, n-1);
		s.mergeSort(list, 0, n -1);
		System.out.println(Arrays.toString(list));
	}

	public int partition(int[] arr, int low, int high) {
		// get pivot value
		int pivot = arr[high]; // this is literally the worst way to pivot

		int i = low - 1;

		// move less values to left of
		// and bigger values to right
		for (int j = low; j <= high - 1; j++) { // for every element in this partition
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
//				System.out.println("swap->" + Arrays.toString(arr));

			}
		}

		swap(arr, i + 1, high);
		return i + 1;
	}

	public void quicksort(int[] arr, int low, int high) {
		if (low < high) {
			// partition index
			int pi = partition(arr, low, high);
			
			quicksort(arr, low, pi - 1);
//			System.out.println(Arrays.toString(arr));

			quicksort(arr, pi + 1, high);
//			System.out.println(Arrays.toString(arr));
		}
	}

	void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public void merge(int[] arr, int l, int m, int r) {
		// get sub lists
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		// copy data to temp location
		for (int i=0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j=0; j < n2; ++j)
			R[j] = arr[m + 1 + j];
		
		// merge
		int i = 0, j = 0;
		
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else { // L[i] is > R[j]
				arr[k] = R[j];
				j++;
			}
			k++;
		} // end of while for merging
		
		// remaining case, might have elements left
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	public void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			// get middle
			int m = l + (r - l) / 2;
			
			// Sort halves
			mergeSort(arr, l, m); // left
			mergeSort(arr, m+1, r); // right
			
			// merge the now sorted partitions together
			merge(arr, l, m, r);
		}
		// otherwise, we do nothing (base case)
	}
}
