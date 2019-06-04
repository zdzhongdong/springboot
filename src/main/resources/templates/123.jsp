<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="../static/jquery-3.2.1.min.js"></script>
</head>
<body>
内容：<input type="text" id="neirong">
<input type="button" value="tijiao" onclick="aaa()">
<script type="text/javascript">
/* $("#ti").click(
		alert(1);
$.getJSON("/hello",function(data){
	alert(data);
})) */
function aaa(){
var text = $("#neirong").val();
debugger;
$.getJSON("/hello",function (data){alert(data)})
}
function bb(data){
	alert(1);
	alert(data);
}
</script>
</body>
</html>