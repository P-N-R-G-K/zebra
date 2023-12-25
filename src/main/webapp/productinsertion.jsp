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
<form action="productinsertion" method="post">
<h2>User Signup</h2>
<br>
  <div class="form-group">
    <label for="exampleInputEmail1">pname</label>
    <input type="text" name="pname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="pname"
    required="required" >
  </div><br>
  <div class="form-group">
    <label for="exampleInputPassword1">pprice</label>
    <input type="number" name="pprice" class="form-control" id="exampleInputPassword1" placeholder="pprice"
    required="required" >
  </div><br>
    <div class="form-group">
    <label for="exampleInputPassword1">pcategory</label>
    <input type="text" name="pcategory" class="form-control" id="exampleInputPassword1" placeholder="pcategory" required="required">
  </div><br>
    <div class="form-group">
    <label for="exampleInputPassword1">pimg</label>
    <input type="text" name="pimg" class="form-control" id="exampleInputPassword1" placeholder="pimg"
     required="required" >
  </div><br>

  <button type="submit" class="btn btn-primary mt-3">Submit</button>
</form>

</body>
</html>