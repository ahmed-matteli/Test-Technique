package RepeatedCharFinder;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class RepeatedCharFinder {

	public String repeatedCharFinder(String text) {
		List<String> text_list = Arrays.asList(text.split(""));

		String result = text_list.stream().filter(obj -> repeatedCharCoounter(obj, text) == 1).findFirst().orElse("");
	
			return result;
		

	}

	public Long repeatedCharCoounter(String word, String text) {

		List<String> text_list = Arrays.asList(text.split(""));
		Long numberOfOccurance = text_list.stream().filter(e -> e.equals(word)).count();
		return numberOfOccurance;

	}

}
