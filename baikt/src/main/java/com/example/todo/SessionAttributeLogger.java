package com.example.todo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;


public class SessionAttributeLogger implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        if ("todoList".equals(event.getName())) {
            System.out.println("todoList đã được thêm vào session.");
        }
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        if ("todoList".equals(event.getName())) {
            System.out.println("todoList đã được cập nhật.");
        }
    }

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
