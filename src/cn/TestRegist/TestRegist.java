package cn.TestRegist;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.DbUtils;

import cn.Pojo.RegistClass;
import cn.Utils.JDBCUtils;

/**
 * Servlet implementation class tr1
 */
@WebServlet("/TestRegist")
public class TestRegist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 获取IP
		String ip = request.getRemoteAddr();
		// 获取请求方式
		String method = request.getMethod();
		// 获取虚拟路径
		String path = request.getContextPath();
		System.out.println("IP地址：" + ip);
		System.out.println("请求方式：" + method);
		System.out.println("虚拟路径：" + path);

		// 设置request缓冲区的编码
		request.setCharacterEncoding("UTF-8");
		// 获取请求参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String city = request.getParameter("city");
		String[] hobby = request.getParameterValues("hobby");

		// 控制台输出
		System.out.println("用户名：" + username);
		System.out.println("密码：" + password);
		System.out.println("性别：" + sex);
		System.out.println("城市" + city);
		System.out.println("爱好" + Arrays.toString(hobby));
		RegistClass re = new RegistClass();
		re.setUsername(username);
		re.setPassword(password);
		re.setSex(sex);

		//
		try {
			insert1(re);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static void insert1(RegistClass rec) throws SQLException {
		Connection connection = JDBCUtils.getConnection();

		// QueryRunner qRunner = new QueryRunner();

		System.out.println(rec.getUsername());
		System.out.println(rec.getPassword());

		String sql = "INSERT INTO regist (username,password) VALUES (?,?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, rec.getUsername());
		ps.setString(2, rec.getPassword());
		int i = ps.executeUpdate();

		System.out.println(i);
		DbUtils.closeQuietly(connection);
	}
}
