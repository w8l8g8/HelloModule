package com.xajiusuo.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet(
		description = "Point to a JSP file", 
		urlPatterns = { "/ShowServlet" }, 
		initParams = { 
				@WebInitParam(name = "kehu", value = "kehuduan")
		})
public class ShowServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append(request.getHeader("User-Agent"));
		request.setAttribute("kehu", new Dog(this.getInitParameter("kehu")));
		request.setAttribute("dogBreed", this.getServletContext().getInitParameter("breed"));
		RequestDispatcher view = request.getRequestDispatcher("/show.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
