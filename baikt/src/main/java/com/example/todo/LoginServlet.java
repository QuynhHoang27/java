package com.example.todo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;


import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("loggedIn", true);
        response.sendRedirect("todo.jsp");
    }
}
