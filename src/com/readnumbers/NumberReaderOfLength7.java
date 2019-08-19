package com.readnumbers;

import com.core.ReadNumber;

import test.util.DigitsInNumber;

public class NumberReaderOfLength7 implements ReadNumber{
	@Override
	public String readNumber(int num) {
		int firstDigit = DigitsInNumber.getFirstDigit(num);
		int last6Digits = DigitsInNumber.getLast6Digit(num);
		String completeRead = new NumberReaderOfLength1().readNumber(firstDigit) + " million";
		
		if(last6Digits == 0) {
			return completeRead;
		}else{
			return completeRead + " " + ReadNumberManager.processNumberToText(""+last6Digits);
		}
		
	}
}
