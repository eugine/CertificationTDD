package com.sysiq.intershop.certification.tests.feature;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.sysiq.intershop.certification.console.COUT;
import com.sysiq.intershop.certification.core.Certification;

public class CertificationShouldPromtQuestionary {

	@Test
	public void test() {
		givenWeStartCertification();
		thenWeShallSeeQuestionary();
		andCertificationAsksForSelectingAnAnswer();
	}

	Certification c = new Certification();

	private void givenWeStartCertification() {
		c.start();
	}

	private void thenWeShallSeeQuestionary() {
		String[] questionaryPattern = {
					"Which of these terms does not belong to the web design context of Intershop 7?",
					"-------------------------", 
					"a. Pipelet", 
					"b. Template",
					"c. ISML", 
					"d. Presentation Logic" 
				};

		StringBuilder expectedQuestionary = new StringBuilder();
		for (String line : questionaryPattern)
			expectedQuestionary.append(line+"\n");
		
		String visibleQuestionary = COUT.getLastLines(7);
		assertThat(visibleQuestionary, containsString(expectedQuestionary.toString()));
	}

	private void andCertificationAsksForSelectingAnAnswer() {
		assertEquals("Choose answer:", COUT.getLastLine());
	}


}
