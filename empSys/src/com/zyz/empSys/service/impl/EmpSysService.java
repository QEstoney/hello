/**
 * 
 */
package com.zyz.empSys.service.impl;

import java.util.List;

import com.zyz.empSys.dao.IEmpDao;
import com.zyz.empSys.dao.impl.EmpDao;
import com.zyz.empSys.domain.Emp;
import com.zyz.empSys.service.IEmpSysService;

/**
 * @author Administrator
 *@2019年1月14日
 *@
 *@类说明
 *
 *@
 */
public class EmpSysService implements IEmpSysService {

	IEmpDao dao=new EmpDao();
	
	@Override
	public Emp findEmpByNameAndPassword(String name, String password) {
		return dao.findEmpByNameAndPassword(name,password);
	}

	
	@Override
	public List<Emp> findAll() {
		return dao.findAll();
	}


	@Override
	public boolean AddEmp(Emp all) {
		return dao.AddEmp(all);
	}


	@Override
	public boolean modify(Emp id) {
		return dao.modify(id);
	}

}
