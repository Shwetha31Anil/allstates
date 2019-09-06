<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add" method="post">
	Pid: <input type="text" name="pid" readonly="readonly" value="${prod.productid}"><br/><br/>
	Pname:<input type="text" name="pname" value="${prod.pname}"><br/><br/>
	Cost:<input type="text" name="cost" value="${prod.cost}"><br/><br/>
	Quantity: <input type="text" name="qty" value="${prod.qty}"><br/><br/>
	<input type="Submit" value="AddProduct">
	<%-- setPname getPname --%>
</form>
</body>
</html>