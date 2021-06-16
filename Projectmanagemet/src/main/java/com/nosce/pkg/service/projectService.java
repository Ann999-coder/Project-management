package com.nosce.pkg.service;

import java.util.List;

import com.nosce.pkg.model.Project;

public interface projectService {

	public void add(Project project);
	
	List<Project> list();
}
