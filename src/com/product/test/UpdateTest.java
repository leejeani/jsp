package com.product.test;

import com.product.Product;
import com.product.ProductBiz;

public class UpdateTest {

	public static void main(String[] args) {
		ProductBiz biz = new ProductBiz();
		Product product = 
		new Product(
		101,"Shirts", 30000, "bb.jpg");
		
		try {
			biz.modify(product);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
		}
	}

}
