package com.readnumbers;

import com.core.ReadNumber;

import test.util.DigitsInNumber;

public class NumberReaderOfLength5 implements ReadNumber{
	@Override
	public String readNumber(int num) {
		int first2Digit = DigitsInNumber.getFirst2Digit(num);
		int last3Digits = DigitsInNumber.getLast3Digits(num);
		
		String first2DigitsInString = new NumberReaderOfLength2().readNumber(first2Digit);
		String completeRead = first2DigitsInString + " thousand";

		if (last3Digits == 0) {
			return completeRead;
		}else{
			return completeRead + " " + ReadNumberManager.processNumberToText(""+last3Digits);
		}
	}
}
