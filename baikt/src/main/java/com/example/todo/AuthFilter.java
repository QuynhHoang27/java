package com.example.todo;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;


import java.io.IOException;

public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession session = request.getSession(false);

        String uri = request.getRequestURI();

        boolean isLoginPage = uri.endsWith("login.jsp") || uri.endsWith("login");
        boolean loggedIn = session != null && session.getAttribute("loggedIn") != null;

        if (loggedIn || isLoginPage) {
            chain.doFilter(req, res);
        } else {
            response.sendRedirect("login.jsp");
        }
    }

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
