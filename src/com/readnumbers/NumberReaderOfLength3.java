package com.readnumbers;

import com.core.ReadNumber;

import test.util.DigitsInNumber;

public class NumberReaderOfLength3 implements ReadNumber {
	@Override
	public String readNumber(int num) {
		int firstDigit = DigitsInNumber.getFirstDigit(num);
		int last2Digits = DigitsInNumber.getLast2Digit(num);
		String firstDigitsInString = new NumberReaderOfLength1().readNumber(firstDigit);
		String completeRead = firstDigitsInString + " hundred";

		if (last2Digits == 0) {
			return completeRead;
		} else{
			return completeRead + " and " + ReadNumberManager.processNumberToText(""+last2Digits);
		}
	}

}
