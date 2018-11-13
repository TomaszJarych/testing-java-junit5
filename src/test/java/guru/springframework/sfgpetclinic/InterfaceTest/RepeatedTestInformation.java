package guru.springframework.sfgpetclinic.InterfaceTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("repeatedTestInfo")
public interface RepeatedTestInformation {
	
	@BeforeEach
	default void BeforeEachMethod(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println(testInfo.getDisplayName()+" " +repetitionInfo.getCurrentRepetition() );
	}

}
