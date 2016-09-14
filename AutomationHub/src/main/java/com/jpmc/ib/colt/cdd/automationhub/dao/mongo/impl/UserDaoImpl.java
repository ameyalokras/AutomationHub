package com.jpmc.ib.colt.cdd.automationhub.dao.mongo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.jpmc.ib.colt.cdd.automationhub.dao.UserDao;
import com.jpmc.ib.colt.cdd.automationhub.dto.mongo.User;

public class UserDaoImpl implements UserDao{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public User getUserByUsername(String username) throws DataAccessException
	{
		Query findUserByUsername = new Query(Criteria.where("username").is(username));
		
		User user = mongoTemplate.findOne(findUserByUsername, User.class);
		return user;
	}

	
}
