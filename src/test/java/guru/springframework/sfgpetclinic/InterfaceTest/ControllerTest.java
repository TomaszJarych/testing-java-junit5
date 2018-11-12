package guru.springframework.sfgpetclinic.InterfaceTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@Tag("controller")
public interface ControllerTest {
	// different way to tag test classes, without annotation
	// instead using the tagged Interface
	// Need to configure run as in IDE
	// new feature in JUnit 5!
	
	@BeforeAll
	default void beforeAll() {
		System.out.println("Lets do something here! -----------------");
		// @TestInstance(Lifecycle.PER_CLASS) needed to work
	}
	
}
