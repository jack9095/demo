<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: gaodun
  Date: 2018/11/8
  Time: 上午10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*,java.util.*" %>
<html>
<head>
    <title>http信息头示例</title>
</head>
<body>

    <H1>http头部请求示例</H1>
    <table width="100%" border="1" align="center">
        <tr bgcolor="#949494">
            <th>Header Name</th><th>Header Value(s)</th>
        </tr>

        <%
            Enumeration headerNames = request.getHeaderNames();
            while(headerNames.hasMoreElements()) {
                String paramName = (String)headerNames.nextElement();
                System.out.print("<tr><td>" + paramName + "</td>\n");
                String paramValue = request.getHeader(paramName);
                System.out.println("<td> " + paramValue + "</td></tr>\n");
            }
        %>
    </table>
</body>
</html>
