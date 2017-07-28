package com.xajiusuo.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet(
		description = "Save User", 
		urlPatterns = { "/Ins1/saveUser.do" }, 
		initParams={
				@WebInitParam(name="developer", value="Yu Honglei")
				})

public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
//		response.setHeader("Encoding", "utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("user");
		out.println("中文显示正常" + "<br>");
		out.println("Developer" + getServletConfig().getInitParameter("developer") + "<br>");
		out.println("User name is: " + name + "<br>");
		String age = request.getParameter("age");
		out.println("User age is: " + age + " ");
		YoungModel youngModel = new YoungModel();
		out.println(youngModel.young(age) + "<br>");
		String[] interest = request.getParameterValues("interest");
		out.println("Your interests are: " + interest[0] + " " + interest[1] + "<br>");
	}

}
