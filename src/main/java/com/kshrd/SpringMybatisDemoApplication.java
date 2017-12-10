package com.kshrd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kshrd.model.User;
import com.kshrd.repository.UserRepository;

@SpringBootApplication
public class SpringMybatisDemoApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisDemoApplication.class, args);
	}
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {

		List<User> users = userRepository.findAll();
		for(User user: users){
			System.out.println(user);
		}
	}
	
}
