package com.revature.grading.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.grading.exception.DBException;
import com.revature.grading.model.Admindetails;

public interface TobDao {
	
	List<Admindetails> login() throws SQLException, DBException;;
}