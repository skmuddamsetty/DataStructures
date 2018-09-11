/**
 * https://www.geeksforgeeks.org/print-bracket-number/
 * 
 * */
package com.skmuddamsetty.solutions.stack;

import java.util.Stack;

public class PrintBracketNumber {

	public static void main(String[] args) {
		String expression = "((())(()))​";
		printBracketNUmber(expression);
	}

	public static void printBracketNUmber(String expression) {
		int number = 1;
		Stack<Integer> currentCountStack = new Stack<Integer>();
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '(') {
				currentCountStack.push(number);
				System.out.print(number);
				number++;
			} else if (expression.charAt(i) == ')') {
				System.out.print(currentCountStack.pop());
			}
		}
	}

}
