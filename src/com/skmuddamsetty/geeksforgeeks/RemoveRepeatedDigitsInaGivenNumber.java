/**
 * Given an integer N, remove consecutive repeated digits from it.
 * Input:
 * The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The first line of each test case contains the integer N.
 * Output:
 * Print the number after removing consecutive digits. Print the answer for each test case in a new line.
 * Constraints:
 * 1<= T <=100
 * 1<= N <=1018
 * Example:
 * Input:
 * 1
 * 12224
 * Output:
 * 124
 * */
package com.skmuddamsetty.geeksforgeeks;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class RemoveRepeatedDigitsInaGivenNumber {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		RemoveRepeatedDigitsInaGivenNumber obj = new RemoveRepeatedDigitsInaGivenNumber();
		obj.readFile("file/RemoveRepeatedDigitsInaGivenNumber.txt");
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		double seconds = (double)totalTime / 1000000000.0;
		System.out.println("\nTotal time taken in seconds: "+seconds);
	}

	private void readFile(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		Stack<String> myStack = new Stack<String>();
		try (Scanner br = new Scanner(file)) {
			int testCases = Integer.parseInt(br.nextLine());
			int tempTestCases = testCases;
			while (testCases > 0) {
				String[] strArray = br.nextLine().split("");
				for (int i = strArray.length - 1; i >= 0; i--) {
					if (myStack.isEmpty() || (!myStack.isEmpty() && !(myStack.peek().equalsIgnoreCase(strArray[i])))) {
						myStack.push(strArray[i]);
					}
				}
				if (tempTestCases != testCases) {
					System.out.println("");
				}
				while (!myStack.isEmpty()) {
					System.out.print(myStack.pop());
				}

				testCases--;
			}

			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
