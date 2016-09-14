package com.jpmc.ib.colt.cdd.automationhub.dto.mongo;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

@Document(collection = "Users")
public class User extends org.springframework.security.core.userdetails.User
{
	private static final long serialVersionUID = 1L;
	public User(String username, String password, Collection<? extends GrantedAuthority> authorities)
	{
		super(username, password, authorities);
		
	}

	@Id
	private String id;
	private String firstName;
	private String lastName;
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}	
}
