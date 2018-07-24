package com.vaskoz.ctci6.ch1.q6;

public class Q6 {
	public static String compress(String input) {
		if (input == null || input.length() == 0) {
			return "";
		}
		var sb = new StringBuilder(input.length());
		var lastChar = input.charAt(0);
		var count = 1;
		for (var i = 1; i < input.length(); i++) {
			if (lastChar == input.charAt(i)) {
				count++;
			} else {
				sb.append(lastChar).append(count);
				lastChar = input.charAt(i);
				count = 1;
			}
		}
		sb.append(lastChar).append(count);
		return sb.length() >= input.length() ? input : sb.toString();
	}
}
