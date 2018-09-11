/**
 * 
 * https://practice.geeksforgeeks.org/problems/easy-string/0
 * 
 * */
package com.skmuddamsetty.solutions.stack;

import java.util.Stack;

public class EasyString {

	public static void main(String[] args) {
		String expression = "abc";
		printEasyString(expression);
	}

	private static void printEasyString(String expression) {
		int tempCount = 0;
		Stack<String> myStack = new Stack<String>();
		for (int i = 0; i < expression.length(); i++) {
			String currentLetter = String.valueOf(expression.charAt(i)).toLowerCase();
			if (myStack.isEmpty()) {
				myStack.push(currentLetter);
			}
			if (myStack.peek().equalsIgnoreCase(currentLetter)) {
				tempCount++;
				printLastCharacterLength(expression, tempCount, myStack, i, currentLetter);
			} else {
				String printLetter = myStack.pop();
				System.out.print(tempCount + printLetter);
				myStack.push(currentLetter);
				tempCount = 1;
				printLastCharacterLength(expression, tempCount, myStack, i, currentLetter);
			}
		}
	}

	/**
	 * @param expression
	 * @param tempCount
	 * @param myStack
	 * @param i
	 * @param currentLetter
	 */
	private static void printLastCharacterLength(String expression, int tempCount, Stack<String> myStack, int i,
			String currentLetter) {
		if (expression.length() - 1 == i) {
			myStack.pop();
			System.out.print(tempCount + currentLetter);
		}
	}

}
