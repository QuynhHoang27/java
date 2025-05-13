package com.example.todo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TodoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String task = request.getParameter("task");

        HttpSession session = request.getSession();
        List<String> todoList = (List<String>) session.getAttribute("todoList");

        if (todoList == null) {
            todoList = new ArrayList<>();
        }

        if ("add".equals(action) && task != null && !task.trim().isEmpty()) {
            todoList.add(task);
        } else if ("remove".equals(action)) {
            todoList.remove(task);
        }

        session.setAttribute("todoList", todoList);
        response.sendRedirect("todo.jsp");
    }
}
