<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: gaodun
  Date: 2018/11/8
  Time: 下午2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>从复选框中读取数据</title>
</head>
<body>
    <h1>从复选框中读取数据</h1>

<%--<ul>--%>
    <%--<li>--%>
        <%--<p>--%>
            <%--<b>谷哥是否选中：</b>--%>
            <%--<%=request.getParameter("google")%>--%>
        <%--</p>--%>
    <%--</li>--%>
    <%--<li>--%>
        <%--<p>--%>
            <%--<b>百度是否选中：</b>--%>
            <%--<%=request.getParameter("baidu")%>--%>
        <%--</p>--%>
    <%--</li>--%>
    <%--<li>--%>
        <%--<p>--%>
            <%--<b>淘宝是否选中：</b>--%>
            <%--<%=request.getParameter("taobao")%>--%>
        <%--</p>--%>
    <%--</li>--%>
<%--</ul>--%>

    <h1>读取所有表单参数</h1>
    <table width="100%" border="1" align="center">
        <tr bgcolor="#949494">
            <th>参数名</th><th>参数值</th>
        </tr>
            <%
   Enumeration paramNames = request.getParameterNames();

   while(paramNames.hasMoreElements()) {
      String paramName = (String)paramNames.nextElement();
      System.out.print("<tr><td>" + paramName + "</td>\n");
      String paramValue = request.getParameter(paramName);
      System.out.println("<td> " + paramValue + "</td></tr>\n");
   }
%>
</body>
</html>
