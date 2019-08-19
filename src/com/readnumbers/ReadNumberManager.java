package com.readnumbers;

import javax.swing.DefaultBoundedRangeModel;

import com.core.ReadNumber;

public class ReadNumberManager {
	public static String processNumberToText(String number) {
		Integer i = Integer.parseInt(number);
		ReadNumber rn = null;
		int length = String.valueOf(i).length();
		String answer = "";
		switch(length) {
			case 1 : 
				rn = new NumberReaderOfLength1();
				break;
			case 2 :
				rn = new NumberReaderOfLength2();
				break;
			case 3 : 
				rn = new NumberReaderOfLength3();
				break;
			case 4 : 
				rn = new NumberReaderOfLength4();
				break;
			case 5 :
				rn = new NumberReaderOfLength5();
				break;
			case 6 : 
				rn = new NumberReaderOfLength6();
				break;
			case 7 : 
				rn = new NumberReaderOfLength7();
				break;
			case 8 :
				rn = new NumberReaderOfLength8();
				break;
			case 9 : 
				rn = new NumberReaderOfLength9();
				break;
		}
		answer = rn.readNumber(i);
		return answer;
	}
}
