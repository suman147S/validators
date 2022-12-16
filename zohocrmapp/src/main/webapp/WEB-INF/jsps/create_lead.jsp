<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body>

// in interview they will ask what were you doing in your company for 15 months?
//defects were communicated from testers to me.
// what kind of defects?
// email Id fields were taking invalid email address, mobile phone fields were taking characters so such small things were given to me.
// how do you fix that ?
// its simple sir i just went to the HTMl page and edited sir.

	<h2>Create | Lead</h2>
	<form action="saveLead" method="post">
	<pre>
		First Name <input type="text" name="firstName" />
		Last Name <input type="text" name="lastName" />
		Email <input type="email" name="email" />
		Mobile <input type="number" name="mobile" />
		
		<select name="source" >
		  <option value="news paper">News Paper</option>
		  <option value="tv commercial">TV Commercial</option>
		  <option value="online">Online</option>
		  <option value="seminar">Seminar</option>
		</select>
		<input type="submit" value="save" />
	</pre>
		
	</form>
</body>
</html>