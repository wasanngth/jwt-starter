package com.imango.lmis.service;

import java.util.List;

import com.imango.lmis.model.User;

public interface UserService {
	User findById(Long id);

	User findByUsername(String username);

	List<User> findAll();
}
