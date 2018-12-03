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
import com.xxx.service.BookService;
import com.xxx.service.BorrowService;
import com.xxx.service.UserService;

/**
 * Servlet implementation class ServletBook
 */
@WebServlet("/ServletBook")
public class ServletBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService ps=new BookService();
		int book_id=0;
		List<Book> list=new ArrayList<Book>();
		list.add(ps.findProductById(1));
//		ps.findProductById(1);
		request.setAttribute("book", list);
		System.out.println("list="+list);
		request.getRequestDispatcher("book.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
