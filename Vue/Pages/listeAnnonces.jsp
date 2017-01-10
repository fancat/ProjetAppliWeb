<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, projetAppli.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Annonces|MeeticMusique</title>
</head>
<body>

<% 
Collection<Annonce> listeannonces = (Collection<Annonce>)request.getAttribute("listeannonces");
for (Annonce a : listeannonces) {
	out.println(a.getDate() + " " + a.getDescr()+"<br>");
	for (Instrument i : a.getInstrus()) {
		out.println("&nbsp;&nbsp;"+i.getType()+"<br>");
}}
%>

</body>
</html>