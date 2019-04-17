<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 19-4-13
  Time: 上午10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--获取绝对路径--%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <title>测试vue.js</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/vue/2.1.8/vue.min.js"></script>
    <script type="text/javascript" src="${ctx}/static/myjs/test.js"></script>
</head>
<body>

<div id="app">
    <p>{{ message }}</p>
</div>

</body>
</html>
