package businesslogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabeans.CSDL;

import javabeans.SSKHPC;

public class SSKHPCBL {
	public static List<SSKHPC> docTatCa(){
		List<SSKHPC> ds = new ArrayList<SSKHPC>();  // tên này dùng truyền data qua file quangcao.jsp thông qua dùng JSTL tag
		Connection con = CSDL.getCon();
		Statement stm;
		try {
			stm = con.createStatement();
			String sql ="select k.email, k.matkhau, k.matkhauvao, k.rfid, k.sophong,k.tenkhachhang,k.sdt, p.soparking, p.trangthai from khachhang k" + 
						" inner join parkingcar p on p.rfid = k.rfid ";    // chỉnh Sua
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				SSKHPC khpc = new SSKHPC();
				khpc.setEmail(rs.getString("email"));
				khpc.setMatKhau(rs.getString("matkhau"));
				khpc.setMatKhauVao(rs.getString("matkhauvao"));
				khpc.setRfid(rs.getString("rfid"));
				khpc.setSdt(rs.getString("sdt"));
				khpc.setSoPhong(rs.getString("sophong"));
				khpc.setTenKhachHang(rs.getString("tenkhachhang"));
				khpc.setSoParking(rs.getString("soparking"));
				khpc.setTrangThai(rs.getString("trangthai"));
				ds.add(khpc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ds;
	}



	//== Test
//	public static void main(String[] args) {
//		List<SSKHPC> ds = docTatCa();
//		for(SSKHPC temp:ds) {
//			System.out.println(temp.getRfid() );
//			
//		}
//	}
}
