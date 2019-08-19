package com.readnumbers;

import com.core.ReadNumber;

import test.util.DigitsInNumber;

public class NumberReaderOfLength6 implements ReadNumber{
	@Override
	public String readNumber(int num) {
		int first3Digits = DigitsInNumber.getFirst3Digit(num);
		int last3Digits = DigitsInNumber.getLast3Digits(num);
		
		String completeRead = new NumberReaderOfLength3().readNumber(first3Digits) + " thousand";
		if(last3Digits == 0) {
			return completeRead;
		}else{
			return completeRead + " " + ReadNumberManager.processNumberToText(""+last3Digits);
		}
	}
}
