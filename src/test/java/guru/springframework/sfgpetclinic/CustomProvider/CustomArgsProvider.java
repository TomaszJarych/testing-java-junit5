package guru.springframework.sfgpetclinic.CustomProvider;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class CustomArgsProvider implements ArgumentsProvider{

	@Override
	public Stream<? extends Arguments> provideArguments(
			ExtensionContext context) throws Exception {
		return Stream.of(Arguments.of("FL", 1231, 1231),
				Arguments.of("OH", 2342, 2342), Arguments.of("MI", 3453, 3453));
	}

	
}
