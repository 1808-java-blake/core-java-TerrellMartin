package com.revature.eval.java.core;

public class RotationalCipher {
	private int key;

	public RotationalCipher(int key) {
		super();
		this.key = key;
	}

	public String rotate(String string) {
		String s = "";
		int length = string.length();
		for(int j = 0; j < length ; j++) {
			if ((int)string.charAt(j) > 65 && (int)string.charAt(j) < 123 ) {
				
				char c = (char)(string.toLowerCase().charAt(j) + key);
				if (c > 'z' ) 
					s += (char)(string.charAt(j) - (26-key));
				else
					s += (char)(string.charAt(j) + key);
			}
			else {
				if ((int)string.charAt(j) == 32) {
					s += " ";
				}
				if ((int)string.charAt(j) == 39) {
					s += "'";
				}
				if ((int)string.charAt(j) > 47 && (int)string.charAt(j) < 58) {
					s += (char)(string.charAt(j));
				}

			}
		}

		return s;
	}
	public static void main (String[] args) {
		RotationalCipher r = new RotationalCipher(4);
		System.out.println(r.rotate("Testing 1 2 3 testing"));
	}

}
