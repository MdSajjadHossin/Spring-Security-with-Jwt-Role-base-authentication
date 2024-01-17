package com.springboot.Repository;

import com.springboot.entity.Role;
import com.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    User findByRole(Role email);
}
