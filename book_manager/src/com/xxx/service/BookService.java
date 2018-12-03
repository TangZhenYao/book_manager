package com.xxx.service;

import java.util.List;

import com.xxx.dao.DaoBook;
import com.xxx.entity.Book;


public class BookService {
//	public class ProductService {
		//实例化数据访问层对象
		DaoBook pd=new DaoBook();
		/*
		 * 验证查询商品方法<根据id>
		 */
		public Book findProductById(int id){
			Book p=null;
			p=pd.findProductById(id);
			return p;
		}
		/*
		 * 验证查询商品方法
		 */
		public List<Book> findAll() {
			List<Book> list=pd.findAll();
			return list;
		}
		/*
		 * 验证使用分页查询商品方法	
		 */
		public List<Book> findByPage(int pageNum, int pageSize){
			List<Book> list=pd.findByPage(pageNum, pageSize);
			return list;
		}
		/*
		 * 验证商品总数方法	
		 */
		public int findCountByPage(){
			int count=pd.findCountByPage();
			return count;
		}
		/*
		 * 验证商品添加方法	
		 */
		public boolean addProduct(Book p){
			if(!pd.isExist((p.getBook_name()))){
				pd.addProduct(p);
				return true;
			}else{
				System.out.println("此商品已存在");
				return false;
			}
			
		}
		
		 /* 
		  * 验证商品修改方法	
		  */
		 
		public boolean updateProduct(Book p){
			if(pd.isExist(p.getBook_id())){
				pd.updateProduct(p);
				return true;
			}else{
				return false;
			}
		}
		
		 /*
		  * * 验证商品删除方法	
		  */
		 
		public boolean deleteProduct(int id){
			if(pd.isExist(id)){
				pd.deleteProductByid(id);
				return true;
			}else{
				return false;
			}
		}
		 // 删除购物车中购物项
//	    public void deleteCartItem(int id, Cart cart) {
//	        cart.getMap().remove(id);
//	    }
	    // 清空购物车
//	    public void clearCart(Cart cart) {
//	        cart.getMap().clear();
//	    }

}
