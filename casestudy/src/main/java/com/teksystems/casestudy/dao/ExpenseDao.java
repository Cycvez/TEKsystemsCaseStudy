package com.teksystems.casestudy.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teksystems.casestudy.entity.Expense;



@Repository
public interface ExpenseDao extends JpaRepository <Expense, Integer>{

}
