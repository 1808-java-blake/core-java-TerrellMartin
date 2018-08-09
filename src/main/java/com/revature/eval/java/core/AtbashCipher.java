package com.revature.eval.java.core;

class AtbashCipher {
	
	String ourWay = "abcdefghijklmnopqrstuvwxyz";
	String cipherWay = "zyxwvutsrqponmlkjihgfedcba";
	int size = 5;
	
	/**
	 * Question 13
	 * 
	 * @param string
	 * @return
	 */
	public static String encode(String string) {
		// TODO Write an implementation for this method declaration
		
//		String filter = "";
//		for (char letter : string.toCharArray()) {
//			if(Character.isLetterOrDigit(letter)) {
//				filter = filter + letter;
//			}
//		}
//		String tocypher = "";
//		for (char c : filter.toCharArray()) {
//			int idx = ourWay.indexOf(string);
//			
//		}
		return null;
	}

	/**
	 * Question 14
	 * 
	 * @param string
	 * @return
	 */
	public static String decode(String string) {
		// TODO Write an implementation for this method declaration
		StringBuilder d  = new StringBuilder();
		for (char c : string.toCharArray()) {
			if(Character.isLetter(c)) {
				int nc = ('Z' - c) + 'A';
				d.append((char) nc);
			}
			else {
				d.append(c);
			}
		}
		return d.toString();
	}
	public static void main(String[] args) {
		System.out.println(decode("vcvix rhn"));
	}
}