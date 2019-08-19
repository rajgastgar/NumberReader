package com.readnumbers;

import com.core.ReadNumber;

import test.util.DigitsInNumber;

public class NumberReaderOfLength2 implements ReadNumber {
	@Override
	public String readNumber(int num) {
		int firstDigit = DigitsInNumber.getFirstDigit(num);
		int lastDigit = DigitsInNumber.getLastDigit(num);
		String singleNum = new NumberReaderOfLength1().readNumber(lastDigit);
		switch (firstDigit) {
		case 1:
			switch (lastDigit) {
			case 1:
				return "eleven";
			case 2:
				return "twelve";
			case 3:
				return "thirteen";
			case 4:
				return "fourteen";
			case 5:
				return "fifteen";
			case 6:
				return "sixteen";
			case 7:
				return "seventeen";
			case 8:
				return "eighteen";
			case 9:
				return "nineteen";
			case 0:
				return "ten";
			}
		case 2:
			switch (lastDigit) {
				case 0:
					return "twenty";
				default:
					return "twenty " + singleNum;
			}
		case 3:
			switch (lastDigit) {
				case 0:
					return "thirty";
				default:
					return "thirty " + singleNum;
			}
		case 4:
			switch (lastDigit) {
				case 0:
					return "fourty";
				default:
					return "fourty " + singleNum;
			}
		case 5:
			switch (lastDigit) {
			case 0:
				return "fifty";
			default:
				return "fifty " + singleNum;
			}
		case 6:
			switch (lastDigit) {
			case 0:
				return "sixty";
			default:
				return "sixty " + singleNum;
			}
		case 7:
			switch (lastDigit) {
			case 0:
				return "seventy";
			default:
				return "seventy " + singleNum;
			}
		case 8:
			switch (lastDigit) {
			case 0:
				return "eighty";
			default:
				return "eighty " + singleNum;
			}
		case 9:
			switch (lastDigit) {
			case 0:
				return "ninety";
			default:
				return "ninety " + singleNum;
			}
		
		}
		return "INVALID";
	}
}
