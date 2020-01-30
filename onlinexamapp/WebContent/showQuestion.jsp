<%@page import="java.util.List"%>
<%@page import="com.lti.exam.model.Option"%>
<%@page import="com.lti.exam.model.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Imtehaan.com</title>
</head>
<body>
<form action="CalculateScoreServlet" method="post">

<%
	Question q = (Question) session.getAttribute("currentQs");
	int qno = (int) session.getAttribute("qNumber");
	int i = 0;
%>

<h3>Q.<%= qno %> <%= q.getQuestion() %></h3>
<%
	List<Option> ops = q.getOptions();
	for(Option op: ops) {
%>
	<ul>
		<input type="radio" name="op" value="<%= i %>">
		<%= op.getOption() %>
		</input>
	</ul>
<%
i++;
}
%>

<%
Integer  totalNoOfQuestions = (Integer) session.getAttribute("totalNoOfQuestions");
Integer currentQNo =  (Integer) session.getAttribute("qNumber");

String btnLabe1 = "Continue";
if(currentQNo ==  totalNoOfQuestions)
	btnLabe1="Finish";

%>
<button type="submit"><%= btnLabe1 %></button>
</form>
</body>
</html>