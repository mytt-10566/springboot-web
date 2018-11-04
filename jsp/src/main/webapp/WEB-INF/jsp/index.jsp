<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>测试JSP</title>
</head>
<body>
<c:if test="${names != null && names.size() > 0}">
    <c:forEach var="name" items="${names}">
        <h3>${name}</h3>
    </c:forEach>
</c:if>
</body>
</html>
