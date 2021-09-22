<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布商品</title>
</head>

<body>
<style>
form{
	margin:50px 0px 0px 50px;

}
input[type=text] {
  width: 240px;
  color: black;
  padding: 10px 15px;
  margin: 8px 0;
  border: 2px #00000;
  border-radius: 4px;
  cursor: pointer;
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
font{
	width:100px;
	height:50px;
	font-size:20px;
	background-color:#DCDCDC;
	border:border: 2px solid #00000;
	border-radius:15px;
	margin:0px 10px 0px 0px;
}
.jianju{
	padding:8px;
}
div{
	margin-left:50px;
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
<h1>发布商品</h1>
<form action=<%=request.getContextPath() %>/Servlet/GoodServlet>
	<font class="jianju">商品名称</font><input type="text" name="GoodName" ></br>
	<font class="jianju">商品介绍</font><input type="text" name="GoodDescibe"></br>
	<font class="jianju">商品价格</font><input type="text" name="GoodPrice"></br>
	<font class="jianju">商品图片</font><input type="file" name="GoodImage"></br>
	<div>
	<input type="checkBox" onclick="if (this.checked) {enable()} else {disable()}"><a href="#">《66购物网站服务条款》</a><a href="#">《法律声明和隐私权政策》</a></br>
	<input type="button" id="accept" disabled="true" value="同意条款并发布" onclick='location.href=("register_success.jsp")'>
	</div>
</form>
</body>
</html>