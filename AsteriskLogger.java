package com.promineotech;
/*
 * 4.  Implement the AsteriskLogger methods:  

Note:  The AsteriskLogger will use the asterisk or "*".


a.  The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the 
String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).

b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded
by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:

****************

***Error: Hello***

****************
 */

public class AsteriskLogger implements Logger { // keyword "implements" is added from the interface.

@Override

// methods
public void log(String log) {
	// TODO Auto-generated method stub
	System.out.println("***" + log + "***\n");
}

@Override
public void error(String error) {
	// TODO Auto-generated method stub
	System.out.println("****************\n");
	System.out.println("***Error: " + error + "***\n");
	System.out.println("****************\n");
	
}

}

