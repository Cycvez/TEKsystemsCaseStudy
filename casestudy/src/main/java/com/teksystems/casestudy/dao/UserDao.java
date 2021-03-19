package com.teksystems.casestudy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teksystems.casestudy.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	User findByUsername(String username);
	List<User> findAllByUser(User user);
}
