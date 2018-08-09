package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Launcher {

	public static void main(String[] args) {
		System.out.println(reverse("Ramen"));
		System.out.println(acronym("Complementary metal-oxide semiconductor"));
		System.out.println(isArmstrongNumber(10));
		System.out.println(cleanPhoneNumber(("321234567890")));
		System.out.println(toPigLatin("apple"));
		System.out.println(getScrabbleScore("OxyphenButazone"));
		System.out.println(isValidIsbn("3-598-21508-9"));
		System.out.println(isLuhnValid("046 454 286"));
		System.out.println(isPangram("five boxing wizards jump quickly at it"));
		System.out.println(wordCount("one fish two fish red fish blue fish"));
		System.out.println(translate("apple"));
		System.out.println("=========================================================================================================================");
		System.out.println(solveWordProblem("what is 5 plus 7?"));
		
	}
	public static int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		StringBuilder s = new StringBuilder(string);
		s.deleteCharAt(string.length() - 1);
		System.out.println(s);
		ArrayList<Integer> listOfIntegers = new ArrayList<>();
		//String[] s2 = s;
//		for(int i = 0; i < s.length(); i++) {
//
//		}

		return 0;
	}
	
	public int calculateNthPrime(int i) {
		// TODO Write an implementation for this method declaration
		int pNum = 3;
		int counter = 2;
		if (i == 1) {
			return 2;
		}
		while (counter < pNum) {
			for(int j = pNum + 2; ;);
		}
		return pNum;
	}
	public static Map<String, Integer> wordCount(String string) {
		String[] s = string.split(" ");
		Map<String, Integer> mapper = new HashMap<String, Integer>();
		int c;
		
		for (int i = 0; i < s.length; i++) {
			if (mapper.containsKey(s[i])) {
				c = mapper.get(s[i]);
				mapper.put(s[i], c + 1);
			}
			else {
				mapper.put(s[i], 1);
			}
		}

		//System.out.println(mapper.entrySet());
		return mapper;
	}
	
	
	public static boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		boolean[] marker = new boolean[26];
		int theIndex = 0;
		
		for(int i = 0; i < string.length(); i++) {
			if ('a' <= string.charAt(i) && string.charAt(i) <= 'z') {
				theIndex = string.charAt(i) - 'a';
			}
			marker[theIndex]=true;
		}
		for(int i = 0; i <=25; i++) {
			if (marker[i] == false)
				return false;
		}
		return true;
	}
	
	public static boolean isLuhnValid(String string) {
		// TODO Write an implementation for this method declaration
		int total = 0;
		int num = 0;
		Boolean choice = false;
		string = string.replace(" ", "");
		//Find a way to take away any special characters from this method. 
		for (int i = string.length() - 1; i >= 0; i--) {
			num = Integer.parseInt(string.substring(i,  i + 1));
			if (choice) {
				num *= 2;
				if (num > 9) {
					num = (num % 10)+1;
				}
			}
			total += num;
			choice = !choice;
		}
		return (total % 10 == 0);
	}
	
	public static boolean isValidIsbn(String string) {
		string = string.replace("-", "");
		int l = string.length();
		if (l != 10) {
			return false;
		}
		int total = 0;
		for(int i = 0; i < 9; i++) {
			int num = string.charAt(i) - '0';
			if(0 > num || 9 < num) {
				return false;
			}
			total += (num * (10-i));
		}
		//numL is the last number which is the [9] of the string.
		char numL = string.charAt(9);
		if (numL != 'X' && (numL < '0' || numL > '9')) {
			return false;
		}
		total += ((numL == 'X') ? 10 : (numL - '0'));

		return (total % 11 == 0);
	}
	
	public static int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
		int sum = 0;
		//do the scoreValues again..
		int[] scoreValues = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};  
		string = string.toLowerCase();
		for(int i = 0; i < string.length(); i++) {
			for(int j = 0; j < 26; j++) {
				if(string.charAt(i) == alphabet[j]) {
					sum += scoreValues[j];
				}
			}
		}

		return sum;
	}
	public static String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
//		String pig = string.substring(1) + string.substring(0, 1) + "ay";
//		
//		return"%s " + pig;
		char a = 'a';
		char e = 'e';
		char i = 'i';
		char o = 'o';
		char u = 'u';
		
		int b = 0; //beginning of word
		int fv = 0; //first vowel
		int last = string.length();
		for(int j = 0; j < last; j++) {
			char letter = Character.toLowerCase(string.charAt(j));
			if(letter == 'a' || letter == 'e' || letter == 'i'|| letter == 'o'|| letter == 'u') {
				fv = j;
				break;
			}
			
		}
		
		if(b != fv) {
			String starter = string.substring(fv, last);
			String ender = string.substring(b, fv) + "ay";
			return starter+ender;
		}
		return string;
	}
	public static String translate (String original){
	       char firstChar;
	           String pig;

	           original = original.toLowerCase();

	           firstChar = original.charAt(0);
	           if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' ||
	                   firstChar == 'u'){
	               pig = original + "way";
	           }
	           else{
	               pig = original.substring(1) + original.charAt(0) + "ay";
	           }
	           return pig;
	}
	public static String cleanPhoneNumber(String string) {
		string = string.replaceAll("[/()-]", "");
		string = string.replace(".", "");
		string = string.replaceAll(" ", "");

		try {
			if (string.length() > 11) {
				throw new IllegalArgumentException();
			}
		}
		catch (IllegalArgumentException e){
			System.out.println("You entered an invalid number.");
			return null;
		}
		return string;
	}
	public static boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		int check = 0 ;
		int temp = 0;
		int x = 0;
		Boolean decide;
		int n = input;
		if (input < 10) {
			decide = true;
			return decide;
		}
		
		
		while (input != 0 ) {
			temp = input % 10;
			check = check + temp*temp*temp;
			input /= 10;
		}
		if (check == n) {
			decide = true;
		}
		else {
			decide = false;
		}
		return decide;
	}
	public static String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}
	public static String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		String result = phrase.replaceAll("\\B.|\\P{L}",  "").toUpperCase();
		
		return result;
	}

}

//class AtbashCipher {
//	
//	String ourWay = "abcdefghijklmnopqrstuvwxyz";
//	String cipherWay = "zyxwvutsrqponmlkjihgfedcba";
//	int size = 5;
//	
//	/**
//	 * Question 13
//	 * 
//	 * @param string
//	 * @return
//	 */
//	public static String encode(String string) {
//		// TODO Write an implementation for this method declaration
//		
////		String filter = "";
////		for (char letter : string.toCharArray()) {
////			if(Character.isLetterOrDigit(letter)) {
////				filter = filter + letter;
////			}
////		}
////		String tocypher = "";
////		for (char c : filter.toCharArray()) {
////			int idx = ourWay.indexOf(string);
////			
////		}
//		return null;
//	}
//
//	/**
//	 * Question 14
//	 * 
//	 * @param string
//	 * @return
//	 */
//	public static String decode(String string) {
//		// TODO Write an implementation for this method declaration
//		StringBuilder d  = new StringBuilder();
//		for (char c : string.toCharArray()) {
//			if(Character.isLetter(c)) {
//				int nc = ('Z' - c) + 'A';
//				d.append((char) nc);
//			}
//			else {
//				d.append(c);
//			}
//		}
//		return d.toString();
//	}
//	public static void main(String[] args) {
//		System.out.println(decode("vcvix rhn"));
//	}
//}
