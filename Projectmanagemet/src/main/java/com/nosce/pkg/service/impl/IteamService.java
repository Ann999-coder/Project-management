package com.nosce.pkg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nosce.pkg.model.Team;
import com.nosce.pkg.repository.teamRepository;
import com.nosce.pkg.service.teamService;


@Service
public class IteamService implements teamService {

	@Autowired
	private teamRepository teamrepository;
	
	@Override
	public void add(Team team) {
		// TODO Auto-generated method stub
		teamrepository.save(team);
		
		
	}

}
