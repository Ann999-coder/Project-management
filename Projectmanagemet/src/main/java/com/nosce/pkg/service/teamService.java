package com.nosce.pkg.service;

import java.util.List;
import java.util.Optional;


import com.nosce.pkg.model.Team;

public interface teamService {

	public void add(Team team);
	public void update(Team team,int teamid);
	Optional<Team> getById(Long teamid);
	
	public void delete(Long teamid);
	
	List<Team> list();
}
