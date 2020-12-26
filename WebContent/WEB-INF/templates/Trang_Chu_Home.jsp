<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"   %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ParkingCar</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

<header>
	<tiles:insertAttribute name="dautrang"></tiles:insertAttribute>
</header>

<section>
	<nav>
		<tiles:insertAttribute name = "thucdon"></tiles:insertAttribute>
	</nav>
	<article>
		<tiles:insertAttribute name = "noidung"></tiles:insertAttribute>
	</article>
</section>

<footer>
	<tiles:insertAttribute name="cuoitrang"></tiles:insertAttribute>
</footer>


</body>
</html>