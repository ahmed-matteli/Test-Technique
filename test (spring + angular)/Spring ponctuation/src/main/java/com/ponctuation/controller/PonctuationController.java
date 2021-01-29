package com.ponctuation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ponctuation.MyServices.PonctuationService;


@RestController
@CrossOrigin(origins = "*")
public class PonctuationController {
	
	@Autowired
	PonctuationService ponctuationService;
	
	//end point to calculate the number of ponctuation 
	@PostMapping("/calculate")
	public int calculatePonctuation(@RequestBody String text) {
		
		return ponctuationService.CalculatePonctuations(text);

	}

}
