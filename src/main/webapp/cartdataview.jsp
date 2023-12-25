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
<h1>totalprice: <%=request.getAttribute("totalprice") %></h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">pid</th>
      <th scope="col">pname</th>
      <th scope="col">pprice</th>
       <th scope="col">pquantity</th>
      
    </tr>
  </thead>
  <tbody>
<c:forEach var="Cartdto" items="${getdetailsfromoldcartlistid }">
    <tr>
      <td>${Cartdto.pid}</td>
      <td>${Cartdto.getPname()}</td>
      <td>${Cartdto.getPprice()}</td>
      <td>
      <a href="cartincdec?action=increment&quantity=${Cartdto.getQuantity()}&id=${Cartdto.getPid()}">++</a><input value="${Cartdto.getQuantity()}"><a href="cartincdec?action=decrement&quantity=${Cartdto.getQuantity()}&id=${Cartdto.getPid()}">--</a></td>
      <td><a href="placeorderbycart?action=fromcart&quantity=${Cartdto.getQuantity()}&id=${Cartdto.getPid()}">Buy</a></td>
      <td><a href="remove?&id=${Cartdto.getPid()}">Remove</a></td>

    </tr>
    </c:forEach>
  </tbody>
</table>
</body>
</html>