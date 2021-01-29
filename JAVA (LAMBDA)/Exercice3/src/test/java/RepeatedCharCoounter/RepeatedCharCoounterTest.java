package RepeatedCharCoounter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RepeatedCharCoounterTest {

	@Test
	void should_return_2() {
		String text = "ab b ab";
		
		Assertions.assertEquals(2,new RepeatedCharCoounter().repeatedCharCoounter("ab", text));

	}
	@Test
	void should_return_0() {
		String text = "abd bv abd";
		
		Assertions.assertEquals(0,new RepeatedCharCoounter().repeatedCharCoounter("cd", text));

	}
}
