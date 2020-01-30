<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
<h1>
<% 
Integer score =  (Integer) session.getAttribute("score");
Integer totalQs = (Integer) session.getAttribute("qNumber");
if(score>(totalQs/2)) {
%>
Congratulations, You Successfully Cleared Exam with
<%= score %> marks 
<% session.removeAttribute("score"); 
} else {
%>
Sorry, you need to give re-attempt</br>
If you want to give re-test please click on below button
<% 
session.removeAttribute("score"); 
session.removeAttribute("qNumber");
session.removeAttribute("currentQs");
%>
<form action="LoadQuestionServlet">
<button>Re-test</button>
</form>
<% } %>
</h1>
</body>
</html>