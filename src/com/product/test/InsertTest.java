package com.product.test;

import com.product.Product;
import com.product.ProductBiz;

public class InsertTest {

	public static void main(String[] args) {
		ProductBiz biz = new ProductBiz();
		Product product = 
		new Product("id10", 10000, "aa.jpg");
		
		try {
			biz.register(product);
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}
		
	}

}



