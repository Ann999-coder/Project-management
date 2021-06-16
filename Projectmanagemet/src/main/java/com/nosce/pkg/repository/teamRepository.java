package com.nosce.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nosce.pkg.model.Team;

public interface teamRepository  extends  JpaRepository<Team, Long> {

}
