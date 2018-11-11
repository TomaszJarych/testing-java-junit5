package guru.springframework.sfgpetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;

@Disabled(value="Disabled unitl objects will be mocked")
class OwnerSDJpaServiceTest {
	OwnerSDJpaService service;

	@BeforeEach
	void setUp() throws Exception {
		service = new OwnerSDJpaService(null, null, null);
	}


	@Disabled
	@Test
	void testFindByLastName() {
		Owner foundOwner = service.findByLastName("Doe");
	}

	@Test
	void testFindAllByLastNameLike() {
	}

	@Test
	void testFindAll() {
	}

	@Test
	void testFindById() {
	}

	@Test
	void testSave() {
	}

	@Test
	void testDelete() {
	}

	@Test
	void testDeleteById() {
	}

}
