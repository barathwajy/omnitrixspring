package com.example.omnitrix.subscribe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class Subscribedatacontrol {

	@Autowired 
	private Subscribedatarepo rep1;
	
	@GetMapping("/subdata")
	public List<Subscribedata> getdata()
	{		
		return rep1.findAll();
	}
	
}
