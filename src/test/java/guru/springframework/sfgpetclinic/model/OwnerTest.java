package guru.springframework.sfgpetclinic.model;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.ParameterizedTest.DEFAULT_DISPLAY_NAME;
import static org.junit.jupiter.params.ParameterizedTest.DISPLAY_NAME_PLACEHOLDER;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

@Tag("model")
class OwnerTest {

	@Test
	void dependetnAssertions() {
		Owner owner = new Owner(1L, "John", "Doe");
		owner.setCity("Dallas");
		owner.setTelephone("123456789");

		assertAll("Properties test",
				() -> assertAll("Person properties",
						() -> assertEquals("John", owner.getFirstName(),
								"Invalid firstName"),
						() -> assertEquals("Doe", owner.getLastName(),
								"Invalid lastName")),
				() -> assertAll("Owner properties",
						() -> assertEquals("Dallas", owner.getCity(),
								"Invalid City"),
						() -> assertEquals("123456789", owner.getTelephone(),
								"Invalid phone number")

				));
		// run all test despite result is wrong or right
	}

	@Test
	void dependentAssertionsWithoutLambdas() {
		// given
		Owner owner = new Owner(1L, "John", "Doe");
		owner.setCity("Dallas");
		owner.setTelephone("123456789");

		// then
		assertEquals("John", owner.getFirstName(), "Invalid firstName");
		assertEquals("Doe", owner.getLastName(), "Invalid lastName");
		assertEquals("Dallas", owner.getCity(), "Invalid City");
		assertEquals("123456789", owner.getTelephone(), "Invalid phone number");

		// ends after first fail;
		/*
		 * hamcrest example
		 */
		assertThat(owner.getCity(), is("Dallas"));
	}

	@DisplayName("Value source Test -")
	@ParameterizedTest(name = DISPLAY_NAME_PLACEHOLDER + " "
			+ DEFAULT_DISPLAY_NAME)
	@ValueSource(strings = {"Spring", "Framework", "Guru"})
	void parameterizedTest(String val) {
		System.out.println(val);
	}

	@DisplayName("Enum source Test -")
	@ParameterizedTest(name = DISPLAY_NAME_PLACEHOLDER + " "
			+ DEFAULT_DISPLAY_NAME)
	@EnumSource(OwnerType.class)
	void enumTest(OwnerType ownerType) {
		System.out.println(ownerType);
	}

	@DisplayName("CSV source Test -")
	@ParameterizedTest(name = DISPLAY_NAME_PLACEHOLDER + " "
			+ DEFAULT_DISPLAY_NAME)
	@CsvSource({"FL,1,1", "OH,2,2", "MI,3,3"})
	void csvInputTest(String stateName, int val1, int val2) {
		System.out.println(stateName + " val= " + val1 + " | " + val2);
	}

	@DisplayName("CSV File source Test -")
	@ParameterizedTest(name = DISPLAY_NAME_PLACEHOLDER + " "
			+ DEFAULT_DISPLAY_NAME)
	@CsvFileSource(resources="/CSV/csvInput.csv", numLinesToSkip=1)
	void csvFileInputTest(String stateName, int val1, int val2) {
		System.out.println(stateName + " val= " + val1 + " | " + val2);
	}
}
