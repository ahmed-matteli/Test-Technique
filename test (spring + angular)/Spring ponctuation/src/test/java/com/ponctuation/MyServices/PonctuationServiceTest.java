package com.ponctuation.MyServices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PonctuationServiceTest {

	@Test
	void should_return_5() {
		String text = "abba.!;,?:";
		
		Assertions.assertEquals(6,new PonctuationServiceImplemantation().CalculatePonctuations(text));

	}
	@Test
	void should_return_0() {
		String text = "abba";
		
		Assertions.assertEquals(0,new PonctuationServiceImplemantation().CalculatePonctuations(text));

	}
	@Test
	void should_return_0_for_empty_string() {
		String text = "";
		
		Assertions.assertEquals(0,new PonctuationServiceImplemantation().CalculatePonctuations(text));

	}
	
}
