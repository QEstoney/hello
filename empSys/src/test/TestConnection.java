/**
 * 
 */
package test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.zyz.empSys.utils.MyDBUtils;

/**
 * @author Administrator
 *@2019年1月14日
 *@
 *@类说明
 *
 *@
 */
public class TestConnection {

	@Test
	public void test1() throws SQLException {
		Connection connection = MyDBUtils.getConnection();
		System.out.println(connection);
	}
}
