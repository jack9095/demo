<%--
  Created by IntelliJ IDEA.
  User: gaodun
  Date: 2018/11/8
  Time: 下午1:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用 GET 方法读取数据</title>
</head>
<body>
<h1>使用 GET 方法读取数据</h1>
<ul>
    <li>
        <p>
            <b>
                站点名:
            </b>

            <%
                // 解决中文乱码的问题
                String name = new String((request.getParameter("name")).getBytes("ISO-8859-1"),"UTF-8");
            %>
            <%=name
//              request.getParameter("name")
            %>
        </p>
    </li>

    <li>
        <p>
            <b>
                网址：
            </b>
            <%=request.getParameter("url")%>
        </p>
    </li>
</ul>
</body>
</html>
