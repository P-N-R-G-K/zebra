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
</head>
<body>
<%=request.getParameter("orderdetailslist") %>
<table class="table">
  <thead>
    <tr>

      <th scope="col">odate</th>
      <th scope="col">oname</th>
      <th scope="col">ocategory</th>
       <th scope="col">oquantity</th>
         <th scope="col">opricel</th>
          
       
       
      
    </tr>
  </thead>
  <tbody>
<c:forEach var="orders" items="${orderdetailslist}">
    <tr>
      <td>${orders.odate}</td>
      <td>${orders.oname}</td>
      <td>${orders.ocategory}</td>
      <td>${orders.oquantity}</td>
      <td>${orders.opricel}</td>
      

    </tr>
    </c:forEach>
  </tbody>
</table>

</body>
</html>