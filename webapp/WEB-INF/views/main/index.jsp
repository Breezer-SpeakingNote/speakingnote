<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<% %>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Jquery -->
<script type="text/javascript"	src="${pageContext.request.contextPath }/assets/js/jquery/jquery-3.2.1.js"></script>


<title>SpeakingNote</title>
</head>

<body>
	<c:import url="/WEB-INF/views/includes/header_main.jsp" />
	<div>
		<c:import url="/WEB-INF/views/includes/left_menu.jsp" />
		<c:import url="/WEB-INF/views/includes/right_menu.jsp" />	
	</div>
	
</body>

</html>