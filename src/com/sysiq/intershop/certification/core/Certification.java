package com.sysiq.intershop.certification.core;

import com.sysiq.intershop.certification.console.COUT;

public class Certification {

	private final String[] questionaryPattern = {	
			"Which of these terms does not belong to the web design context of Intershop 7?",
			"-------------------------", 
			"a. Pipelet", 
			"b. Template",
			"c. ISML", 
			"d. Presentation Logic" 
	};
	
	public void start() {
		for (String line : questionaryPattern) {
			COUT.println(line);
		}
		COUT.println("Choose answer:");
	}

}
