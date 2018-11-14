package guru.springframework.sfgpetclinic.model;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.ParameterizedTest.DEFAULT_DISPLAY_NAME;
import static org.junit.jupiter.params.ParameterizedTest.DISPLAY_NAME_PLACEHOLDER;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
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
						() -> assertEquals("John", owner.getFirstName(), "Invalid firstName"),
						() -> assertEquals("Doe", owner.getLastName(), "Invalid lastName")),
				() -> assertAll("Owner properties", 
						() -> assertEquals("Dallas", owner.getCity(), "Invalid City"),
						() -> assertEquals("123456789", owner.getTelephone(), "Invalid phone number")

				));
		// run all test despite result is wrong or right
	}
	
	@Test
	void dependentAssertionsWithoutLambdas() {
		//given
		Owner owner = new Owner(1L, "John", "Doe");
		owner.setCity("Dallas");
		owner.setTelephone("123456789");
		
		//then
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
	@ParameterizedTest(name=DISPLAY_NAME_PLACEHOLDER+" "+DEFAULT_DISPLAY_NAME)
	@ValueSource(strings= {"Spring","Framework","Guru"})
	void parameterizedTest(String val){
		System.out.println(val);
	}
	
	
	
	

}
