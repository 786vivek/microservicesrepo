package com.example.demo.vvkpackage;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;

@Component
public class Usermodeldaoservice {

	
	private static List<Usermodel> users=new ArrayList<>();
	
	
	static {
		
		users.add(new Usermodel(1,"vvk","vvk.com"));
		users.add(new Usermodel(2,"vvk1","vvk1.com"));
		users.add(new Usermodel(3,"vvk2","vvk2.com"));
	}
	
	public List<Usermodel> findall(){
		
		return users;
		
	}
	public Usermodel save(Usermodel user) {
		
		 users.add(user);
		 return user;
		
	}
	
	public Usermodel findone(int id) {
		
		for(Usermodel use:users)
		{
			if(use.getId()==id) {
				return use;
			}
		}
	
	return null;
	}
	
}
