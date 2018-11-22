<%--
  Created by IntelliJ IDEA.
  User: gaodun
  Date: 2018/11/8
  Time: 下午2:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>传递 Checkbox 数据到JSP程序</title>
</head>
<body>
<h1>传递 Checkbox 数据到JSP程序</h1>
<form action="seven.jsp" method="post" target="blank">
    <input type="checkbox" name="google" checked="checked"> google
    <input type="checkbox" name="baidu"> 百度
    <input type="checkbox" name="taobao"> 淘宝

    <input type="submit" value="选择网站">
</form>
</body>
</html>
