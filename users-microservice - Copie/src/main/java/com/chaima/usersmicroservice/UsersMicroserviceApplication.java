package com.chaima.usersmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.chaima.usersmicroservice.entities.Role;
import com.chaima.usersmicroservice.entities.User;
import com.chaima.usersmicroservice.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UsersMicroserviceApplication {

    @Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}
	
   /*@PostConstruct
	void init_users() {
		//ajouter les rôles
		userService.addRole(new Role(null,"ADMIN"));
		userService.addRole(new Role(null,"USER"));
		
		//ajouter les users
		userService.saveUser(new User(null,"admin","admin",true,null));
		userService.saveUser(new User(null,"chaima","chaima",true,null));
		userService.saveUser(new User(null,"ahmed","ahmed",true,null));
		
		//ajouter les rôles aux users
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		
		userService.addRoleToUser("chaima", "USER");
		userService.addRoleToUser("ahmed", "USER");		
	}  
    */
    @Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}



}