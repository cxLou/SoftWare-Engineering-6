<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息注册成功</title>
</head>
<body>
<style>
body {
  font-family: italic;
  font-size: 25px;
  background-color: #20B2AA;
  border-radius: 5px;
}
form{
  background-color: #F8F8FF;
  border-radius:20px;
  font-family: verdana;
  font-size:30px;
  width:320px;
  height: 320px;
  margin-left:35%;
  margin-top:80px;
  text-align: center;
}
input[type=button] {
  width: 250px;
  background-color: #66CDAA;
  color: white;
  padding: 10px 15px;
  margin: 8px 0;
  border: 3px solid #66CDAA;
  border-radius: 4px;
  cursor: pointer;
}

input{
margin:10px 0px 10px 0px;
}
.font-spacing{
	letter-spacing: 5px;
}
a{
font-size:10px;
}
</style>

<form action="">
	<div style="width:300px;height: 200px;">
	<strong><font size="6" color="#66CDAA" style="position:absolute;margin-top:80px;margin-left: -120px;">提交成功！</br>商家将会与你联系</font></strong>
	</div>
	<div>
	<input class="font-spacing" type="button" value="确定" onclick='location.href=("index.jsp")'>
	</div>
</form>
</body>
</html>