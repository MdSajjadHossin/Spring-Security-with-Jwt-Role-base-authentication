package com.springboot;

import com.springboot.Repository.UserRepo;
import com.springboot.entity.Role;
import com.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringsecuritywithjwtApplication implements CommandLineRunner {
	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritywithjwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User adminAccount = userRepo.findByRole(Role.ADMIN);
		if (null == adminAccount){
			User user = new User();

			user.setEmail("admin@gmail.com");
			user.setFirstName("admin");
			user.setLastName("admin");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));

			userRepo.save(user);
		}
	}
}
