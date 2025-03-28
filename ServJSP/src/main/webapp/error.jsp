<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage = "true" %>

<h1>Exception occurred</h1>




<pre>
<%
    exception.printStackTrace(new java.io.PrintWriter(out));
%>
</pre>