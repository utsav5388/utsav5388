package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Repo.UserRepo;
import com.example.demo.entity.User;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(BootJpaExampleApplication.class, args);
	
		UserRepo userrepo=context.getBean(UserRepo.class);
		
//		User user=new User();
//		user.setUserName("Utsav");
//		user.setCity("Delhi");
//		user.setStatus("I am java programer");
//		
//		User user2= userrepo.save(user);
//		System.out.println(user2);
		
		User user=new User();
		user.setUserName("Utsav");
		user.setCity("Delhi");
		user.setStatus("I am java programer");
		
		User user2=new User();
		user2.setUserName("Minhaz");
		user2.setCity("Kolkata");
		user2.setStatus("I am Python programer");
		
		User useresult=userrepo.save(user2);
		System.out.println("saved user"+useresult);
		System.out.println("done");
	}

}
