package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import guru.springframework.sfgpetclinic.InterfaceTest.RepeatedTestInformation;

public class PersonRepeatedTest implements RepeatedTestInformation{
	
	@RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} of {totalRepetitions}")
	@DisplayName("My Repeated Test")
	void repeatedTest() {
		// TODO
	}

	@RepeatedTest(value = 10, name = LONG_DISPLAY_NAME)
	@DisplayName("Repeated test with DI")
	void repeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo,
			TestReporter testReporter) {
		System.out.println(testInfo.getDisplayName() + " : "
				+ repetitionInfo.getCurrentRepetition());
	}
	@RepeatedTest(value = 10, name = LONG_DISPLAY_NAME)
	@DisplayName("Repeated test with DI - Assigment")
	void repeatedTestWithDIAssigment(TestInfo testInfo,
			RepetitionInfo repetitionInfo, TestReporter testReporter) {
	}

}
