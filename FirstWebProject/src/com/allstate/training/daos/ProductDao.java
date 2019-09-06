package com.allstate.training.daos;

import java.util.List;

import com.allstate.training.pojos.Product;

public interface ProductDao {
	public int addProduct(Product p);
	public int updateProductQuantity(int qty,int pid);
	public int updateProductCost(int pid,int cost);
	public int deleteProduct(int pid);
	public Product getProductById(int pid);
	public List<Product> getProducts();
	public int updateProduct(Product p);
	

}
