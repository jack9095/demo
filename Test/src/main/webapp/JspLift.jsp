<%--
  Created by IntelliJ IDEA.
  User: gaodun
  Date: 2018/11/7
  Time: 下午3:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jsp生命周期</title>
</head>
<body>

    <%!
        private int initVar = 0;
        private int serviceVar = 0;
        private int destoryVar = 0;
    %>

    <%!
        public void jspInit(){
        initVar++;
        System.out.println("jsp初始化了" + initVar + "次");

        }

        public void jspDestory(){
            destoryVar++;
            System.out.println("jsp销毁了" + destoryVar + "次");
        }
    %>

    <%
        serviceVar++;
        System.out.println("JSP共响应了" + serviceVar + "次请求");
        String content1 = "初始化了" + initVar + "次";
        String content2 = "响应了" + serviceVar + "次";
        String content3 = "销毁了" + destoryVar + "次";
    %>

    <h1>菜鸟教程 JSP 测试实例</h1>
    <p><%=content1%></p>
    <p><%=content2%></p>
    <p><%=content3%></p>
</body>
</html>
