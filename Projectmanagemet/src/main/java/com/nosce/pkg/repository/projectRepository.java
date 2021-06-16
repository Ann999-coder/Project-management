package com.nosce.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nosce.pkg.model.Project;


public interface projectRepository extends  JpaRepository<Project, Long>   {

}
