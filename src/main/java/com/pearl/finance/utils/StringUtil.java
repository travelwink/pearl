package com.pearl.finance.utils;

public class StringUtil {
	public static boolean isBlank(String str) {
		if (str == null || str.trim().length() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
