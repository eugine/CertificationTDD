package com.sysiq.intershop.certification.console;

public class CIN {

	private static String lastInputLine  = null;
	
	public static void mimicUserInput(String string) {
		lastInputLine  = string;
	}

	public static String getLastInputLine() {
		return lastInputLine;
	}

}
