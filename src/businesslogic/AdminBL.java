package businesslogic;
//ok
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabeans.Admin;
import javabeans.CSDL;



public class AdminBL {
	public static List<Admin> docTatCa(){
		List<Admin> dsad = new ArrayList<Admin>();  // tên này dùng truyền data qua file quangcao.jsp thông qua dùng JSTL tag
		Connection con = CSDL.getCon();
		Statement stm;
		try {
			stm = con.createStatement();
			String sql ="select*from admin";    // chỉnh Sua
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				Admin ad = new Admin();
				ad.setMatKhau(rs.getString("matkhau"));
				ad.setSdt(rs.getString("sdt"));
				ad.setTenAdmin(rs.getString("tenadmin"));
				
				
				dsad.add(ad);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dsad;
	}

	public static Admin login(String ten, String matkhau){
		Admin dsad = new Admin();  // tên này dùng truyền data qua file quangcao.jsp thông qua dùng JSTL tag
		Connection con = CSDL.getCon();
		Statement stm;
		try {
			stm = con.createStatement();
			String sql ="select*from admin";    // chỉnh Sua
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				//Admin dsad = new Admin();
				if(ten.equals(rs.getString("sdt")) && matkhau.equals(rs.getString("matkhau"))) {
					dsad.setMatKhau(rs.getString("matkhau"));
					dsad.setSdt(rs.getString("sdt"));
					dsad.setTenAdmin(rs.getString("tenadmin"));
				}				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dsad;
	}
	
	public static void capnhatmkadmin( String mkmoi, String sdt) {
		Connection con = CSDL.getCon();
		String sql = "UPDATE admin set matkhau=? where sdt=?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, mkmoi );
			pst.setString(2, sdt );
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	//== Test
//	public static void main(String[] args) {
//		List<Admin> ds = docTatCa();
//		for(Admin temp:ds) {
//			System.out.println(temp.getTenAdmin() );
//			
//		}
//	}
	
//	public static void main(String[] args) {
//	Admin ds = login("0899998888","@123456");
//		System.out.println(ds.getTenAdmin() );
//}
	
}
