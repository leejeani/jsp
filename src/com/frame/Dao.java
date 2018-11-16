package com.frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class Dao<K,V> {
	public void close(PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(ResultSet rset) {
		if(rset != null) {
			try {
				rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public abstract void insert(Connection con,V v) throws Exception;
	public abstract void delete(Connection con,K v) throws Exception;
	public abstract void update(Connection con,V v) throws Exception;
	public abstract V select(Connection con,K k) throws Exception;
	public abstract ArrayList<V> select(Connection con) throws Exception;
}














