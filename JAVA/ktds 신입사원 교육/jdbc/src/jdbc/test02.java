package jdbc;

import java.sql.*;

public class test02 {
	public static void insertData(String id, String pwd) {
		String sql = "insert into ktds values('"+ id + "','" + pwd +"')";
		
		
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement("insert into ktds values(?,?)");
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			
		}finally {
			//try block에서 사용했던 자원 해제
//			if()
//			rs.close();
//			pstmt.close();
//			stmt.close();
//			conn.close();
		}
	}
	
	public static void main(String[] args) {
		insertData("dd","44");
	}
}
