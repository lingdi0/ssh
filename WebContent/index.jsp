<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bs/css/bootstrap.min.css" >
<style type="text/css">
	.container{
	background-color:#666;
	text-align: center;
	}
</style>
</head>
<body>
<div class="container">
	<h1>this is index jsp!</h1>
	<form action="user_login.action" method="post" class="form-inline">
	<div class="form-group">
		username:<input type="text" name="username" class="form-control"  placeholder="Username"/><p></p>
		password:<input type="password" name="password" class="form-control"  placeholder="Password"/><p></p>
		<input type="submit" value="login" class="btn btn-primary"/>&nbsp;&nbsp;<input type="reset" value="reset"  class="btn btn-primary"/>
		</div>
	</form>
	</div>
</body>
</html>