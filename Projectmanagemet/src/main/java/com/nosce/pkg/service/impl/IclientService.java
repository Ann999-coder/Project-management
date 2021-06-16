package com.nosce.pkg.service.impl;

import java.util.List;

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


	@Override
	public List<Client> list() {
		// TODO Auto-generated method stub
		return clientrepository.findAll();
	}


}
