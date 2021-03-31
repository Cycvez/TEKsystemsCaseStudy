package com.teksystems.casestudy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teksystems.casestudy.entity.ToDo;

public interface ToDoDao extends JpaRepository<ToDo, Integer>{

	
	
}
