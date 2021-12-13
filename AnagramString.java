package com.java;

import java.util.Arrays;

public class AnagramString {
	
	static void isAnagram(String s1, String s2) {
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");
		boolean status = true;
		if(s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status = Arrays.equals(ch1, ch2);
		}
		
		if(status) {
			System.out.println(s1+" and "+s2+" are Anagram words.");
		}else {
			System.out.println(s1+" and "+s2+" are not Anagram words.");
		}
	}

	public static void main(String[] args) {
		isAnagram("Keep","Peek");
		isAnagram("Mother In Law","Hitler Woman");

	}
	
	
	
	
	
	
}
