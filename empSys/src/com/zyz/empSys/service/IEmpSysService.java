/**
 * 
 */
package com.zyz.empSys.service;

import java.util.List;

import com.zyz.empSys.domain.Emp;

/**
*empSys的servlet的服务接口
 */
public interface IEmpSysService {

	/**
	 * 登陆验证，通过验证名称和密码来查找用户
	 * @param name
	 * @param password
	 * @return
	 */
	Emp findEmpByNameAndPassword(String name, String password);

	/**
	 * 查找所有员工信息
	 */
	List<Emp> findAll();

	/**
	 * 添加一个用户
	 * @param all 
	 */
	boolean AddEmp(Emp all);

	/**
	 * 
	 */
	boolean modify(Emp id);

	
	


	

}
