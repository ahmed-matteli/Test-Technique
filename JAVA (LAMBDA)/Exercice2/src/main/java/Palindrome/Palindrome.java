package Palindrome;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Palindrome {
	
	
	public boolean isPalindrome(String text) {
		//if text is void or contains space then it's not palandrome 
		if(text=="" || text==null || text.length()!=text.replaceAll("[^a-zA-Z]", "").length())
		{return false;}
		 String tempString = text.toLowerCase(); 
			return IntStream.range(0, tempString.length() / 2)
	            .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));
		
		
    
	}
	

    }

