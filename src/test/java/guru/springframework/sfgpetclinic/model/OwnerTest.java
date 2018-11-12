package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

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
	
	

}
