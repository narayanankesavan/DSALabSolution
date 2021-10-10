package com.greatlearning.dsalabsession;

import java.util.Stack;

//Input1:- ( [ [ { } ] ] )
//Output1:- The entered String has Balanced Brackets
//Input2:- ( [ [ { } ] ] ) )
//Output2:- The entered Strings do not contain Balanced Brackets
public class BalancedBrackets {
	private static boolean isBalanced(String bracketExpression) {
		Stack<Character> stack = new Stack<Character>();

		// iterate through the characters
		for (char c : bracketExpression.toCharArray()) {

			// Check if c is '(','{','['
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				Character ch = (Character) stack.pop();
				if (c == '}' && ch != '{' || (c == ')' && ch != '(')
						|| (c == ']' && ch != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}

	public static void main(String[] args) {

		String bracketExpression = "([[{}]])";
		// String bracketExpression = "([[{}]]))";

		if (isBalanced(bracketExpression))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

	}

}
