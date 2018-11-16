package com.product.test;

import com.product.Product;
import com.product.ProductBiz;

public class SelectTest {

	public static void main(String[] args) {
		ProductBiz biz = new ProductBiz();
		Product product = null;
		try {
			product = biz.get(101);
			System.out.println("ok");
			System.out.println(product);
		} catch (Exception e) {
			System.out.println("fail");
			e.printStackTrace();
		}
		
	}

}



