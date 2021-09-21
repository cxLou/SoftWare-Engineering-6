<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户信息填写</title>
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
  height: 400px;
  margin-left:35%;
  margin-top:80px;
  text-align: center;
}
input[type=button] {
  width: 240px;
  background-color: #20B2AA;
  color: black;
  padding: 10px 15px;
  margin: 8px 0;
  border: 2px solid #696969;
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
<script type="text/javascript" >
function disable()
  {
  document.getElementById("accept").disabled=true
  }
function enable()
  {
  document.getElementById("accept").disabled=false
  }
</script>

<form >
	<div style="width:300px;height: 100px;">
	<strong><font  class="font-spacing" size="5" style="position: absolute; margin-top:40px; margin-left:-90px;">
	请填入您的信息</font></strong><br/>
	</div>
	<div>
	<input type="text" name="username" placeholder="请输入您的姓名" style="width:245px;height:25px;"></br>
	<input type="text" name="useremail" placeholder="请输入您的邮箱" style="width:245px;height:25px;"></br>
	<input type="text" name="useremail" placeholder="请输入您的详细地址" style="width:245px;height:25px;"></br>
	<input type="tel" name="telnumber" placeholder="请输入您的电话号码" style="width:245px;height:25px;"></br>
	<input type="checkBox" onclick="if (this.checked) {enable()} else {disable()}"><a href="#">《66购物网站服务条款》</a><a href="#">《法律声明和隐私权政策》</a></br>
	<input type="button" id="accept" disabled="true" value="同意协议并提交" onclick='location.href=("register_success.jsp")'>

	</div>
</form>

</body>
</html>