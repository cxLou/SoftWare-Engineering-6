<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家后台</title>

<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>商家后台</title>
    <link rel="stylesheet" href="./css/reset.css">
	<link rel="stylesheet" href="./css/商家_后台.css">
</head>
<body>
	 <div class="container">
        <header class="header clearfix">
            <div class="title-icon"></div>
            <div class="title">商家后台</div>
            <a href="">账户设置</a>
            <a href="">退出登录</a>
        </header>
        <div class="content clearfix">
            <div class="content-left">
                <!-- 菜单栏导航 -->
                <div class="nav">
                    <!-- 每一个菜单栏项 -->
                    <div class="nav-menu">
                        <!-- 主标题 -->
                        <div class="nav-title">
                            信息管理
                        </div>
                        <div class="seg"></div>
                        <!-- 子标题 -->
                        <div class="nav-content">
                            <a href="seller_edit_password.jsp" target="myframe">修改密码</a>
                            <!-- <div class="seg"></div>
                            <a href="">XX管理</a>
                            <div class="seg"></div>
                            <a href="">XX管理</a> -->
                           
                        </div>
                    </div>
                </div>
                <div class="seg"></div>

                <div class="nav">
                    <!-- 每一个菜单栏项 -->
                    <div class="nav-menu">
                        <!-- 主标题 -->
                        <div class="nav-title">
                            商品管理
                        </div>
                        <div class="seg"></div>
                        <!-- 子标题 -->
                        <div class="nav-content">
                            <a href="seller_good_details.jsp" target="myframe">商品详情</a>
                            <div class="seg"></div>
                            <a href="seller_old_good.jsp" target="myframe">查看历史商品</a>
                            <div class="seg"></div>
                            <a href="">发布商品</a>
                            <!-- <div class="seg"></div>
                            <a href="">XXXX</a> -->
                        </div>
                    </div>
                </div>
                <div class="seg"></div>

                <div class="nav">
                    <!-- 每一个菜单栏项 -->
                    <div class="nav-menu">
                        <!-- 主标题 -->
                        <div class="nav-title">
                            客户管理
                        </div>
                        <div class="seg"></div>
                        <!-- 子标题 -->
                        <div class="nav-content">
                            <a href="">查看客户</a>
                            <!-- <div class="seg"></div>
                            <a href="">XX管理</a>
                            <div class="seg"></div>
                            <a href="">XX管理</a> -->
                       
                        </div>
                    </div>

                </div>
                <div class="seg"></div>
                
            </div>
            <div class="content-right">
                <iframe name="myframe" src="" frameborder="0">
                </iframe>
            </div>
        </div>
    </div>
</body>
</html>