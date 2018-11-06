<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC >
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Part_test</title>
  </head>
  
  <body>
   	<form action="test.do" method="post" enctype="multipart/form-data" id="frm">
    	<!-- accept,提交文件格式 ,常用 audio image video 使用扩展名 image/jpg -->
    	上传图片：<input type="file" name="image"  ><br>
    	精度（5-10）：<input type="number" name="prec" min="5" max="10"><br>
    	<button>提交</button>
    	</form>
   
  </body>
</html>
