package com.xxx.service;

import java.util.List;

import com.xxx.dao.DaoBorrow;
//import com.xxx.entity.ProductBook;
import com.xxx.entity.Borrow;

public class BorrowService {
	//实例化数据访问层对象
			DaoBorrow pd=new DaoBorrow();
			/*
			 * 验证查询商品方法<根据id>
			 */
			public Borrow findProductById(int book_id){
				Borrow p=null;
				p=pd.findProductById(book_id);
				return p;
			}
}
