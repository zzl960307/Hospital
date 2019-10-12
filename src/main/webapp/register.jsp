<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>注册页面</title>
	<script type="text/javascript" src="${pageContext.request.contextPath }/Js/jquery-1.11.0.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/common.js"></script>
    <style type="text/css">
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #f5f5f5;
        }

        .form-signin {
            max-width: 300px;
            padding: 19px 29px 29px;
            margin: 0 auto 20px;
            background-color: #fff;
            border: 1px solid #e5e5e5;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            -moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
        }

        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
        }

        .form-signin input[type="text"],
        .form-signin input[type="password"] {
            font-size: 16px;
            height: auto;
            margin-bottom: 15px;
            padding: 7px 9px;
        }

    </style>  
</head>
<body>
<form action="${pageContext.request.contextPath }/user/register" method="post">
	<table align="center" border="2">
		<tr>
			<td>用户名</td>
			<td><input type="text" name="user_name" id="i1"></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="text" name="password" id="p1"></td>
		</tr>
		<tr>
			<td>真实姓名</td>
			<td><input type="text" name="real_name" id="r1"></td>
		</tr>
		<tr>
			<td>邮箱</td>
			<td><input type="text" name="email" id="e1"></td>
		</tr>
	</table>
	 <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button id="i3" class="btn btn-large btn-primary" type="submit">提交</button></p>
</form>
	 <a href="${pageContext.request.contextPath }/user/login">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button  class="btn btn-large btn-primary">out</button></a>

</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/Js/jquery-1.11.0.js"></script>

<script type="text/javascript">
	$("#i1").blur(function(){
		var val = $("#i1").val();
		$.ajax({
			url:"${pageContext.request.contextPath }/user/check",
			type:"POST",
			data:{"user_name":val},
			success:function(data){
				if(data.code == 200){
					$("#s1").remove();
					$("#i3").removeAttr("disabled");
					$("#i1").after("<span id='s1'>用户可以注册</span>");
					$("#s1").css("color","green");
				}else{
					$("#s1").remove();
					$("#i1").after("<span id='s1'>用户已存在,请重新输入账号</span>");
					$("#s1").css("color","red");
					$("#i3").attr("disabled","disabled");
				}
			}
		});
	});
	
 	// 账号输入规则
	var val1 = /^[A-Z]{1}[a-z]{1,}\d{5,8}$/;
	// keyup事件键盘在按键释放触发
	$("#i1").keyup(function(){
		// test的val满足表达式就true不满足就false
		if(val1.test($("#i1").val())){
			$("#s1").remove();
			$("#i1").after("<span id='s1'>符合输入规则</span>");
			$("#s1").css("color","red");
			$("#i3").removeAttr("disabled");
		}else{
			$("#s1").remove();
			$("#i1").after("<span id='s1'>请输入6-9位字符,首字母大写,其余小写字母字母或者数字</span>");
			$("#s1").css("color","blue");
			$("#i3").attr("disabled","disabled");
		}
	});
	
	// 密码输入规则
	var val2 = /^\w{6,9}$/;
	$("#p1").keyup(function(){
		if(val2.test($("#p1").val())){
			$("#s1").remove();
			$("#p1").after("<span id='s1'>符合输入规则<span/>");
			$("#s1").css("color","red");
			$("#i3").removeAttr("disabled");
		}else{
			$("#s1").remove();
			$("#p1").after("<span id='s1'>输入字母或数字6-9个<span/>");
			$("#s1").css("color","blue");
			$("#i3").attr("disabled","disabled");
		}
	});
	
	
	// 邮箱输入规则
	var val3 = /^\w+@[a-z0-9]+\.[a-z]{3}$/;
	$("#e1").keyup(function(){
		if(val3.test($("#e1").val())){
			$("#s1").remove();
			$("#e1").after("<span id='s1'>符合输入规则<span/>");
			$("#s1").css("color","red");
			$("#i3").removeAttr("disabled");
		}else{
			$("#s1").remove();
			$("#e1").after("<span id='s1'>输入规则如:1a665@qq.com<span/>");
			$("#s1").css("color","blue");
			$("#i3").attr("disabled","disabled");
		}
	});
	
	
	// 真实姓名输入规则
	var val4 = /^\u4e00-\u9fa5{2,4}$/;
	$("#r1").keyup(function(){
		if(val4.test($("#r1").val())){
			$("#s1").remove();
			$("#r1").after("<span id='s1'>符合输入规则<span/>");
			$("#s1").css("color","red");
			$("#i3").removeAttr("disabled");
		}else{
			$("#s1").remove();
			$("#r1").after("<span id='s1'>输入2-4个汉字<span/>");
			$("#s1").css("color","blue");
			$("#i3").attr("disabled","disabled");
		}
	}); 
	
	

</script>
</html>