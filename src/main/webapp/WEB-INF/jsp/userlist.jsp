<%@page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>This is SpringMVC demo page</h2>
<c: forEach item="${users}" var="user">
    <c:out value="${user.username}" /><br/>
    <c:out value="${user.age}" /><br/>
</c: forEach>