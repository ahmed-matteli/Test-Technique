package List_Concatenator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class List_ConcatenatorTest {

	@Test
	void should_return_empty_list() {
		List<String> l1 = Arrays.asList();
		List<Integer> l2 = Arrays.asList();
		Assertions.assertEquals(new ArrayList(), new List_Concatenator().concat(l1, l2));
	}

	@Test
	void should_return_second_list() {
		List<String> l1 = Arrays.asList();
		List<Integer> l2 = Arrays.asList(5, 6, 8, 4);
		Assertions.assertEquals(Arrays.asList("5", "6", "8", "4"), new List_Concatenator().concat(l1, l2));
	}

	@Test
	void should_return_first_list() {
		List<String> l1 = Arrays.asList("hi", "hello", "ok", "bye");
		List<Integer> l2 = Arrays.asList();
		Assertions.assertEquals(l1, new List_Concatenator().concat(l1, l2));
	}

	@Test
	void should_return_the_concatination_of_two_lists() {
		List<String> l1 = Arrays.asList("hi", "hello", "ok", "bye");
		List<Integer> l2 = Arrays.asList(5, 6, 8, 4);
		Assertions.assertEquals(Arrays.asList("hi", "hello", "ok", "bye", "5", "6", "8", "4"),
				new List_Concatenator().concat(l1, l2));
	}
}
