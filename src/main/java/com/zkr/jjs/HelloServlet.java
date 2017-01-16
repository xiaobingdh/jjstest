package com.zkr.jjs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("======1111=======");
		req.setAttribute("username", "jjs");
		req.getRequestDispatcher("/hellogit.jsp").forward(req, resp);
	}
}	
