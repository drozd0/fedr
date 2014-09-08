<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form id="login-form" action="/authenticate" method="post">

    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='email' value=''>
            </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password' />
            </td>
        </tr>
        <c:if test="${param.error != null}">
            <div>
                Неверный логин или пароль
            </div>
        </c:if>
        <tr>
            <td><input name="submit" type="submit"
                       value="submit" />
            </td>
            <td><input name="reset" type="reset" />
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
