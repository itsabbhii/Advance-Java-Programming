<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Arithmatic functions</title>
</head>
<body>
	<form>
		Enter number 1: <input type = "number" name = "num1"><br><br>
		Enter number 2: <input type = "number" name = "num2"><br><br>
		<select name = "operation">
				<option value = "add">Add</option>
				<option value = "sub">Subtract</option>
				<option value = "div">Divide</option>
				<option value = "mul">Multiply</option>
		</select>
		<input type = "submit" value = "Calculate">
	</form>
	<%
	String num1st = request.getParameter("num1");
	String num2st = request.getParameter("num2");
	String op = request.getParameter("operation");
	
	double result = 0;
	String opr = "";
	
	if(num1st!=null && num2st!=null && op!=null){
		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		switch(op){
			case "add":
				result = num1+num2;
				opr = "+";
				break;
			case "sub":
				result = num1-num2;
				opr = "-";
				break;
			case "mul":
				result = num1*num2;
				opr = "*";
				break;
			case "div":
				if (num2!=0){
					result = num1/num2;
					opr = "÷";
					break;	
				}else{
					out.println("<h1>Cannot divide by Zero</h1>");
					return;
				}
		}
	%>
	<p>Result is: </p>
	<p><%= num1 %> <%=opr %> <%=num2 %> = <strong><%=result %></strong></p>
	
	<%} %>
</body>
</html>