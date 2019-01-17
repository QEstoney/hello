/**
 * 
 */
package com.zyz.empSys.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zyz.empSys.domain.Emp;
import com.zyz.empSys.service.IEmpSysService;
import com.zyz.empSys.service.impl.EmpSysService;

/**
 *登录页面的servlet
 */
//@WebServlet("/login1")
@WebServlet("/loginservlet")
@SuppressWarnings("serial")
public class Loginservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获取全局参数配置
		ServletContext context = request.getServletContext();
		String encoding = context.getInitParameter("encoding");

		// 设置请求编码格式
		request.setCharacterEncoding(encoding);
		// 设置响应格式
		response.setContentType("text/html;charset=" + encoding);

		// 获取请求参数
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		//获取用户输入的验证码
		String validate=request.getParameter("validate");
		
		//获取session的验证码
		String val_in_session=(String)request.getSession().getAttribute("validate");
       
		if(!val_in_session.equalsIgnoreCase(validate)) {
			request.setAttribute("val_msg","验证码有误，请重新输入");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		   return ;
		}
		
		
		// 调用service中的方法进行登录
		IEmpSysService service = new EmpSysService();
		// service.longin(name, password);
		// 登录验证, 通过名称和密码来查找用户
		Emp emp = service.findEmpByNameAndPassword(name, password);

		if (emp != null) {
			// 把登录用户存入到session中, 表示开启了一次会话
			HttpSession session = request.getSession();
			session.setAttribute("emp", emp);

			response.getWriter().write("登录成功, 3s后回到主页...");
			

			response.sendRedirect(context.getContextPath() + "/index.jsp");

			return;
		} else {
			// 请求转发, 把错误信息转发到前端页面进行展示

			request.setAttribute("error_msg", "账号或密码有误, 请检查后登录");

			request.getRequestDispatcher("/login.jsp").forward(request, response);

			return;
		}

	}

	/*
	 * 
	 * @see
	 * javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
