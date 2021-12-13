package com.java;

import java.util.StringTokenizer;

public class StringExample {
	public static void main(String[] args) {
	String s = "ravi kiran";
	String[] words = s.split("\\s");
	for(int i = 0;i<words.length;i++)
	{
		System.out.println(words[i]);
	}
	}
}
