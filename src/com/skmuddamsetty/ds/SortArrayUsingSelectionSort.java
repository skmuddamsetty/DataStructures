package com.skmuddamsetty.ds;

public class SortArrayUsingSelectionSort {
	private static int noOfSwaps = 0;
	private static int noOfComparisions = 0;
	private static int[] myArray = {3,200,4,9,1,15,0,100};

	public static void main(String[] args) {
		for (int i = 0; i < myArray.length; i++) {
			for(int j=i+1;j<myArray.length;j++){
				noOfComparisions++;
				if(myArray[i]>myArray[j]){
					swap(i,j);
					print(myArray);
				}
			}
		}
		System.out.println("Total No of Comparisions: "+noOfComparisions);
		System.out.println("Total No of Swaps: "+noOfSwaps);
	}

	private static void print(int[] myArray2) {
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < myArray2.length; i++) {
			sbf.append(myArray2[i]).append(",");
		}
		System.out.println(sbf.toString());
	}

	private static void swap(int i, int j) {
		noOfSwaps++;
		int temp = myArray[i];
		myArray[i] = myArray[j];
		myArray[j] = temp;
	}

}
