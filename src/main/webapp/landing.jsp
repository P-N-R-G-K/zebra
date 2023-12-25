<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="navbar.jsp"%>
<marquee>Welcome to our shopping Application we hope you enjoy with our products</marquee>
	<div class="container mt-5">
		<div class="row justify-content-center">

			<!-- Use a forEach loop to iterate over the data -->
			<c:forEach var="details" items="${productlist}">
				<div class="col-md-3">

					<!-- Bootstrap Card -->
					<div class="card" style="width: 18rem;">
						<img src="images/${details.pimg}" class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">${details.pname}</h5>
							<p class="card-text">price:${details.pprice}</p>
							<p class="card-text">catageory:${details.pcategory}</p>

							<div>
								<a href="addtocart?id=${details.pid}" class="btn btn-primary">Add
									Cart</a> 
									<a href="placeorderbycart?action=landingpage&quantity=1&id=${details.pid}">Buy Now</a>
							
							</div>
						</div>
					</div>

				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>