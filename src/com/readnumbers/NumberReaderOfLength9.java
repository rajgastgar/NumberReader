package com.readnumbers;

import com.core.ReadNumber;

import test.util.DigitsInNumber;

public class NumberReaderOfLength9 implements ReadNumber{
	@Override
	public String readNumber(int num) {
		int first3Digits = DigitsInNumber.getFirst3Digit(num);
		int last6Digits = DigitsInNumber.getLast6Digit(num);
		String completeRead = new NumberReaderOfLength3().readNumber(first3Digits) + " million";
		
		if(last6Digits == 0) {
			return completeRead;
		}else{
			return completeRead + " " + ReadNumberManager.processNumberToText(""+last6Digits);
		}
	}
}
