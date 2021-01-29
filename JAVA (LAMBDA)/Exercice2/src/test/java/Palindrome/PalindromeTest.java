package Palindrome;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PalindromeTest {

	@Test
	void should_return_true() {
		String text = "abba";
		
		Assertions.assertEquals(true,new Palindrome().isPalindrome(text));

	}
	@Test
	void should_return_false() {
		String text = "abaa";
		
		Assertions.assertEquals(false,new Palindrome().isPalindrome(text));

	}
	@Test
	void should_return_True_with_different_letter_Case() {
		String text = "AbBa";
		
		Assertions.assertEquals(true,new Palindrome().isPalindrome(text));

	}
	@Test
	void should_return_False_with_empty_string() {
		String text = "";
		
		Assertions.assertEquals(false,new Palindrome().isPalindrome(text));

	}
	@Test
	void should_return_false_if_contains_nonAlphapetical_characters() {
		String text = "ab.a";
		
		Assertions.assertEquals(false,new Palindrome().isPalindrome(text));

	}
	@Test
	void should_return_false_if_the_word_is_null() {
		String text = null;
		
		Assertions.assertEquals(false,new Palindrome().isPalindrome(text));

	}
}
