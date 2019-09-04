package com.allstates.training.view;

import java.util.List;
import java.util.Scanner;

import com.allstates.training.Dao.ProductDao;
import com.allstates.training.Dao.ProductDaoImpl;
import com.allstates.training.pojos.Product;

public class ProductApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductDao productDao=new ProductDaoImpl();
		do {
		System.out.println("welcome 1. Add Product \n2. Update Product Cost \n"
				+ "3. Update Product qty \n 4. Delete Product \n 5.GetProductById\n 6.GetAll");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("enter the product details(id,name,cost,qty)");
		       Product p=new Product();
		       p.setProductid(sc.nextInt());
		       p.setPname(sc.next());
		       p.setCost(sc.nextInt());
		       p.setQty(sc.nextInt());
		       int i= productDao.addProduct(p);
		       if(i>0) System.out.println("product is added");
		       else System.out.println("product is not added");
			break;
		case 2: System.out.println("enter product id which you want to update");
				System.out.println("enter cost to update");
				int i1 =productDao.updateProductCost(sc.nextInt(), sc.nextInt());
				 if(i1>0) System.out.println(i1+"product is updated");
			       else System.out.println("product is not updated");
				 break;
		case 3: System.out.println("enter product id which you want to update");
		System.out.println("enter qty to update");
		int i2 =productDao.updateProductQuantity(sc.nextInt(), sc.nextInt());
		 if(i2>0) System.out.println(i2+"product is updated");
	       else System.out.println("product is not updated");
		 break;
		case 4: System.out.println("Enter id to delete the product");
		int i3=productDao.deleteProduct(sc.nextInt());
		 if(i3>0) System.out.println(i3+"product is deleted");
	       else System.out.println("product is not deleted");
		break;
		case 5:System.out.println("enter product id which should display");
		Product p2=productDao.getProductById(sc.nextInt());
		System.out.println(p2.getProductid()+" "+p2.getPname()+"");
		case 6: System.out.println("Products");
				System.out.println("--------------------------------");
				List<Product> products=productDao.getProducts();
				System.out.println("pid   |pname |cost |qty");
				for(Product pr:products) {
					System.out.println(pr.getProductid()+"   | "+pr.getPname()+"  | "+
				pr.getCost()+" |"+pr.getQty());
				}
				break;
		default: System.out.println("invalid option");	
		}
		}while(true);
	}

}
