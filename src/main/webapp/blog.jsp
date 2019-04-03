<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>

<head>

	<meta charset="ISO-8859-1">
	<title>My blog</title>
	<link href="https://fonts.googleapis.com/csss?family=Handlee" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/BasicStyle.css">	
	
</head>

<body>

	<!-- Header start -->
	<div id="header" class="section">
		<img alt="" class="img-circle" src="https://code.sololearn.com/Icons/Avatars/0.jpg">
		<p>this.name</p>
	</div>
	<!-- Header end -->

	<!-- About Me section start -->
	<div class="section">
		<h1>About me</h1>
		<h1><span>About me</span></h1>
		<p>someTextAbout.me</p>
		<p class="quote">"Stay hungry, stay foolish"</p>
	</div>
	<!-- About Me section end -->	
	
	<!-- My Schedule section start -->
	<div class="section">
		<h1><span>My Coding Schedule</span></h1>
		
		<table>
			<tr>
				<th>Day</th>
				<th>Mon</th>
				<th>Tue</th>
				<th>Wed</th>
				<th>Thu</th>
				<th>Fri</th>
			</tr>
			<tr>
				<td>8-8:30</td>
				<td class="selected">Learn</td>
				<td>-</td>
				<td>-</td>
				<td>-</td>
				<td>-</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>		
		</table>
		<!--  My Schedule selection end -->
		
		<!--  My Skills section start -->
		<div class="section">
			<h1><span>My Skills</span></h1>
			<ul>
				<li>HTML<br />
					<progress min="0" max="100" value="80"></progress>
				</li>
				<li>Java Script<br />
					<progress min="0" max="100" value="50"></progress>
				</li>
				<li>Python<br />
					<progress min="0" max="100" value="30"></progress>
				</li>
			</ul>
		</div>
		<!-- My Skills section end -->
		
		<!-- Media section start -->
		<div class="section">
			<h1><span>My Media</span></h1>
			<iframe height="150" width="300" 
				src="https://www.youtube.com/embed/Q6_5InVJZ88" allowfullscreen frameborder="0">
			</iframe>
			<iframe src="https://www.youtube.com/embed"></iframe>
		</div>
		<!-- Media section end -->
		
		<!-- Form section start -->
		
		<div class="section"></div>
		
		<!-- Form section end -->
		
	</div>
	
	

</body>
</html>