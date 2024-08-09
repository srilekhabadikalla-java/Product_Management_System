package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.rest.model.Product;
import com.rest.service.ProServiceImp;

@RestController
public class ProController {
	@Autowired
	private ProServiceImp s;
	
	@PostMapping("/save")
	public String saveAll(@RequestBody Product pro) {
		Product pm=s.savePro(pro);
		String m=null;
		if (pm!=null) {
			m="data inserted";
		}
		else {
			m="data not inserted";
		}
		return m;
	}
	
	@GetMapping("/get/{eid}")
	public Product getOnerecord(@PathVariable int eid) {
		Product e=s.getOne(eid);
		return e;
	}

}
