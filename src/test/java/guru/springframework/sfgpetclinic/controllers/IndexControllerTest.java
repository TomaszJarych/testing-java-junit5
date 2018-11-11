package guru.springframework.sfgpetclinic.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IndexControllerTest {

	IndexController indexController;

	@BeforeEach
	void setUp() throws Exception {
		indexController = new IndexController();
	}

	@DisplayName(value="Test proper view name is returned")
	@Test
	void testIndex() {
		assertEquals("index", indexController.index(), "index() method failed");
	}

	@DisplayName(value="Test exception")
	@Test
	void testOupsHandler() {
		assertEquals("notimplemented", indexController.oupsHandler(), " oupsHandler() failded");
		assertTrue("notimplemented".equals(indexController.oupsHandler()), () -> "This is some expensive "
				+ "Messeage to build " + "for my tets. Make if you only really, really  have to");
		// lambda in JUnit 5
	}

}
