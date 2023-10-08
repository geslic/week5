package com.promineotech;
/*
 * 5. Implement the SpacedLogger methods:

Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.


a. If the log method received “Hello” as an argument, it should print H e l l o

b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
 */

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder(); // mutable string
		for (int i = 0; i < log.length(); i++) { // for each index on the string, add the space
			result.append(log.charAt(i));
			if (i < log.length() - 1) { // as long as i is the length of the string. 
				result.append(" ");
			}
		}
		System.out.println(result + "\n");
		/*
		 * In line 25, I've changed the print variable from log to result because it was printing hello
		 * without the spaces. Same goes for the error method, I've changed the variable from error to
		 * result.
		 */
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			result.append(error.charAt(i));
			if (i < error.length() - 1) {
				result.append(" ");
			}
		}
		System.out.println("ERROR: " + result);
	}
	}


