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
 * 实现最终修改功能的Servlet
 */
@WebServlet("/user")
public class ServletUser2_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUser2_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取修改页面的请求参数，然后调用业务逻辑层对象，实现最终修改
				request.setCharacterEncoding("UTF-8");
				response.setCharacterEncoding("UTF-8");
				response.setContentType("text/html; charset=UTF-8");
				int id=Integer.parseInt(request.getParameter("id"));
				String username=request.getParameter("username");
				String name=request.getParameter("name");
				String sex=request.getParameter("sex");
				String phone=request.getParameter("phone");
				String address=request.getParameter("address");
				String power=request.getParameter("power");
				String password=request.getParameter("password");
				int loginNum=Integer.parseInt(request.getParameter("loginNum"));
				User p=new User(id, username, name, sex, phone, address, power, password,loginNum);
				UserService ps=new UserService();
				boolean result=ps.updateProduct(p);
				if(result){
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}else{
					response.sendRedirect("user2.jsp");
				}
//				request.getRequestDispatcher("user").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
