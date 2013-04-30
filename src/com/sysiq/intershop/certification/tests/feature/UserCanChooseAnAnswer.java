package com.sysiq.intershop.certification.tests.feature;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sysiq.intershop.certification.console.CIN;
import com.sysiq.intershop.certification.console.COUT;
import com.sysiq.intershop.certification.core.Certification;

public class UserCanChooseAnAnswer {

	@Test
	public void test() {
		givenCertificationWasStarted();
		andUserSeeInvitationLine();
		whenUserEnterAnswerA();
		thenUserShouldSeeCorrectAnswer();
	}
	Certification certification = new Certification();

	private void givenCertificationWasStarted() {
		certification.start();
		
	}
	private void andUserSeeInvitationLine() {
		assertEquals("Choose answer:", COUT.getLastLine());
	}

	private void whenUserEnterAnswerA() {
		CIN.mimicUserInput("a");
	}

	private void thenUserShouldSeeCorrectAnswer() {
		assertEquals("It is correct answer", COUT.getLastLine());
	}
	
}
