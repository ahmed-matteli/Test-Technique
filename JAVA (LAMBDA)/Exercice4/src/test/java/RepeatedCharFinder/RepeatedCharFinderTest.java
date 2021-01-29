package RepeatedCharFinder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RepeatedCharFinderTest {

	@Test
	void should_return_e_first_character_whithout_occurance() {
		String text = "strrress";

		Assertions.assertEquals("t", new RepeatedCharFinder().repeatedCharFinder(text));

	}

	

	@Test
	void should_return_empty_when_all_characters_are_duplicated() {
		String text = "stttrreess";

		Assertions.assertEquals("", new RepeatedCharFinder().repeatedCharFinder(text));

	}
	
	@Test
	void should_return_empty_when_the_string_is_empty() {
		String text = "";

		Assertions.assertEquals("", new RepeatedCharFinder().repeatedCharFinder(text));

	}
	
}
