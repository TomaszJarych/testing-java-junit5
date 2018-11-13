package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("model")
class PersonTest {

	@Test
	@Tag("grupedAssertions")
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
}
