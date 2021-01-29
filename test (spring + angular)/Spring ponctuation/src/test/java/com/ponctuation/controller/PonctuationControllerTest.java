package com.ponctuation.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ponctuation.MyServices.PonctuationService;
import static org.mockito.Mockito.when;





import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@ExtendWith(SpringExtension.class)
@WebMvcTest
class PonctuationControllerTest {

	
	@Autowired
    MockMvc mockMvc;

    @MockBean
    private PonctuationService ponctuationService;
    
    //test for the endpoint post that give a text and return the number of ponctuation
	@Test
    void get_number_of_ponctuations() throws Exception {
        
        when(ponctuationService.CalculatePonctuations("abc! trl,;")).thenReturn(3);

        mockMvc.perform(MockMvcRequestBuilders.post("/calculate")
                .contentType(MediaType.APPLICATION_JSON).content("abc! trl,;")
        ).andExpect(status().isOk());
    }

}
