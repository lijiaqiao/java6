<%--
  Created by IntelliJ IDEA.
  User: jin
  Date: 2018/12/19
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="account">
        ${account.id}   &nbsp;&nbsp;&nbsp; ${account.name}  &nbsp;&nbsp;&nbsp;${account.money}  <br>
     </c:forEach>
</body>
</html>
