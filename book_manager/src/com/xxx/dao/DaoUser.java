package com.xxx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.xxx.entity.Book;
import com.xxx.entity.User;
import com.xxx.util.BaseDao;


public class DaoUser {
	public User findProductByName(int username){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from user where username=?");
			pstm.setInt(1, username);
			ResultSet rs=pstm.executeQuery();
			User p=null;
			while(rs.next()){
			}
			return p;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

//	查询
	public User findProductById(int id){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from user where id=?");
			pstm.setInt(1, id);
			ResultSet rs=pstm.executeQuery();
			User p=null;
			while(rs.next()){
				p=new User();
				p.setId(rs.getInt(1));
				p.setUsername(rs.getString(2));
				p.setName(rs.getString(3));
				p.setSex(rs.getString(4));
				p.setPhone(rs.getString(5));
				p.setAddress(rs.getString(6));
				p.setPower(rs.getString(7));
				p.setPassword(rs.getString(8));
				p.setLoginNum(rs.getInt(9));
				System.out.println(p);
				System.out.println("mai");
			}
			return p;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("mai1");
			e.printStackTrace();
			return null;
		}
	}
  /*
	 * 修改商品方法
	 */
	public boolean updateProduct(User user){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("update user set username=?,name=?,sex=?,phone=?,address=?,power=?,password=?,loginNum=? where id=?");
			pstm.setString(1, user.getUsername());			
			pstm.setString(2, user.getName());
			pstm.setString(3, user.getSex());
			pstm.setString(4, user.getPhone());
			pstm.setString(5, user.getAddress());
			pstm.setString(6, user.getPower());
			pstm.setString(7, user.getPassword());
			pstm.setInt(8, user.getLoginNum());
			pstm.setInt(9, user.getId());
            int rs = pstm.executeUpdate();
            System.out.println(rs);
            System.out.println("0000");
            if(rs>0){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("1111");
			return false;
		}
	}
	public User findById(int id){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from user where id=?");
			pstm.setInt(1, id);
			ResultSet rs=pstm.executeQuery();
			User p=null;
			while(rs.next()){
				p=new User();
				p.setId(rs.getInt(1));
				p.setUsername(rs.getString(2));
				p.setName(rs.getString(3));
				p.setSex(rs.getString(4));
				p.setPhone(rs.getString(5));
				p.setAddress(rs.getString(6));
				p.setPower(rs.getString(7));
				p.setPassword(rs.getString(8));
				p.setLoginNum(rs.getInt(9));
				System.out.println(p);
				System.out.println("mai");
			}
			return p;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("mai1");
			e.printStackTrace();
			return null;
		}
	}
	public boolean isExist(int id) {
		
		return findById(id)==null?false:true;
	}
	
	
// public ProductUser findProductById(int reader_id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
