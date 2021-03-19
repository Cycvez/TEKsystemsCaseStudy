package com.teksystems.casestudy.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teksystems.casestudy.entity.Posts;
import com.teksystems.casestudy.entity.User;

@Repository
public interface PostsDao extends JpaRepository<Posts, Integer>{
	 List<Posts> findAllByUser(User user);
	 List<Posts> findByDate(Date createdDate);
}
