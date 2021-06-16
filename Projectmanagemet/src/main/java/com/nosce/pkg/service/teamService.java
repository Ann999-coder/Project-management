package com.nosce.pkg.service;

import java.util.List;

import com.nosce.pkg.model.Team;

public interface teamService {

	public void add(Team team);
	
	List<Team> list();
}
