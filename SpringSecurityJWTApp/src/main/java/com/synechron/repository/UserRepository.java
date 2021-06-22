package com.synechron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synechron.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
