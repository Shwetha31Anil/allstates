package com.allstate.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
	String email=request.getParameter("email");
	String pass= request.getParameter("pass");
	if(email.contains("allstate")) {
		pw.print("Welcome "+email);
		HttpSession session=request.getSession();
		session.setAttribute("sname", email);
		RequestDispatcher rd=request.getRequestDispatcher("menu.html");
		rd.include(request, response);
	}else {
		
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		rd.include(request, response);
		//response.sendRedirect("https://www.hdfcbank.com/assets/popuppages/netbanking.htm");
		pw.print("Invalid credentials");
		///HttpSession session=request.getSession();
		//String str=(String)session.getAttribute("sname");
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
