<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Create</h1>

<form action = "addEmployee">
	Enter name: <input type ="text" name = "ename"><br><br>
	Enter id: <input type ="number" name = "eid"><br><br>
	Enter department: <input type ="text" name = "dept"><br><br>
	Enter salary: <input type ="number" name = "sal"><br><br> 
	
	<input type = "submit" value ="register">
</form>

<h1>Read</h1>
<form action = "getEmployee" method ="get">
Enter eid: <input type = "number" name ="eid" >
<input type ="submit">

</form>
<h1>Update</h1>
<form action = "updateEmployee" >
Enter name: <input type ="text" name = "ename"><br><br>
	Enter id: <input type ="number" name = "eid"><br><br>
	Enter department: <input type ="text" name = "dept"><br><br>
	Enter salary: <input type ="number" name = "sal"><br><br> 
<input type ="submit">

</form>
<h1>Delete</h1>
<form action = "deleteEmployee" >
Enter eid: <input type = "number" name ="eid" >
<input type ="submit">

</form>
</body>
</html>