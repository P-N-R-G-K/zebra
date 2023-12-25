<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
#ECommerceCart
{
margin-left:100px;
}
#navbatitems
{
margin-right:100px
}
</style>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-info">
  <a class="navbar-brand" id="ECommerceCart" href="#">E-Commerce Cart</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav" id="navbatitems">
    <ul class="navbar-nav ms-auto" id="navbatitems">
      <li class="nav-item active">
        <a class="nav-link" href="productview">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="cartproductsview">Cart<sup>${oldcartlist.size() }</sup></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="placeorderbycart?action=orders&id=${userid}">Orders</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="logout">Logout<sup>${name}</sup></a>
      </li>
    </ul>
  </div>
</nav>
</body>
</html>