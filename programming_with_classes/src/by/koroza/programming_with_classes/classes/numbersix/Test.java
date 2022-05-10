package by.koroza.programming_with_classes.classes.numbersix;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] attayOne = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrayArraysCopyOf = Arrays.copyOf(attayOne, 5);
		int[] arrayArraysCopyOfRange = Arrays.copyOfRange(attayOne, 1, 6);
		int[] arraySystemArrayCopy = new int[13];
		System.arraycopy(attayOne, 2, arraySystemArrayCopy, 5, 7);
	}
}