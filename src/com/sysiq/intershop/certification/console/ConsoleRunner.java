package com.sysiq.intershop.certification.console;

import com.sysiq.intershop.certification.core.Certification;

public class ConsoleRunner {

	public static void main(String[] args) {
		Certification certification = new Certification();
		certification.start();
	}
}
