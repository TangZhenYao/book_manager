package com.xxx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	//加载数据库驱动-->数据库连接-->执行Sql语句-->返回结果记录集
	static {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static Connection getCon() {
	String url="jdbc:mysql://127.0.0.1:3306/book_manage_system?useUnicode=true&characterEncoding=UTF-8";
	String username="root";
	String password="root";
	try {
		Connection conn=DriverManager.getConnection(url, username, password);
		return conn;
	} catch (SQLException e) {
		e.printStackTrace();
		return null;
	}	
}

}
