package com.nosce.pkg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nosce.pkg.model.Client;
import com.nosce.pkg.repository.clientRepository;
import com.nosce.pkg.service.clientService;



@Service
public class IclientService implements clientService{

	@Autowired
	private clientRepository clientrepository;
	
	
	@Override
	public void add(Client client) {
		// TODO Auto-generated method stub
		clientrepository.save(client);
		
		
	}


}
