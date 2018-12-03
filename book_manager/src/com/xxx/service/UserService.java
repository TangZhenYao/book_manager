package com.xxx.service;

import java.util.List;

import com.xxx.dao.DaoUser;
import com.xxx.entity.Book;
import com.xxx.entity.User;

public class UserService {
	//实例化数据访问层对象
	DaoUser pd=new DaoUser();
			/*
			 * 验证查询商品方法<根据name>
			 */
			public User findProductById(int id){
				User p=pd.findProductById(id);
				return p;
			}
			
			public User findProductByName(int username) {
				// TODO Auto-generated method stub
				User p=pd.findProductByName(username);
				return null;
			}
			/* 
			  * 验证商品修改方法	
			  */
			public boolean updateProduct(User p){
				if(pd.isExist(p.getId())){
					pd.updateProduct(p);
					return true;
				}else{
					return false;
				}
			}

			
}
