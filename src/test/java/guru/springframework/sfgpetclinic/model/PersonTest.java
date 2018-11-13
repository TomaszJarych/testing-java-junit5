package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

@Tag("model")
class PersonTest {

	@Test
	void groupedAssertions() {
		// given
		Person person = new Person(1L, "John", "Doe");
		// then
		assertAll("Test set, next will be lambdas",
				() -> assertEquals("John", person.getFirstName(),
						"Wrong firstName"),
				() -> assertEquals("Doe", person.getLastName(),
						"Wrong lastName"));
	}

	
	@RepeatedTest(value=10, name="{displayName} : {currentRepetition} of {totalRepetitions}")
	@DisplayName("My Repeated Test")
	void repeatedTest() {
			//TODO
	}
	
	@RepeatedTest(value=10, name=LONG_DISPLAY_NAME)
	@DisplayName("Repeated test with DI")
	void repeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo, TestReporter testReporter) {
		System.out.println(testInfo.getDisplayName()+" : "+repetitionInfo.getCurrentRepetition());
		
	}
}
