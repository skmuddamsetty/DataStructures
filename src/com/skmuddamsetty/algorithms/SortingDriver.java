package com.skmuddamsetty.algorithms;

public class SortingDriver {

	private static int[] array = {1000000,100,-1};

	public static void main(String[] args) {
		printArray(BubbleSort_old.bubbleSort(array));
		int findMaxElementUsingBubbleSort = BubbleSort_old.findMinElementUsingBubbleSort(array);
		System.out.println(findMaxElementUsingBubbleSort);
	}

	private static void printArray(int[] array) {
		if (array != null && array.length > 0) {
			System.out.print("Sorted Array is:");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.print("\n");
		} else {
			System.out.println("Array is empty, please input valid values");
		}

	}

}
