package com.xxx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.xxx.entity.Book;
import com.xxx.util.BaseDao;


public class DaoBook {
	
	/*
	 * 添加商品方法
	 */
	public boolean addProduct(Book p){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("insert into book(book_name,author,press) values(?,?,?)");
			pstm.setString(1, p.getBook_name());
			pstm.setString(2, p.getAuthor());
			pstm.setString(3, p.getPress());
			int rs = pstm.executeUpdate();
			if(rs>0){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
		
	/*
	 * 修改商品方法
	 */
	public boolean updateProduct(Book book){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("update book set book_name=?,author=?,press=? where book_id=?");
			pstm.setString(1, book.getBook_name());
			pstm.setString(2, book.getAuthor());
			pstm.setString(2, book.getPress());
			pstm.setInt(4, book.getBook_id());
            int rs = pstm.executeUpdate();
            System.out.println(rs);
            if(rs>0){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	/*
	 * 删除商品方法<根据id>
	 */
	public boolean deleteProductByid(int book_id){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("delete from book where book_id=?");
			pstm.setInt(1, book_id);
			int rs=pstm.executeUpdate();
			if(rs>0){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	/*
	 * 验证该商品是否存�?<根据id>
	 */
	public boolean isExist(int book_id){
		return findProductById(book_id)==null?false:true;
	}
	/*
	 * 验证该商品是否存�?<根据name>
	 */
	public boolean isExist(String book_name){
		return findProductByName(book_name)==null?false:true;
	}
	/*
	 * 根据id查询相应商品
	 */
	public Book findProductById(int book_id){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from book where book_id=?");
			pstm.setInt(1, book_id);
			ResultSet rs=pstm.executeQuery();
			Book p=null;
			while(rs.next()){
				p=new Book();
				p.setBook_id(rs.getInt(1));
				p.setBook_name(rs.getString(2));
				p.setAuthor(rs.getString(3));
				p.setPress(rs.getString(4));
				System.out.println(p);
				System.out.println("mai");
			}
			return p;
		}catch(Exception e){
			System.out.println("mai1");
			e.printStackTrace();
			return null;
		}
	}
	/*
	 * 根据name查询相应商品
	 */
	public Book findProductByName(String book_name){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from book where book_name=?");
			pstm.setString(1, book_name);
			ResultSet rs=pstm.executeQuery();
			Book p=null;
			while(rs.next()){
			}
			return p;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * 查询全部商品的方�?
	 */
	public List<Book> findAll(){
		try{
			List<Book> list=new ArrayList<Book>();
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from book");
			ResultSet rs=pstm.executeQuery();
			Book p=null;
			while(rs.next()){
				p=new Book(0, null, null, null);
				p.setBook_id(rs.getInt(1));
				p.setBook_name(rs.getString(2));
				p.setAuthor(rs.getString(3));
				p.setPress(rs.getString(4));
				list.add(p);
				System.out.println(p);
			}
			
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/*
	 * 统计商品总数
	 * @return
	 */
	public int findCountByPage(){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select count(book_id) from book");
			ResultSet rs=pstm.executeQuery();
			int count=0;
			while(rs.next()){
				count=rs.getInt(1);
			}
			return count;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
		
	}
	
	/*
	 * 分页查询数据
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public List<Book> findByPage(int pageNum, int pageSize){
		try{
			List<Book> list=new ArrayList<Book>();
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from book limit ?,?");
			pstm.setInt(1, (pageNum-1)*pageSize);
			pstm.setInt(2, pageSize);
			ResultSet rs=pstm.executeQuery();
			Book p=null;
			while(rs.next()){
				list.add(p);
				System.out.println(p);
			}
			
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
