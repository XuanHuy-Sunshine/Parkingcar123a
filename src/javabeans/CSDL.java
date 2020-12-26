package javabeans;
// chú ý: Phải Chỉnh Sửa lại url : ở CSDL Lấy từ CSDl nào  

//Class.forName("com.mysql.jdbc.Driver");// lỗi do đặt sai Class ko nằm trong gói public class ... này dc 
// --> nó phải nằm trong 1 hàm con nữa vd: public static ....()

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDL {
	private static Connection con;
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/parking?useUnicode=true&characterEncoding=UTF-8";
			try {
				con = DriverManager.getConnection(url,"root","");
			} catch (SQLException e) {
				//Lỗi sai khi lấy sai link , tên SQL, mật khẩu
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			//Lỗi sai Thư Viện mysql 
			e.printStackTrace();
		}
		
		return con;
	}
	
//	public static void main(String[] args) {
//		Connection kn = CSDL.getCon();
//	}
	
}

