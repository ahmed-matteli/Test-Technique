package List_Concatenator;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List_Concatenator {
	public  List<String> concat(List<String> l1, List<Integer> l2) {
		
	//convert l2 to List<string> then concat the two lists
	List<String> result = Stream.concat(l1.stream(), l2.stream().map(String::valueOf)).collect(Collectors.toList());
		
		
	return result;
	}
	
    public static void main(String args[]) {
    	List<String> l1 = Arrays.asList("sk","s","lok");
    	List<Integer> l2 = Arrays.asList(1,5,7);
    	
    	System.out.println(new List_Concatenator().concat(l1, l2));

    }
}
