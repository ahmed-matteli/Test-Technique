package com.ponctuation.MyServices;

import org.springframework.stereotype.Service;

@Service
public class PonctuationServiceImplemantation implements PonctuationService {
	// function to calculate the number of ponctuations in text
	public int CalculatePonctuations(String text) {
		int countPonct = 0;
		for (int i = 0; i < text.length(); i++) {
			// Checks whether given character is punctuation mark
			if (text.charAt(i) == '.' || text.charAt(i) == ',' || text.charAt(i) == ';' || text.charAt(i) == ':'
					|| text.charAt(i) == '?' || text.charAt(i) == '!') {
				countPonct++;
			}
		}
		return countPonct;
	}

}
