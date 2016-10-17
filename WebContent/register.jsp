<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<h2>Product Register</h2>

<a href="index.jsp">Initial</a>
&nbsp;|&nbsp;
<a href="register.jsp">Register</a>
&nbsp;|&nbsp;
<a href="ProductControl">Consult</a>
<br>

<br>
<form method="post" action="ProductControl">

Product:<br/>
<input type="text" name="name" placeholder="Entry with the product name" required="required"/>
<br>

Maker:<br>
<select name="maker" title="Entry with the maker">
	<option value="HP">HP</option>
	<option value="DELL">DELL</option>
</select>
<br>

Manufacturing Date:<br>
<input type="date" name="manufdate" required="required"/>
<br>

Quantity:<br>
<input type="number" name="qtd" min="1" max="20" required="required" />
<br>

Price:<br>
<input type="number" name="price" required="required" />
<br>

<input type="submit" value="Register" />
&nbsp;
<input type="reset" value="Clear" />

</form>
</body>
</html>