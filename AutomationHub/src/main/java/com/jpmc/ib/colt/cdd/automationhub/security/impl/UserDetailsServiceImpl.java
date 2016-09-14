package com.jpmc.ib.colt.cdd.automationhub.security.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.jpmc.ib.colt.cdd.automationhub.dao.UserDao;

public class UserDetailsServiceImpl implements UserDetailsService
{
	@Autowired
	UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		UserDetails user = userDao.getUserByUsername(username);
		if (user != null)
		{
			return user;
		}
		else
		{
			throw new UsernameNotFoundException("Invalid Username");
		}
	}
}
