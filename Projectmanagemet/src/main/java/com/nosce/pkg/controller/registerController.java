package com.nosce.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nosce.pkg.model.Project;
import com.nosce.pkg.model.Register;
import com.nosce.pkg.service.impl.IregisterService;

@RestController
public class registerController {
	
	@Autowired
	IregisterService regservice;
	
	@RequestMapping("/reg")
	public String hello() {

		return "hello";

	}
	
	@PostMapping(value="/register/save",produces = "application/json")
	public Register add(@RequestBody Register register) throws Exception{
		String tempEmailId=register.getEmail();
		if(tempEmailId !=null && !"".equals(tempEmailId)) {
			Register regObj=regservice.fetchUserByEmailId(tempEmailId);
			
			if(regObj!=null) {
				throw new  Exception("user with"+tempEmailId+"already exists");
			}
		}
		Register regObj=null;
		regObj=regservice.add(register);
		return regObj;
		
	}
	
	@GetMapping("/login")
	public Register loginUser(@RequestBody Register register) throws Exception {
		String tempEmailId=register.getEmail();
		String temppass=register.getPassword();
		Register regObj=null;
		if(tempEmailId !=null && temppass !=null) {
			regObj=regservice.fetchUserByEmailIdAndPassword(tempEmailId, temppass);
			
		}
		if(regObj==null) {
			throw new  Exception("bad credentials");
		}
		
		return regObj;
	}


}
