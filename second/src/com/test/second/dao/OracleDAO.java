package com.test.second.dao;
import java.sql.Connection;
import java.sql.DriverManager;
public class OracleDAO {
	//싱글톤 예제
	private static OracleDAO dao = null;
	
	private OracleDAO() {}	 //OracleDAO 를 다른 곳에서 생성 불가
	
	public static OracleDAO getInstance() {
		if(dao == null) {
			dao = new OracleDAO();
		}
		return dao;
	}
	//싱글톤 예제
	
	public Connection getConn() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("접속성공~");
		return con;
	}
	//인터페이스 닫기
	public void closeConn(Connection conn) throws Exception{
		if(conn != null) {
			try {
			conn.close();
		}catch(Exception e) {}
			}
	}
}