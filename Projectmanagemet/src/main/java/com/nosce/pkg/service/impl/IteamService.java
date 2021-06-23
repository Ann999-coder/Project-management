package com.nosce.pkg.service.impl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Team> list() {
		// TODO Auto-generated method stub
		return teamrepository.findAll();
	}

	@Override
	public void update(Team team, int teamid) {
		// TODO Auto-generated method stub
		teamrepository.save(team);
		
	}

	@Override
	public Optional<Team> getById(Long teamid) {
		// TODO Auto-generated method stub
		return teamrepository.findById(teamid);
	}

	@Override
	public void delete(Long teamid) {
		// TODO Auto-generated method stub
		teamrepository.deleteById(teamid);
		
	}

}
