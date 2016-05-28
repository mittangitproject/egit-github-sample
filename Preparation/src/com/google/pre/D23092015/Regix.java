package com.google.pre.D23092015;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Pattern pattern = Pattern.compile("foo");
//		Matcher matcher = pattern.matcher("foooooooooooooooooooooo");
//		System.out.println(matcher.matches());
//		System.out.println(matcher.lookingAt());
		
		
//		========================================================
		
		String regex = "cat";
		String input = "cat sound ...";
		String replacement = "dog";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		input = matcher.replaceAll(replacement);
		System.out.println(input);
		
	}

}
