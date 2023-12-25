<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="login" method="post">
<h2>User Login</h2>

    <div class="form-group">
    <label for="exampleInputPassword1">Email</label>
    <input type="email" name="cemail" class="form-control" id="exampleInputPassword1" placeholder="Enter Email" required="required">
  </div><br>
    <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="cpassword" class="form-control" id="exampleInputPassword1" placeholder="Password"
     required="required" minlength="5" maxlength="29">
  </div><br>

  <button type="submit" class="btn btn-primary mt-3">Submit</button>
</form>
</body>
</html>