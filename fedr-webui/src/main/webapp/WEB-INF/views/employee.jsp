<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
</head>
<body>
<h1>Employees</h1><br><br>
<form:form id="usersform"  action="" method="post" modelAttribute="user">
    <table id="tbl">
        <thead>
        <tr>
            <th>First name</th>
            <th>Last name</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${user.employees}" var="user">
            <tr>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</form:form>
</body>
</html>
