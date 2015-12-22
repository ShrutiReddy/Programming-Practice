package com.stringcomputations;

import java.util.*;
import junit.framework.*;

public class CheckParenthesis {

	/**
	 * Input is in the form () ,  (() , (())  etc.. It returns true when braces
	 * match. false otherwise.
	 * 
	 * @param s
	 *            - input Braces as above
	 * @return - boolean
	 */
	public static boolean validateBraces(String s) {

		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				st.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {

				// more ')' chars than '('. so stack would exhause earlier.
				if (st.empty()) {
					return false;
				}

				st.pop();
			}
		}

		if (st.empty())
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		Assert.assertTrue(validateBraces("(())"));
		Assert.assertFalse(validateBraces("(()"));
		Assert.assertFalse(validateBraces("(("));
		Assert.assertFalse(validateBraces("))"));
		Assert.assertTrue(validateBraces("()"));

	}

}
