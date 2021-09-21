<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家修改密码</title>

<link rel="stylesheet" href="./css/reset.css">
<link rel="stylesheet" href="./css/商家修改密码.css">

</head>
<body>
	 <div class="container">
        <header class="header clearfix">
            <div class="title-icon"></div>
            <div class="title">修改密码</div>
        </header>
        <div class="content">
            <div class="form">
                <h2>请输入您的新密码</h2>
                <form action="<%=request.getContextPath()%>/EnterpriseServlet?flag=changePwd"  method="post">
	                <div class="form-area">
	                    <div class="form-item">
	                        <input type="password" name="pwd1" placeholder="请输入您的新密码">
	                    </div>
	                    <div class="form-item">
	                        <input type="password" name="pwd2" placeholder="请再次输入您的新密码">
	                    </div>
	                    <div class="form-item">
	                        <div class="tel clearfix">
	                            <div class="number">
	                                <div class="title">
	                                    +86
	                                </div>
	                            </div>
	                            <div class="input">
	                                <input type="text" name="phone" placeholder="请输入您的手机号">
	                            </div>
	                        </div>
	                    </div>

	                    <div class="form-item">
	                        <input type="submit" class="fill" value="提交">
	                    </div>
	                </div>
	            </form>
            </div>
        </div>
    </div>
</body>
</html>