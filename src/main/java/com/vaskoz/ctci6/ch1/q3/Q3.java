package com.vaskoz.ctci6.ch1.q3;


public class Q3 {
	public static void urlify(char[] url, int trueLength) {
		var last = url.length - 1;
		trueLength--;
		while (trueLength >= 0) {
			if (url[trueLength] == ' ') {
				url[last--] = '0';
				url[last--] = '2';
				url[last--] = '%';
			} else {
				url[last--] = url[trueLength];
			}
			trueLength--;
		}
	}
}
