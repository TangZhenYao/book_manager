package com.xxx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.xxx.entity.Book;
import com.xxx.entity.Borrow;
import com.xxx.util.BaseDao;

public class DaoBorrow {
	/*
	 * 根据id查询相应商品
	 */
	public Borrow findProductById(int book_id){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from borrow where book_id=?");
			pstm.setInt(1, book_id);
			ResultSet rs=pstm.executeQuery();
			Borrow p=null;
			while(rs.next()){
				p=new Borrow();
				p.setId(rs.getInt(1));
				p.setBook_id(rs.getInt(2));
				p.setBorrowtime(rs.getString(3));
				p.setReturntime(rs.getString(4));
				System.out.println(p);
			}
			return p;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
