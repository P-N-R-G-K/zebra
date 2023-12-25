<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
#width
{
width:30%;
}
#errmsg
{
text-align:center;
margin-top:10px;
margin-left:150px;
background-color:yellow;
height:60px;
width:600px;
border-radius:10px;

}
</style>
</head>
<body>
<%@include file="navbar.jsp" %>
<c:if test="${error}">
  <div id="errmsg">
 <c:out value="${ErrMsg}"></c:out>
 </div>
</c:if>
<div class="m-5" id="width">
<form action="signup" method="post">
<h2>User Signup</h2>
<br>
  <div class="form-group">
    <label for="exampleInputEmail1">First Name</label>
    <input type="text" name="cfname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter FirstName"
    required="required" minlength="5" maxlength="29">
  </div><br>
  <div class="form-group">
    <label for="exampleInputPassword1">Last Name</label>
    <input type="text" name="clname" class="form-control" id="exampleInputPassword1" placeholder="Enter LastName"
    required="required" minlength="5" maxlength="29">
  </div><br>
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
</div>
</body>
</html>