package com.nosce.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nosce.pkg.model.Register;

public interface registerRepository extends  JpaRepository<Register, Long> {

	public Register findByEmailId(String email);
	
	public Register findByEmailIdAndPassword(String email,String password);
}
