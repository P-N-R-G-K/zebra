<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
#datashown
{
  height:50px;
  width:40%;
  background-color:yellow;
  margin-left:50%;
}
</style>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"><title>Insert title here</title>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

</head>
<body>

<c:if test="${productlist!=null}">
<div id="datashown">
</div>
</c:if>
<div class="container">
<div class="row">
<c:forEach var="productlist" items="${productlist}">
<div class="col-3 mt-3">
<div class="card" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">${productlist.pid }</h5>
    <p class="card-text">${productlist.pprice}</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
  </div>
  </div>
  </c:forEach>
  </div>
</div>
</body>
</html>