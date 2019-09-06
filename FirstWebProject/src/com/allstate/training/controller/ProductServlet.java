package com.allstate.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.allstate.training.daos.ProductDao;
import com.allstate.training.daos.ProductDaoImpl;
import com.allstate.training.pojos.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     ProductDao productDao=new ProductDaoImpl();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//http 1.1
		response.setHeader("Pragma", "no-cache");//all browser
		response.setHeader("Expires", "0");//proxies
		PrintWriter out=response.getWriter();
		try {
		HttpSession session=request.getSession(false);
		String sname=session.getAttribute("sname").toString();
		session.getLastAccessedTime();//last accessed time
		session.setMaxInactiveInterval(30*60*60);//auto logout
		out.print(sname);
		RequestDispatcher rd=request.getRequestDispatcher("menu.html");
		rd.include(request, response);
		List<Product> products=productDao.getProducts();
		
		out.print("<table border='1'><tr>");
		out.print("<th>Product Id</th>");
		out.print("<th>Product Name</th>");
		out.print("<th>Cost</th>");
		out.print("<th>Quantity</th>");
		out.print("</tr>");
		for(Product p:products) {
		out.print("<tr>");
		out.print("<td>"+p.getProductid()+"</td>");
		out.print("<td>"+p.getPname()+"</td>");
		out.print("<td>"+p.getCost()+"</td>");
		out.print("<td>"+p.getQty()+"</td>");
		out.print("<td><a href='edit?pid="+p.getProductid()+"'>Edit</td>");
		out.print("<td><a href='delete?pid="+p.getProductid()+"'>Delete</td>");
		out.print("</tr>");
		}
		out.print("</table>");
		}catch(NullPointerException e) {
			out.print("Please login first");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
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
