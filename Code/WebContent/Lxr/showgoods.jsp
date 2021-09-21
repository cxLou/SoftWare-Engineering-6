<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品详情</title>
</head>
<body>
<style>
	form {
		margin-left:20%;
		margin-top:5%;
	}
input[type=submit] {
  width: 145px;
  background-color: #66CDAA;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
input[type=button] {
  width: 145px;
  background-color: #F8F8FF;
  color: black;
  padding: 14px 20px;
  margin: 8px 0;
  border: 2px solid #696969;
  border-radius: 4px;
  cursor: pointer;
}


sapn{
	font-family: italic;
	font-size:30px;
	color:#66CDAA;
}


</style>

<!-- 商品详情界面的搜索框 -->
<div style="width:100%; height:150px; border:2px #66CDAA solid;">
<div>
	
	<form action="">
		<strong><font size="6" color="#66CDAA" style="margin-right:5%;">66购物</font></strong>
		<input type="text" name="context" placeholder="全聚德烤鸭" style="width:400px; height:35px; border:2px #66CDAA solid;"/>
		<input type="submit" value="搜索">
	</form>
</div>
</div>

<!-- 商品详情中的商品展示页面 -->
<div style="width:100%; height:500px; border:2px #66CDAA solid;">
<div>
	
	<h4 style="margin-left:15%">热门产品</h4>
	<div>
	<img alt="图片找不到了呀呀" src="img/duck.PNG" width=400px style="position: absolute; left:180px">
	</div>
	<div style="position: absolute;right:100px;width:35%;height:100px" >
		<p>商品名称：全聚德烤鸭</p>
		<font>
		“全聚德”不仅以烤鸭而饮誉海内外，而且以全鸭席、特色菜、创新菜、名人宴为代表的系列精品菜肴形成了全聚德海纳百川的菜品文化。
		在全聚德厨师的手中，鸭子全身都变成了宝贝。历代厨师在制作烤鸭的同时，利用鸭膀、鸭掌、鸭心、鸭肝、鸭胗等原料，精心创制了各种美味的冷热菜肴。
		</font>
		<div style="position: absolute;top:200px">
		<img alt="图片找不到了呀呀" src="img/like.PNG" width="35px" margin-left="10px">
		<input type="button" value="我要购买" onclick='location.href=("cus_register.jsp")'>
		</div>
	</div>
</div>
</div>

</body>
</html>