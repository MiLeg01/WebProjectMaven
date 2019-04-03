package com.persistanceJDPC;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.domain.User;

public class UserDAOImpl implements UserDAO {
	
	//INSERT INTO persons (PersonID, LastName, FirstName, Password) VALUES (2, 'Huber', 'Horst', 'woswasi')
	
	private int getHighestID() {
		
		int highestID = 0;
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webprojectmaven", "trainee", "trainee");
			Statement stmt = con.createStatement();

			String gethighestID = "select PersonID from persons";

			ResultSet rs = stmt.executeQuery(gethighestID);
			
			while (rs.next()) {
				if(Integer.parseInt(rs.getString(1)) > highestID)
					highestID = Integer.parseInt(rs.getString(1));
				}

			rs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return highestID;
		
	}

	public void createUser(User user) {
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webprojectmaven", "trainee", "trainee");
			Statement stmt = con.createStatement();
			
			int newID = getHighestID() + 1;

			String createUserPart1 = "INSERT INTO persons (PersonID, LastName, FirstName, Password)";
			String createUserPart2 = " VALUES (" + newID + ",\'" + user.getLastName() + "\',\'" + user.getFirstName() + "\',\'" + user.getPassword() + "\')";
			String createUser = createUserPart1 + createUserPart2;
			
			stmt.executeUpdate(createUser);

			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<User> getAllUser() {
		try {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webprojectmaven", "trainee", "trainee");
			Statement stmt = con.createStatement();

			String getUserStatement = "select * from persons";
			ResultSet rs = stmt.executeQuery(getUserStatement);

			List<User> userlist = new ArrayList<User>();

			User newuser = new User();
			
			while (rs.next()) {
				Long id = Long.parseLong(rs.getString(1));
				String lastname = rs.getString(2);
				String firstname = rs.getString(3);
				String password = rs.getString(4);
				userlist.add(new User(id, lastname, firstname, password));
			}

			rs.close();
			con.close();
			return (ArrayList<User>) userlist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public User getUserByID(int ID) {

		try {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webprojectmaven", "trainee",
					"trainee");
			Statement stmt = con.createStatement();

			String getUserStatement = "select * from persons where PersonID = 1";
			ResultSet rs = stmt.executeQuery(getUserStatement);
			rs.absolute(ID);

			User user = new User();
			user.setId(Long.parseLong(rs.getString(1)));
			user.setLastName(rs.getString(2));
			user.setFirstName(rs.getString(3));
			user.setPassword(rs.getString(4));

			rs.close();
			con.close();
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
