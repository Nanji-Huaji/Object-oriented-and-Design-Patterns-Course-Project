<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<p>字符串组合结果是:
<p>
<s:property value="retVal" />
<s:property value="#request.retVal"/>
<table border='1'>
  <tr>
    <th>序号</th>
    <th>姓名</th>
    <th>密码</th>
  </tr>
  <s:iterator value="listUser" status="status">
    <tr>
      <td><s:property value="#status.count"/></td>
      <td><s:property value="username"/></td>
      <td><s:property value="password"/></td>
    </tr>
  </s:iterator>
<table>
</body>
</html>