package me.cuale.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/client/menu")
public class ClientMenuServlet extends HttpServlet{
	private static final long serialVersionUID = 3275744490130764538L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    
		response.getWriter().write("");
    }
}