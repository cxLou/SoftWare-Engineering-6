<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到66购物网站</title>
</head>
<body>
<style>
body {
  font-family: verdana;
  font-size: 25px;
  background-color: #66CDAA;
  border-radius: 5px;
}
input[type=text], select {
  width: 300px;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password], select {
  width: 300px;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit] {
  width: 145px;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
input[type=button] {
  width: 145px;
  background-color: #66CDAA;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.title{
	color: #66CDAA;
	font-size: 28px;
}
div {
  width:320px;
  height:320px;
  border-radius: 5px;
  background-color: white;
  padding: 20px;
  margin-left:35%;
  margin-top:10%;
}
form{
	margin-left: 40%;
}
</style>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div >
	<p class="title" align="center">
		<strong>
		欢迎来到66在线购物网站</br>
		请选择您的身份
		</strong>
	</p>
	<img alt="图片找不到了呀呀" src="imags/customer.PNG" width="45">
	<input type="button" value="我是客户" onclick='location.href=("showgoods.jsp")'></br>
	<img alt="图片找不到了呀呀" src="imags/shop.PNG" width="45">
	<input type="button" value="我是商家" ></br>

    <script>
    	
    </script>
</div>
</body>
</html>