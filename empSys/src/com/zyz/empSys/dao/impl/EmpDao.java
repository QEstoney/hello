/**
 * 
 */
package com.zyz.empSys.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zyz.empSys.dao.IEmpDao;
import com.zyz.empSys.domain.Emp;
import com.zyz.empSys.utils.MyDBUtils;

/**
 * dao接口的实现类
 */
public class EmpDao implements IEmpDao {

	QueryRunner runner = new QueryRunner(MyDBUtils.getDataSource());

	@Override
	public Emp findEmpByNameAndPassword(String name, String password) {

		try {
			return runner.query("select * from emp where name=? and password=?", new BeanHandler<Emp>(Emp.class), name,
					password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Emp> findAll() {

		try {
			return runner.query("select * from emp", new BeanListHandler<Emp>(Emp.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean AddEmp(Emp all) {

		String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
		Object[] params = { null, all.getName(), all.getPassword(), all.getGender(), all.getAge(), all.getHiredate(),
				 all.getPhone(), all.getEmail() };
		try {
			runner.update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean modify(Emp id) {
		String sql="update * from emp set name=?,password=?,gender=?,age=?,hiredate=?,phone=?,email=?";
		try {
			runner.update(sql,id.getName(), id.getPassword(), id.getGender(), id.getAge(), id.getHiredate(),
					id.getPhone(), id.getEmail()  );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}



}
