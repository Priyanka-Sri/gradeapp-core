package com.revature.grading.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.grading.exception.DBException;
import com.revature.grading.model.Admindetails;

public interface GradeDao {

	List<Admindetails> login(String grade2) throws SQLException, DBException;

}