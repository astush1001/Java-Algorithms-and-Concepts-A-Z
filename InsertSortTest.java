package com.test;

import java.util.Arrays;

public class InsertSortTest {
	final static int n = 10;

	public static void main(String[] args) {

		int[] num = { 4, 1, 3, 9, 7, 48, 57, 65, 16, 41 };

		// n numbers are stored from num[0] to num[n-1]

		insertionSort(num, n);

		System.out.printf("\nThe sorted numbers are:" + Arrays.toString(num));

	} // end main

	public static void insertionSort(int list[], int n) {
		// sort list[0] to list[n-1] in ascending order
		for (int h = 1; h < n; h++) {
			int key = list[h];
			int k = h - 1; // start comparing with previous item
			while (k >= 0 && key < list[k]) {
				list[k + 1] = list[k];
				--k;
			}
			list[k + 1] = key;
		} // end for
	} // end insertionSort
} // end class InsertSortTest
