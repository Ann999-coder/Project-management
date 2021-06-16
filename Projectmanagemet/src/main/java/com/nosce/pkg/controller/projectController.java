package com.nosce.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nosce.pkg.model.Project;
import com.nosce.pkg.service.impl.IprojectService;


@RestController
public class projectController {
	
	@Autowired
	IprojectService projectservice;

	@RequestMapping("/project")
	public String hello() {

		return "hello";

	}
	
	@PostMapping("/project/save")
	public ResponseEntity<HttpStatus> add(@RequestBody Project project){
		
		projectservice.add(project);
		return ResponseEntity.ok(HttpStatus.OK);
		
	}
	
	@GetMapping("project/all")
	public List<Project> getAll(){
		
		return projectservice.list();
		
	}

}
