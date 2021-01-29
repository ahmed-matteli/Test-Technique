package RepeatedCharCoounter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class RepeatedCharCoounter {
	
	
	
	public Long repeatedCharCoounter(String word,String text) {

		
		List<String> text_list= Arrays.asList(text.split(" "));
		Long numberOfOccurance = text_list.stream().filter(e -> e.equals(word)).count();
		return numberOfOccurance;
		
		
	
	}

}
