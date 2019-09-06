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

import com.allstate.training.daos.ProductDao;
import com.allstate.training.daos.ProductDaoImpl;
import com.allstate.training.pojos.Product;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/add")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ProductDao productDao=new ProductDaoImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);
		String sname=session.getAttribute("sname").toString();
		out.print(sname);
		Product p=new Product();
		String pid=request.getParameter("pid");
		//p.setProductid(Integer.parseInt(request.getParameter("pid")));
		p.setPname(request.getParameter("pname"));
		p.setCost(Integer.parseInt(request.getParameter("cost")));
		p.setQty(Integer.parseInt(request.getParameter("qty")));
		
		if(pid.isEmpty()) {
		int i=productDao.addProduct(p);
		if(i>0) {
			RequestDispatcher rd=request.getRequestDispatcher("product");
		rd.forward(request, response);
		}else {
	//		PrintWriter out=response.getWriter();
			out.print("Product not added");
			RequestDispatcher rd1=request.getRequestDispatcher("addproduct.jsp");
			rd1.include(request, response);
		}
		}else {
			p.setProductid(Integer.parseInt(pid));
			int i=productDao.updateProduct(p);
			if(i>0) {
				RequestDispatcher rd=request.getRequestDispatcher("product");
			rd.forward(request, response);
			}else {
				out.print("Product not updated");
				RequestDispatcher rd1=request.getRequestDispatcher("addproduct.jsp");
				rd1.include(request, response);
			}
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
