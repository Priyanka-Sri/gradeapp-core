package com.revature.grading.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.grading.exception.DBException;
import com.revature.grading.model.Admindetails;
import com.revature.grading.model.SubjectWise;

public interface UserDao {

	Admindetails login(String sname, int regno) throws SQLException, DBException;

	List<SubjectWise> findBySubject() throws SQLException;


}