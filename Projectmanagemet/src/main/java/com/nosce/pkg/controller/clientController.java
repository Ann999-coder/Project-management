package com.nosce.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nosce.pkg.model.Client;
import com.nosce.pkg.service.impl.IclientService;

@RestController
public class clientController {
	
	@Autowired
	IclientService clientservice;

	@RequestMapping("/client")
	public String test() {

		return "hello";

	}
	
	@PostMapping("/client/save")
	public ResponseEntity<HttpStatus> add(@RequestBody Client client){
		
		clientservice.add(client);
		return ResponseEntity.ok(HttpStatus.OK);
		
	}
	
	@GetMapping("client/all")
	public List<Client> getAll(){
		
		return clientservice.list();
		
	}
	



}
