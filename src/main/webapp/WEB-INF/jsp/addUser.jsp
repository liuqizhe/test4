<%--
  Created by IntelliJ IDEA.
  User: liuqizhe
  Date: 15/9/22
  Time: 下午4:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>add</title>
</head>
<body>
    <form:form action="add.from" commandName="user" method="post">
      <form:errors path="*" cssStyle="color:red"/><hr/>

      用户名：
      <form:input path="username"/>
      <form:errors path="username" cssStyle="color:red"/><br/>

      密码：
      <form:input path="password"/>
      <form:errors path="password" cssStyle="color:red"/><br/>

      手机号码：
      <form:input path="telephone"/>
      <form:errors path="telephone" cssStyle="color:red"/><br/>

      <input type="submit" value="注册"/>
    </form:form>
</body>
</html>
