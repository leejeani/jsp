package com.cust;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.frame.Dao;
import com.frame.SQL;

public class CustDao extends Dao<String, Cust> {

	@Override
	public void insert(Connection con, Cust v) throws Exception {
		PreparedStatement pstmt = null;
		pstmt = con.prepareStatement(SQL.CUST_INSERT);
		pstmt.setString(1, v.getId());
		pstmt.setString(2, v.getPwd());
		pstmt.setString(3, v.getName());
		pstmt.setInt(4, v.getAge());
		pstmt.executeUpdate();
		close(pstmt);
	}

	@Override
	public void delete(Connection con, String v) throws Exception {
		PreparedStatement pstmt = null;
		pstmt = con.prepareStatement(SQL.CUST_DELETE);
		pstmt.setString(1, v);
		pstmt.executeUpdate();
		close(pstmt);
	}

	@Override
	public void update(Connection con, Cust v) throws Exception {
		PreparedStatement pstmt = null;
		pstmt = con.prepareStatement(SQL.CUST_UPDATE);
		pstmt.setString(1, v.getPwd());
		pstmt.setString(2, v.getName());
		pstmt.setInt(3, v.getAge());
		pstmt.setString(4, v.getId());
		pstmt.executeUpdate();
		close(pstmt);
	}

	@Override
	public Cust select(Connection con, String k) throws Exception {
		Cust cust = null;
		PreparedStatement pstmt = null;
		pstmt = con.prepareStatement(SQL.CUST_SELECT);
		pstmt.setString(1, k);
		ResultSet rset = null;
		rset = pstmt.executeQuery();
		rset.next();
		String id = rset.getString("ID");
		String pwd = rset.getString("PWD");
		String name = rset.getString("NAME");
		int age = rset.getInt("AGE");
		cust = new Cust(id, pwd, name, age);
		close(pstmt);
		close(rset);
		return cust;
	}

	@Override
	public ArrayList<Cust> select(Connection con) throws Exception {
		ArrayList<Cust> list = 
				new ArrayList<>();
		
		PreparedStatement pstmt = null;
		pstmt = con.prepareStatement(SQL.CUST_SELECTALL);

		ResultSet rset = null;
		rset = pstmt.executeQuery();
		
		while(rset.next()) {
			Cust cust = null;
			String id = rset.getString("ID");
			String pwd = rset.getString("PWD");
			String name = rset.getString("NAME");
			int age = rset.getInt("AGE");
			cust = new Cust(id, pwd, name, age);
			list.add(cust);
		}
		
		return list;
	}

}






