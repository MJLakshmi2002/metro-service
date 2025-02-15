package com.lakshmi.metro.repository;

import com.lakshmi.metro.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
