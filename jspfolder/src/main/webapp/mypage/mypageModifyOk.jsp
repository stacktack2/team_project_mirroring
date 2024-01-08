<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="Vo.*" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="member" class="Vo.Member" />
<jsp:setProperty name="member" property="*" />
<%
//	[get방식 차단]
	String method = request.getMethod();
	if(method.equals("GET")){
		response.sendRedirect("mypage.jsp");
	}
// 	[비인증 접근 제한]
 	if(!(boolean)session.getAttribute("isAutFlag")){
		response.sendRedirect("mypage.jsp")	;
	}
	
	Member memberSession = (Member)session.getAttribute("login");
	int mno = memberSession.getMno();


	Connection conn = null;
	PreparedStatement psmt= null;
	
	
	String url = "jdbc:mysql://127.0.0.1:3306/campingweb";
	String user = "cteam";
	String pass ="ezen";
	String mphone1 = request.getParameter("mphone1");
	String mphone2 = request.getParameter("mphone2");
	String mphone3 = request.getParameter("mphone3");
	String mphone = mphone1+mphone2+mphone3;
	
	int result = 0;
	try{
		// masql drivermanager로 접속
		Class.forName("com.mysql.cj.jdbc.Driver");
		// conn 변수에 url과 계정 비밀번호 대입
		conn = DriverManager.getConnection(url,user,pass);
		// 연결 성공 시 연결 성공 출력
		System.out.println("연결성공!");
		
		// mysql insert query문 작성 -> join.jsp에서 입력한 데이터 처리
		String sql = " update member set mpw = ?, mphone = ?, memail = ? where mno = ?";
		
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, member.getMpw());
		psmt.setString(2, mphone);
		psmt.setString(3, member.getMemail());
		psmt.setInt(4,mno);
		
		result = psmt.executeUpdate();
		
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(conn != null) conn.close();
		if(psmt != null) psmt.close();
		/* 인증세션 제거 */
		session.removeAttribute("isAutFlag");
	}
	
	if(result > 0){
%>
		<script>
			alert("정보 수정이 완료되었습니다.");
			location.href="<%=request.getContextPath()%>";
		</script>
<%
	}else{
%>
		<script>
			alert("정보 수정에 실패했습니다. 다시 시도하세요.");
			location.href="<%=request.getContextPath()%>";
		</script>
<%		
	}
	
%>