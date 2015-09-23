<%--
  Created by IntelliJ IDEA.
  User: liuqizhe
  Date: 15/9/23
  Time: 下午3:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>updateEmp</title>
</head>
<body>
  <form:form commandName="emp">
    员工名：<form:input path="name"/><br/>
    年龄：<form:input path="age"/><br/>
    简介：<form:textarea path="descr"/><br/>
    性别：<form:radiobutton path="sex" value="m" label="男"/>
    <form:radiobutton path="sex" value="f" label="女"/><br/>
    最喜爱的城市：<form:radiobuttons path="city" items="${cityMap}"/><br/>
    最喜爱的城市：<form:select path="city" items="${cityMap}"/><br/>
    最喜爱的运动：<form:select path="favor">
                  <form:option value="1">爬山</form:option>
                  <form:option value="2">下海</form:option>
                  <form:option value="3">升天</form:option>
                  <form:options items="${cityMap}"/>
                </form:select><br/>
    兴趣爱好：<form:checkbox path="favs" value="a" label="上网"/>
             <form:checkbox path="favs" value="b" label="聊天"/>
            <form:checkbox path="favs" value="c" label="交友"/><br/>
    <form:checkboxes path="cities" items="${cityMap}"/>
  </form:form>
</body>
</html>
