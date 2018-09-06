package com.skmuddamsetty.algorithms;

public class BubbleSort_old {

	public static int[] bubbleSort(int[] array) {
		int length = array.length - 1;
		int temp = 0;
		if (array != null && length > 0) {
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length - i; j++) {
					if (array[j] > array[j + 1]) {
						System.out.println(array[j] + ">" + array[j + 1] + " -swapping");
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		}
		return array;
	}

	public static int findMaxElementUsingBubbleSort(int[] array) {
		int maxElement = 0;
		int length = array.length - 1;
		int temp = 0;
		if (array != null && length > 0) {
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length - i; j++) {
					if (array[j] > array[j + 1]) {
						System.out.println(array[j] + ">" + array[j + 1] + " -swapping");
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
				maxElement = array[array.length - 1];
				break;// breaking out for the first loop as the max element is
						// found in the first loop
			}
		}
		return maxElement;
	}

	public static int findMinElementUsingBubbleSort(int[] array) {
		int maxElement = 0;
		int length = array.length - 1;
		int temp = 0;
		if (array != null && length > 0) {
			for (int i = length; i > 0; i--) {
				for (int j = length - i; j > 0; j--) {
					if (array[j] < array[j - 1]) {
						System.out.println(array[j] + "<" + array[j - 1] + " -swapping");
						temp = array[j];
						array[j] = array[j - 1];
						array[j - 1] = temp;
					}
				}
				maxElement = array[array.length - 1];
				break;// breaking out for the first loop as the max element is
						// found in the first loop
			}
		}
		return maxElement;
	}
}
