package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void groupedAssertions() {
		// given
		Person person = new Person(1L, "John", "Doe");
		// then
		assertAll("Test set, next will be lambdas",
				() -> assertEquals("John", person.getFirstName(), "Wrong firstName"),
				() -> assertEquals("Doe", person.getLastName(), "Wrong lastName"));

	}

}
