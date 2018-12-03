package com.xxx.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.xxx.entity.Book;
import com.xxx.entity.Borrow;
//import com.xxx.dao.product.ProductDaoBook;
import com.xxx.service.BookService;
import com.xxx.service.BorrowService;
import com.xxx.service.UserService;

/**
 * Servlet implementation class ServletBorrow
 */
@WebServlet("/ServletBorrow")
public class ServletBorrow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletBorrow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ProductBorrowService ps=new ProductBorrowService();
//		int book_id=0;
//		List<ProductBorrowService> list=new ArrayList<ProductBorrowService>();
//		 list=ps.findProductById(book_id);
//		request.setAttribute("reader", list);
//		request.getRequestDispatcher("reader.jsp").forward(request, response);
//		
		BorrowService ps=new BorrowService();
		int book_id=0;
		List<Borrow> list=new ArrayList<Borrow>();
		list.add(ps.findProductById(1));
		ps.findProductById(book_id);
		request.setAttribute("borrow", list);
		System.out.println("list="+list);
		request.getRequestDispatcher("borrow.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
