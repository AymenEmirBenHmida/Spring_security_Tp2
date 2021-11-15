package com.Security.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.Security.users.entities.Role;
import com.Security.users.entities.User;
import com.Security.users.service.UserService;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@SpringBootApplication
public class UsersMicroserviceApplication {
	
	@Autowired
	UserService userService;
	
	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}
	
/*@PostConstruct
	void init_users() {
		// Creating roles
		userService.addRole(new Role(null, "ADMIN"));
		userService.addRole(new Role(null, "USER"));
		
		// Creating users
		userService.saveUser(new User(null, "admin", "123", true, null));
		userService.saveUser(new User(null, "aymen", "123", true, null));
		userService.saveUser(new User(null, "xxxx", "123", true, null));
		
		// Adding roles to users
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		userService.addRoleToUser("aymen", "USER");
	}*/
}