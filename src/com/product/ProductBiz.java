package com.product;

import java.sql.Connection;
import java.util.ArrayList;

import com.frame.Biz;

public class ProductBiz extends Biz<Integer, Product> {

	ProdcutDao dao;
	
	public ProductBiz() {
		dao = new ProdcutDao();
	}
	
	@Override
	public void register(Product v) throws Exception {
		Connection con  = getCon();
		try {
			dao.insert(con, v);
			con.commit();
		}catch(Exception e) {
			con.rollback();
			throw e;
		}finally {
			close(con);	
		}
		
	}

	@Override
	public void remove(Integer v) throws Exception {
		Connection con  = getCon();
		try {
			dao.delete(con, v);
			con.commit();
		}catch(Exception e) {
			con.rollback();
			throw e;
		}finally {
			close(con);	
		}
	}

	@Override
	public void modify(Product v) throws Exception {
		Connection con  = getCon();
		try {
			dao.update(con, v);
			con.commit();
		}catch(Exception e) {
			con.rollback();
			throw e;
		}finally {
			close(con);	
		}
	}

	@Override
	public Product get(Integer k) throws Exception {
		Connection con  = getCon();
		Product product = null;
		try {
			product = dao.select(con,k);
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);	
		}		
		return product;
	}

	@Override
	public ArrayList<Product> get() throws Exception {
		Connection con  = getCon();
		ArrayList<Product> list = null;
		try {
			list = dao.select(con);
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);	
		}		
		return list;
	}

}







