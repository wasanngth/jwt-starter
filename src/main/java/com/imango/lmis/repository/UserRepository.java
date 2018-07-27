package com.imango.lmis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imango.lmis.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
