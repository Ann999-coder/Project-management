package com.nosce.pkg.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nosce.pkg.model.Project;
import com.nosce.pkg.repository.projectRepository;
import com.nosce.pkg.service.projectService;



@Service
public class IprojectService implements projectService {

	@Autowired
	private projectRepository projectrepository;
	
	@Override
	public void add(Project project) {
		// TODO Auto-generated method stub
		projectrepository.save(project);
		
	}

	@Override
	public List<Project> list() {
		// TODO Auto-generated method stub
		return projectrepository.findAll();
	}

	@Override
	public void update(Project project, int projectid) {
		// TODO Auto-generated method stub
		projectrepository.save(project);
		
	}

	


	@Override
	public Optional<Project> getById(Long projectid) {
		// TODO Auto-generated method stub
		return  projectrepository.findById(projectid);
	}

	@Override
	public void delete(Long projectid) {
		// TODO Auto-generated method stub
		
		projectrepository.deleteById(projectid);
	}

	
	

	


	
}
