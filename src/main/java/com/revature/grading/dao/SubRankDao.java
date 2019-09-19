package com.revature.grading.dao;

import java.sql.SQLException;

import com.revature.grading.exception.DBException;
import com.revature.grading.model.Admindetails;

public interface SubRankDao {

	Admindetails login(String sname, int regno) throws SQLException, DBException;

}