package com.ty.food.controller;

import com.ty.food.dto.User;

import com.ty.food.services.UserService;

public class TestSaveUser {
	public static void main(String[] args) {
		UserService userService=new UserService();
		
		User user=new User();
		user.setName("deepak");
		user.setEmail("deepak@mail.com");
		user.setPassword("deepak808");
		user.setPhone("9956487998");
		
		User u=userService.saveUser(user);
		if(u!=null) {
			System.out.println("Inserted");
			System.out.println(u.getId());
			System.out.println(u.getName());
			System.out.println(u.getEmail());
			System.out.println(u.getPhone());
			System.out.println(u.getPassword());
		}else {
			System.out.println("Not Inserted");
		}
	}
}

