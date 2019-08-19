package test.util;

public class DigitsInNumber {
	
	public static int getFirstDigit(int num) {
		return Integer.parseInt(Integer.toString(num).substring(0, 1));
	}
	public static int getFirst2Digit(int num) {
		return Integer.parseInt(Integer.toString(num).substring(0, 2));
	}
	public static int getFirst3Digit(int num) {
		return Integer.parseInt(Integer.toString(num).substring(0, 3));
	}
	public static int getLastDigit(int num) {
		return (num % 10); 
	}
	
	public static int getLast2Digit(int num) {
		return (num % 100); 
	}
	
	public static int getLast3Digits(int num) {
		return (num % 1000); 
	}
	
	public static int getLast6Digit(int num) {
		return (num % 1000000); 
	}
	
}
