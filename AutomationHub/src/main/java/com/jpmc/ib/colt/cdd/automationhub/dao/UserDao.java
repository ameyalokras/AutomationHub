package com.jpmc.ib.colt.cdd.automationhub.dao;

import org.springframework.dao.DataAccessException;

import com.jpmc.ib.colt.cdd.automationhub.dto.mongo.User;


public interface UserDao {
	public User getUserByUsername(String username) throws DataAccessException;
}
