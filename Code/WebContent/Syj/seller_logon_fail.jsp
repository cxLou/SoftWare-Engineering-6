<%@page import="com.test.vo.Enterprise"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家登录失败</title>

<link rel="stylesheet" href="./css/reset.css">
<link rel="stylesheet" href="./css/商家登录失败.css">

</head>
<body>
<%
Enterprise u = (Enterprise)request.getAttribute("enterprise01");
%>
<div class="container">
        <div class="content">
            <div class="title">
                <h2>登录失败</h2>
            </div>

            <div class="return">
                <a href="seller_log_on.jsp">点击重新登录</a>
            </div>
        </div>
    </div>
</body>
</html>