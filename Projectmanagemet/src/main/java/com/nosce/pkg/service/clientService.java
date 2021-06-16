package com.nosce.pkg.service;

import java.util.List;

import com.nosce.pkg.model.Client;


public interface clientService {

	public void add(Client client);
	
	List<Client> list();
}
