<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家登录</title>

<link rel="stylesheet" href="./css/reset.css">
<link rel="stylesheet" href="./css/商家_登录.css">

</head>
<body>
<div class="container">
        <div class="content">
            <div class="title">
                <h2>商家管理系统</h2>
            </div>
            <div class="form">
                <form action="<%=request.getContextPath()%>/EnterpriseServlet?flag=checkuser" method="post">
                    <div class="form-item">
                        <input type="text" class="account" name="username" placeholder="请输入用户名称">
                    </div>
                    <div class="form-item">
                        <input type="text" class="pwd" name="pwd" placeholder="请输入登陆密码">
                    </div>
                    <div>
                        <input class="logon" type="submit" value="登录">
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>