package com.teksystems.casestudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.teksystems.casestudy.dao.ExpenseDao;
import com.teksystems.casestudy.dao.IncomeDao;
import com.teksystems.casestudy.dao.PostsDao;
import com.teksystems.casestudy.dao.ToDoDao;
import com.teksystems.casestudy.dao.UserDao;

@Controller
public class HomeController {

    @Autowired
    UserDao userDao;
	
	@Autowired
	ExpenseDao expenseDao;
	
    @Autowired
    IncomeDao incomeDao;
    
	@Autowired
	PostsDao postsDao;
	
	@Autowired
	ToDoDao toDoDao; 
	
}
