package com.readnumbers;

import com.core.ReadNumber;

import test.util.DigitsInNumber;

public class NumberReaderOfLength8 implements ReadNumber{
	@Override
	public String readNumber(int num) {
		int first2Digits = DigitsInNumber.getFirst2Digit(num);
		int last6Digits = DigitsInNumber.getLast6Digit(num);
		String completeRead = new NumberReaderOfLength2().readNumber(first2Digits) + " million";
		
		if(last6Digits == 0) {
			return completeRead;
		}else{
			return completeRead + " " + ReadNumberManager.processNumberToText(""+last6Digits);
		}
	}
}
