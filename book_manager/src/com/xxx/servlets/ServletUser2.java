package com.xxx.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.xxx.entity.User;
import com.xxx.service.UserService;

/**
 * 实现修改功能前的Servlet-->查询到修改的对象
 */
@WebServlet("/user2")
public class ServletUser2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUser2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取业务逻辑层对象，修改是先查询到该对象然后修改
				int id=Integer.parseInt(request.getParameter("id"));
				System.out.println("id"+id);
				UserService ps=new UserService();
				User p=ps.findProductById(id);
				request.setAttribute("product", p);
				request.getRequestDispatcher("user2.jsp").forward(request, response);
//		request.getRequestDispatcher("user2.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
