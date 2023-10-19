package com.example.omnitrix.serviceutil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Serviceutilcontrol {

	@Autowired
	private Serviceutilrepo servutilrepo;
	
	@GetMapping("/servutildata")
	public List<Serviceutildata> getdata()
	{		
		return servutilrepo.findAll();
	}
}

