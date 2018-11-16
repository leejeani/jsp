package com.cust.test;

import com.cust.Cust;
import com.cust.CustBiz;

public class DeleteTest {

	public static void main(String[] args) {
		CustBiz biz = new CustBiz();
		try {
			biz.remove("id01");
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("FAIL");
		}
	}

}
