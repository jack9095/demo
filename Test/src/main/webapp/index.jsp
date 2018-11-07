<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是第一个jsp</title>
</head>
<body>
    <h2>Hello World!fly</h2>
    <input type="submit"value="登录"name="denglu">
    <%--<jsp:include page="JspLift.jsp" flush="true" />--%>
    <%--类似于重定向的作用--%>
    <jsp:forward page="one.jsp" />
</body>
</html>
