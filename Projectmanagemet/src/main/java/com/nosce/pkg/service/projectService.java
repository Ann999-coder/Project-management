package com.nosce.pkg.service;

import java.util.List;
import java.util.Optional;

import com.nosce.pkg.model.Project;


public interface projectService {

	public void add(Project project);
	public void update(Project project,Long projectid);
	Optional<Project> getById(Long projectid);
	
	public void delete(Long projectid);
	 
	
	List<Project> list();
}
