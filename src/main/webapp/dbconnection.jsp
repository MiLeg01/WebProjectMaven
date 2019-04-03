<!DOCTYPE html>

<%@ page import="com.domain.User"%>
<%@ page import="com.persistanceJDPC.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>

<html>

<head>

</head>

<body>

	<h1>JDBC Test</h1>

	<h3>1. getUserByID Test</h3>

	<%
		UserDAO getUser = new UserDAOImpl();

		User user = getUser.getUserByID(1);

		out.println(user.getId() + " " + user.getLastName() + " " + user.getFirstName());
	%>

	<h3>2. getAllUser Test</h3>

	<%
		UserDAO allUsers = new UserDAOImpl();

		ArrayList<User> userlist = allUsers.getAllUser();

		User user2 = new User();

		for (int i = 0; i < userlist.size(); i++) {
			user2 = userlist.get(i);
			%> <br /> <%
			out.println(user2.getId() + " " + user2.getLastName() + " " + user2.getFirstName());
		}
	%>

	<h3>3. createUser Test</h3>

	<%
		UserDAO createUser = new UserDAOImpl();

		User user4 = new User("Huber9", "Bauer9", "tirol9");

		//createUser.createUser(user4);
	%>


</body>
</html>
