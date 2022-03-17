package jdbc;

import java.sql.*;

public class test1 {
	
	public static void main(String[] args) {
		try {
			// 1. JDBC Driver 사용 준비하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB 서버 접속하기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			// 3. Statement / PreparedStatement 객체 생성하기
			Statement stmt = conn.createStatement();

			// 4. SQL 문 실행하기
			//stmt.executeUpdate("create table ktds(id varchar2(10), pwd varchar2(10))");
			//stmt.executeUpdate("insert into ktds values('aa','11')");
			//stmt.executeUpdate("insert into ktds values('bb','22')");
			//stmt.executeUpdate("insert into ktds values('cc','33')");
			ResultSet rs = stmt.executeQuery("select * from ktds");
			while(rs.next()) {
				System.out.println(rs.getString(1) + ":"+ rs.getString("pwd"));
			}
			// 5. 자원 해제하기
			rs.close();
			stmt.close();
			conn.close();//연결 해제
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("OK");
		
	}
}
