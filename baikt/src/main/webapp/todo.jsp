<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>To-Do List</title></head>
<body>
<h2>To-Do List</h2>
<form action="todo" method="post">
    <input type="text" name="task" required />
    <input type="hidden" name="action" value="add" />
    <button type="submit">Thêm</button>
</form>

<ul>
    <c:forEach var="task" items="${sessionScope.todoList}">
        <li>
            ${task}
            <form action="todo" method="post" style="display:inline;">
                <input type="hidden" name="task" value="${task}" />
                <input type="hidden" name="action" value="remove" />
                <button type="submit">Xóa</button>
            </form>
        </li>
    </c:forEach>
</ul>

<a href="logout.jsp">Đăng xuất</a>
</body>
</html>
