package com.zyz.empSys.web;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zyz.empSys.domain.Emp;
import com.zyz.empSys.service.IEmpSysService;
import com.zyz.empSys.service.impl.EmpSysService;

/**
 * 员工修改的servlet
 */
@WebServlet("/ModifyServlet")
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		         // 获取全局参数配置
				ServletContext context = request.getServletContext();
				String encoding = context.getInitParameter("encoding");

				// 设置请求编码格式
				request.setCharacterEncoding(encoding);
				// 设置响应格式
				response.setContentType("text/html;charset=" + encoding);
				// 获取请求参数
				String id = request.getParameter("id");
				String name = request.getParameter("name");
				String password = request.getParameter("password");
				String gender = request.getParameter("gender");
				String age = request.getParameter("age");
				String hiredate = request.getParameter("hiredate");
				String phone = request.getParameter("phone");
				String email = request.getParameter("email");

				// 将所有信息封装成一个对象
				Emp All = new Emp(Integer.parseInt(id), name, password, gender, Integer.parseInt(age), Date.valueOf(hiredate),
						phone, email);

				IEmpSysService service = new EmpSysService();
				service.modify(All);
				
    request.getRequestDispatcher("/modify.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
