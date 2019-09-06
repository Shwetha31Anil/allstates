package com.allstate.training.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.allstate.training.pojos.Product;
import com.allstate.training.util.DbUtil;

public class ProductDaoImpl implements ProductDao {
	private Connection con=null;
	 public ProductDaoImpl() {
		con=DbUtil.getConnection();
	}

	@Override
	public int addProduct(Product p) {
		int i=0;	 
		try {
		String sql="insert into product(pname,cost,qty) values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		//ps.setInt(1, p.getProductid());
		ps.setString(1,p.getPname());
		ps.setInt(2, p.getCost());
		ps.setInt(3, p.getQty());
		i=ps.executeUpdate();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return i;
	}

	
	@Override
	public int updateProduct(Product p) {
		int i1=0;
		try {
String sql="update product set qty=?, cost=?, pname=? where productid=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, p.getQty());
			pst.setInt(2, p.getCost());
			pst.setString(3,p.getPname());
			pst.setInt(4, p.getProductid());
			i1= pst.executeUpdate();
		}catch(SQLException e) {e.printStackTrace();}
		return i1;
	}

	
	@Override
	public int updateProductQuantity(int qty, int pid) {
		int i1=0;
		try {
			String sql="update product set qty=? where productid=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, qty);
			pst.setInt(2, pid);
			i1= pst.executeUpdate();
		}catch(SQLException e) {e.printStackTrace();}
		return i1;
	}

	@Override
	public int updateProductCost(int pid, int cost) {
		int i1=0;
		try {
			String sql="update product set cost=? where productid=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, cost);
			pst.setInt(2, pid);
			i1= pst.executeUpdate();
		}catch(SQLException e) {e.printStackTrace();}
		return i1;
	}

	@Override
	public int deleteProduct(int pid) {
		int i1=0;
		try {
			String sql="delete from product where productid=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, pid);
			i1= pst.executeUpdate();
		}catch(SQLException e) {e.printStackTrace();}
		return i1;
	}

	@Override
	public Product getProductById(int pid) {
		Product p1=new Product();
		try {
		String sql="select * from product where productid=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, pid);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			p1.setProductid(rs.getInt(1));
			p1.setPname(rs.getString(2));
			p1.setCost(rs.getInt(3));
			p1.setQty(rs.getInt(4));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return p1;
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products=new ArrayList<>();
		try {
			String sql="select * from product";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				Product p=new Product();
				p.setProductid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setCost(rs.getInt(3));
				p.setQty(rs.getInt(4));
				products.add(p);
			}
		}catch(Exception e) {
			e.printStackTrace();}
		return products;
	}

}
