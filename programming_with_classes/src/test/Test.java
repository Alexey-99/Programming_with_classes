package test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// arrayCopy();
		// creadString();
		codingString();
	}

	@SuppressWarnings("unused")
	private static void arrayCopy() {
		int[] attayOne = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arrayArraysCopyOf = Arrays.copyOf(attayOne, 5);
		int[] arrayArraysCopyOfRange = Arrays.copyOfRange(attayOne, 1, 6);
		int[] arraySystemArrayCopy = new int[13];
		System.arraycopy(attayOne, 2, arraySystemArrayCopy, 5, 7);
	}

	@SuppressWarnings("unused")
	private static void creadString() {
		char[] ch1 = new char[] { 'h', 'e', 'l', 'l', 'o' };
		char[] ch2 = { 'h', 'e', 'l', 'l', 'o' };
		String str1 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });
		String str2 = new String();
		String str3 = new String(new char[] { 'w', 'e', 'l', 'c', 'o', 'm', 'e' }, 3, 4);
	}

	@SuppressWarnings("unused")
	private static void codingString() throws UnsupportedEncodingException {
		String str1 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });
		String s = new String(str1.getBytes(), "coding_name");
	}
}