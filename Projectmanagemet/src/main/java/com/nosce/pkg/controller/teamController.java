package com.nosce.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nosce.pkg.model.Team;
import com.nosce.pkg.service.impl.IteamService;

@RestController
public class teamController {
	
	@Autowired
	IteamService iteamservice;
	
	@RequestMapping("/team")
	public String trial() {

		return "hello";

	}
	
	@PostMapping("/team/save")
	public ResponseEntity<HttpStatus> add(@RequestBody Team team){
		
		iteamservice.add(team);
		return ResponseEntity.ok(HttpStatus.OK);
		
	}
	
	@GetMapping("team/all")
	public List<Team> getAll(){
		
		return iteamservice.list();
		
	}


}
