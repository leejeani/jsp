package com.frame;

public class SQL {
	public static String CUST_INSERT =
		"INSERT INTO TB_CUST VALUES(?,?,?,?)";
	public static String CUST_UPDATE =
		"UPDATE TB_CUST SET PWD=?, NAME=?, AGE=? WHERE ID=?";
	public static String CUST_DELETE =
		"DELETE FROM TB_CUST WHERE ID = ?";
	public static String CUST_SELECT =
		"SELECT * FROM TB_CUST WHERE ID = ?";
	public static String CUST_SELECTALL =
		"SELECT * FROM TB_CUST";
	
	public static String PRODUCT_INSERT =
	"INSERT INTO TB_PRODUCT "
	+ "VALUES(PRO_SEQ.NEXTVAL,?,?,SYSDATE,?)";
	public static String PRODUCT_DELETE =
	"DELETE FROM TB_PRODUCT WHERE ID = ?";
	public static String PRODUCT_UPDATE =
	"UPDATE TB_PRODUCT SET "
	+ "NAME=?, PRICE=?, IMGNAME=? WHERE ID=?";
	public static String PRODUCT_SELECT =
	"SELECT * FROM TB_PRODUCT WHERE ID = ?";
	public static String PRODUCT_SELECTALL =
	"SELECT * FROM TB_PRODUCT";
}






