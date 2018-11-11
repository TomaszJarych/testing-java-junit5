package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IndexControllerTest {

	IndexController indexController;

	@BeforeEach
	void setUp() throws Exception {
		indexController = new IndexController();
	}

	@DisplayName(value = "Test proper view name is returned")
	@Test
	void testIndex() {
		assertEquals("index", indexController.index(), "index() method failed");
	}

	@DisplayName(value = "Test exception")
	@Test
	void testOupsHandler() {
		assertThrows(ValueNotFoundException.class, () -> {
			indexController.oupsHandler();
		});
		// assertEquals("notimplemented", indexController.oupsHandler(), "
		// oupsHandler() failded");
		// assertTrue("notimplemented".equals(indexController.oupsHandler()), ()
		// -> "This is some expensive "
		// + "Messeage to build " + "for my tets. Make if you only really,
		// really have to");
		// lambda in JUnit 5
	}

	@Disabled("Demo of timeout test")
	@Test
	void testTimeOut() {
		assertTimeout(Duration.ofMillis(100), () -> Thread.sleep(3000));
		
		//single thread - execution and assertion, one after one
	}
	
	@Disabled("Demo of timeout test")
	@Test
	void testTimeOutPreempt() {
		assertTimeoutPreemptively(Duration.ofMillis(100), () -> Thread.sleep(3000));
		
		//separate threads - test and assertion
	}

}
