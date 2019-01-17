/**
 * 
 */
package com.zyz.empSys.dao;

import java.util.List;

import com.zyz.empSys.domain.Emp;

/**
 *emp对象的dao接口
 *@
 */
public interface IEmpDao {


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
	 * @return
	 */
	boolean AddEmp(Emp all);

	/**
	 * 修改一个用户的值
	 * @param id
	 * @return
	 */
	boolean modify(Emp id);

	

}
