package com.nosce.pkg.service;


import com.nosce.pkg.model.Register;

public interface registerService {

	public Register add(Register register);
	public Register fetchUserByEmailId(String email);
	public Register fetchUserByEmailIdAndPassword(String email,String password);
}
