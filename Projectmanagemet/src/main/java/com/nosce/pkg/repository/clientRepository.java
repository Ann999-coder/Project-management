package com.nosce.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nosce.pkg.model.Client;


public interface clientRepository extends  JpaRepository<Client, Long> {

}
