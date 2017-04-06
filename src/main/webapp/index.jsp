<html>
<head>
	<%-- <script src="<%=request.getContextPath()%>/js/main.js" type="text/javascript"></script> --%>
</head>
<body>

<form action="${pageContext.request.contextPath}/index/login">
     <input type="text" name="userName">
	 <input type="text" name="password">
	 <input type="button" id="login"></input>	
	 <input type="button" id="reg"></input>	
</form>
</body>
</html>
