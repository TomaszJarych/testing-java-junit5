package guru.springframework.sfgpetclinic.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@Tag("controller")
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
		
		//AssertJ assertions 
		assertThat(indexController.index()).isEqualTo("index");
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

		// single thread - execution and assertion, one after one
	}

	@Disabled("Demo of timeout test")
	@Test
	void testTimeOutPreempt() {
		assertTimeoutPreemptively(Duration.ofMillis(100),
				() -> Thread.sleep(3000));

		// separate threads - test and assertion
	}

	@Test
	void testAssumptionTrue() {
		assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
		// assumption - test under specific condition, otherwise skipped
	}
	@Test
	void testAssumptionTrueAssumptionIsTrue() {
		assumeTrue("GURU".equalsIgnoreCase("GURU"));
	}

	@EnabledOnOs(OS.LINUX)
	@Test
	void testMeOnLinux() {
	}

	@EnabledOnOs(OS.WINDOWS)
	@Test
	void testMeOnWindows() {
	}
	@EnabledOnJre(JRE.JAVA_8)
	@Test
	void testMeOnJava8() {
	}

	@EnabledOnJre(JRE.JAVA_11)
	@Test
	void testMeOnJava11() {
	}

	@EnabledIfEnvironmentVariable(named = "USER", matches = "tj")
	@Test
	void testIfUserIsTJ() {
	}
	@EnabledIfEnvironmentVariable(named = "USER", matches = "Fred")
	@Test
	void testIfUserIsFred() {
	}
}
