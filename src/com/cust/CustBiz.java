package com.cust;

import java.sql.Connection;
import java.util.ArrayList;

import com.frame.Biz;

public class CustBiz extends Biz<String, Cust> {

	CustDao dao;
	
	public CustBiz() {
		dao = new CustDao();
	}
	
	@Override
	public void register(Cust v) throws Exception {
		Connection con = getCon();
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
	public void remove(String v) throws Exception {
		Connection con = getCon();
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
	public void modify(Cust v) throws Exception {
		Connection con = getCon();
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
	public Cust get(String k) throws Exception {
		Cust cust = null;
		Connection con = getCon();
		try {
			cust = dao.select(con, k);
		}catch(Exception e) {
			throw e;
		}finally {
			close(con);	
		}
		return cust;
	}

	@Override
	public ArrayList<Cust> get() throws Exception {
		ArrayList<Cust> list = null;
		Connection con = getCon();
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





