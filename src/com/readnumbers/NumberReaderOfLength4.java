package com.readnumbers;

import com.core.ReadNumber;

import test.util.DigitsInNumber;

public class NumberReaderOfLength4 implements ReadNumber{
	@Override
	public String readNumber(int num) {
		int firstDigit = DigitsInNumber.getFirstDigit(num);
		int last3Digits = DigitsInNumber.getLast3Digits(num);
		String firstDigitsInString = new NumberReaderOfLength1().readNumber(firstDigit);
		String completeRead = firstDigitsInString + " thousand";

		if (last3Digits == 0) {
			return completeRead;
		}else{
			return completeRead + " " + ReadNumberManager.processNumberToText(""+last3Digits);
		}
	}
}
