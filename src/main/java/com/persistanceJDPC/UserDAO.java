package com.persistanceJDPC;

import java.sql.*;
import java.util.ArrayList;

import com.domain.User;

public interface UserDAO {
	
	public void createUser(User user);
	
	public ArrayList<User> getAllUser();
	
	public User getUserByID(int ID);

}
