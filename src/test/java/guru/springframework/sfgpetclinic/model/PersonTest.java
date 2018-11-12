package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
	@Test
	void repeatedTest() {
			//TODO
	}
}
