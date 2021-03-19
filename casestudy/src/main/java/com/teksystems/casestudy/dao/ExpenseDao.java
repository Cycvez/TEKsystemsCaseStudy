package com.teksystems.casestudy.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.teksystems.casestudy.entity.User;


@Repository
public interface ExpenseDao extends JpaRepository <ExpenseDao, Integer>{
	List<ExpenseDao> findAllByUser(User user);
}
