package com.example.omnitrix.network;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class Netdatacontrol {

	@Autowired 
	private Netdatarepo rep1;
	
	@GetMapping("/netdata")
	public List<Netdata> getdata()
	{		
		return rep1.findAll();
	}
	
	
	
}
