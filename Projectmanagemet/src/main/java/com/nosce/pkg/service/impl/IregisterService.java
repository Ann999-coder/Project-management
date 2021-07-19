package com.nosce.pkg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nosce.pkg.model.Register;
import com.nosce.pkg.repository.registerRepository;
import com.nosce.pkg.service.registerService;

@Service
public class IregisterService implements registerService {

	@Autowired
	private registerRepository regrepository;
	
	
	@Override
	public Register add(Register register) {
		// TODO Auto-generated method stub
		
		return regrepository.save(register);
	}


	@Override
	public Register fetchUserByEmailId(String email) {
		// TODO Auto-generated method stub
		return regrepository.findByEmailId(email);
	}


	@Override
	public Register fetchUserByEmailIdAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return regrepository.findByEmailIdAndPassword(email, password);
	}

}
