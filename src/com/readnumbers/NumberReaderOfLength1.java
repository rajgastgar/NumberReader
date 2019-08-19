package com.readnumbers;

import com.core.ReadNumber;

public class NumberReaderOfLength1 implements ReadNumber {
	@Override
	public String readNumber(int num) {
		switch (num) {
			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";
			case 8:
				return "eight";
			case 9:
				return "nine";
			case 0:
				return "zero";
		}
		return "INVALID";
	}
}