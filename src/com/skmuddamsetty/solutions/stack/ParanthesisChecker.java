package com.skmuddamsetty.solutions.stack;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class ParanthesisChecker {

	public static void main(String[] args) {
		String expression = "(((ABCDEF)))";
		System.out.println("Expression well formedness:" + checkWellFormednessofExpression(expression));
	}

	/**
	 * 
	 */
	private static boolean checkWellFormednessofExpression(String expression) {
		try {
			HashSet<Character> closingCharacterSet = new HashSet<Character>();
			HashMap<Character, Character> parentHashMap = new HashMap<Character, Character>();
			Stack<Character> myStack = new Stack<Character>();
			addAcceptableParanthesis(parentHashMap);
			closingCharacterSet.addAll(parentHashMap.values());
			for (int i = 0; i < expression.length(); i++) {
				if (parentHashMap.containsKey(expression.charAt(i))) {
					myStack.push(expression.charAt(i));
				} else if (closingCharacterSet.contains(expression.charAt(i))) {
					Character topElementInStack = myStack.pop();
					if (parentHashMap.get(topElementInStack) != expression.charAt(i)) {
						System.out.println("Expression is not well formed");
						return false;
					}
				}
			}
			return myStack.isEmpty();
		} catch (EmptyStackException e) {
			System.out.println("Stack underflow");
			return false;
		}
	}

	public static HashMap<Character, Character> addAcceptableParanthesis(HashMap<Character, Character> parentHashMap) {
		parentHashMap.put('(', ')');
		parentHashMap.put('{', '}');
		parentHashMap.put('[', ']');
		return parentHashMap;
	}

}
