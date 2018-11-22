<%--
  Created by IntelliJ IDEA.
  User: gaodun
  Date: 2018/11/8
  Time: 下午4:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>文件上传实例</title>
</head>
<body>
<h1>文件上传实例</h1>
<form method="post" action="fly/UploadServlet" enctype="multipart/form-data">
    <input type="file" name="uploadFile">
    <input type="submit" value="上传文件">
</form>
</body>
</html>
