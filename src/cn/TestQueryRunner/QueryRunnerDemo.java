package cn.TestQueryRunner;
/*
 * 使用QueryRunner类，实现对数据表的操作
 * insert delete update
 * 调用QueryRunner类的方法update(Connection conn, String sql, Object param)
 * Object param 可变参数 Object类型 SQL语句会出现？占位符
 * 数据库连接对象，自定义的工具类传递
*/

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import cn.Pojo.RegistClass;
import cn.Utils.JDBCUtils;

public class QueryRunnerDemo {

	public static void main(String[] args) throws SQLException {
		insert();

	}

	public static void insert() throws SQLException {
		Connection connection = JDBCUtils.getConnection();
		QueryRunner qRunner = new QueryRunner();
		RegistClass rec = new RegistClass();

		// System.out.println(rec.getUsername());
		// System.out.println(rec.getPassword());
		String u = rec.getUsername();
		String p = rec.getPassword();
		String sql = "INSERT INTO regist (username,password) VALUES (?,?)";
		Object[] param = { u, p };
		int i = qRunner.update(connection, sql, param);
		System.out.println(i);
		DbUtils.closeQuietly(connection);
	}
}
