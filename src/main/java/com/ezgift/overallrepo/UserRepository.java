package com.ezgift.overallrepo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ezgift.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    @Query("select c from User c where c.email = :email")
	public User getUserByEmail(@Param("email") String email);
    public User findByEmail(String email);
}