package com.nosce.pkg.service;

import java.util.List;
import java.util.Optional;

import com.nosce.pkg.model.Client;



public interface clientService {

	public void add(Client client);
	public void update(Client client,Long clientid);
	Optional<Client> getById(Long clientid);
	
	public void delete(Long clientid);
	
	
	List<Client> list();
}
