<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="tableVo.Member" %>
<%
	Member member = (Member)session.getAttribute("member");

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:mysql://192.168.0.26:3306/campingweb";
	String user = "cteam";
	String pass ="ezen";



%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/base.css" type="text/css" rel="stylesheet">
</head>
<body>
	<%@ include file="/include/header.jsp" %>
	<%@ include file="/include/mypageNav.jsp" %>
	<section>
		안녕하세요
	</section>
	<%@ include file="/include/footer.jsp" %>
</body>
</html>