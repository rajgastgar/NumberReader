package com.readnumbers;

import java.util.Scanner;

public class ReadNumberExecuter{
	
	public static void main(String[] args) {
		System.out.println("Please enter the number to be read : ");
		Scanner sc =new Scanner(System.in);
		while (sc.hasNext()) {
			
		    String input = sc.next();
		    if(input.equalsIgnoreCase("stop")) {
		    	System.out.println("Program exiting. Thank you.");
		    	System.exit(0);
		    }else {
		    	try {
		    		System.out.println("Answer : "+ReadNumberManager.processNumberToText(input));
		    		System.out.println();
		    	}catch(Exception e) {
		    		System.out.println("Your input was : "+input);
		    		System.err.println("Following error occured while processing. Please enter a valid positive number. Special characters are not allowed.");
		    		System.err.println(e);
		    	}
		    	System.out.println("Please enter the number to be read : \n");
		    }
		}
	}
}
