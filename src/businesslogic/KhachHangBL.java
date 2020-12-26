package businesslogic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import javabeans.CSDL;
import javabeans.KhachHang;

public class KhachHangBL {
	public static List<KhachHang> docTatCa(){
		List<KhachHang> dskh = new ArrayList<KhachHang>();  // tên này dùng truyền data qua file quangcao.jsp thông qua dùng JSTL tag
		Connection con = CSDL.getCon();
		Statement stm;
		try {
			stm = con.createStatement();
			String sql ="select*from khachhang";    // chỉnh Sua
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				KhachHang kh = new KhachHang();
				kh.setEmail(rs.getString("email"));
				kh.setMatKhau(rs.getString("matkhau"));
				kh.setMatKhauVao(rs.getString("matkhauvao"));
				kh.setRfid(rs.getString("rfid"));
				kh.setSdt(rs.getString("sdt"));
				kh.setSoPhong(rs.getString("sophong"));
				kh.setTenKhachHang(rs.getString("tenkhachhang"));
				
				dskh.add(kh);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dskh;
	}
	
	public static KhachHang login(String ten, String matkhau){
		KhachHang dskh = new KhachHang();  // tên này dùng truyền data qua file quangcao.jsp thông qua dùng JSTL tag
		Connection con = CSDL.getCon();
		Statement stm;
		try {
			stm = con.createStatement();
			String sql ="select*from khachhang";    // chỉnh Sua
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				
				if(ten.equals(rs.getString("sdt")) && matkhau.equals(rs.getString("matkhau"))) {
					dskh.setEmail(rs.getString("email"));
					dskh.setMatKhau(rs.getString("matkhau"));
					dskh.setMatKhauVao(rs.getString("matkhauvao"));
					dskh.setRfid(rs.getString("rfid"));
					dskh.setSdt(rs.getString("sdt"));
					dskh.setSoPhong(rs.getString("sophong"));
					dskh.setTenKhachHang(rs.getString("tenkhachhang"));
				}				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dskh;
	}
	
	public static KhachHang ttUser(String sdt) {
		KhachHang dskh = new KhachHang();
		Connection con = CSDL.getCon();
		Statement stm;
		try {
			stm = con.createStatement();
			String sql ="select*from khachhang";    // chỉnh Sua
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				
				if(sdt.equals(rs.getString("sdt"))) {
					dskh.setEmail(rs.getString("email"));
					dskh.setMatKhau(rs.getString("matkhau"));
					dskh.setMatKhauVao(rs.getString("matkhauvao"));
					dskh.setRfid(rs.getString("rfid"));
					dskh.setSdt(rs.getString("sdt"));
					dskh.setSoPhong(rs.getString("sophong"));
					dskh.setTenKhachHang(rs.getString("tenkhachhang"));
				}				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dskh;
	}
	public static void capnhatuser(String ten, String phong, String sdt, String email, String marfid) {
		Connection con = CSDL.getCon();
		String sql = "UPDATE khachhang set tenkhachhang=?, sophong=?, sdt=?, email=? where rfid=?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, ten );
			pst.setString(2, phong );
			pst.setString(3, sdt );
			pst.setString(4, email );
			pst.setString(5, marfid );
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void capnhatmkvao( String mkmoi, String marfid) {
		Connection con = CSDL.getCon();
		String sql = "UPDATE khachhang set matkhauvao=?where rfid=?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, mkmoi );
			pst.setString(2, marfid );
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void capnhatmk( String mkmoi, String marfid) {
		Connection con = CSDL.getCon();
		String sql = "UPDATE khachhang set matkhau=? where rfid=?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, mkmoi );
			pst.setString(2, marfid );
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void themkhachhang(KhachHang kh) {
		String sql = "INSERT INTO khachhang (tenkhachhang, sophong, sdt, matkhau, matkhauvao, email, rfid) values (?,?,?,?,?,?,?)";
		try(Connection con = CSDL.getCon()) {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, kh.getTenKhachHang());
			pst.setString(2, kh.getSoPhong());
			pst.setString(3, kh.getSdt());
			pst.setString(4, kh.getMatKhau());
			pst.setString(5, kh.getMatKhauVao());
			pst.setString(6, kh.getEmail());
			pst.setString(7, kh.getRfid());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
///// Tìm Kiếm
	public static List<KhachHang> timkiem(String ten, String sdt, String sophong, String loai){ // 0_sdt $ 1_ten $$ 2_sophong $$ 3_ca3
		List<KhachHang> dskh = new ArrayList<KhachHang>();  // tên này dùng truyền data qua file quangcao.jsp thông qua dùng JSTL tag
		Connection con = CSDL.getCon();
		Statement stm;
		try {
			stm = con.createStatement();
			String sql ="select*from khachhang";    // chỉnh Sua
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				KhachHang kh = new KhachHang();
				if(loai.equals("0")) {  //sdt
					if(sdt.equals(rs.getString("sdt"))){
						
						kh.setEmail(rs.getString("email"));
						kh.setMatKhau(rs.getString("matkhau"));
						kh.setMatKhauVao(rs.getString("matkhauvao"));
						kh.setRfid(rs.getString("rfid"));
						kh.setSdt(rs.getString("sdt"));
						kh.setSoPhong(rs.getString("sophong"));
						kh.setTenKhachHang(rs.getString("tenkhachhang"));
						dskh.add(kh);
					}
				}else if (loai.equals("1")) { //ten
					if(ten.equals(rs.getString("tenkhachhang"))){
						
						kh.setEmail(rs.getString("email"));
						kh.setMatKhau(rs.getString("matkhau"));
						kh.setMatKhauVao(rs.getString("matkhauvao"));
						kh.setRfid(rs.getString("rfid"));
						kh.setSdt(rs.getString("sdt"));
						kh.setSoPhong(rs.getString("sophong"));
						kh.setTenKhachHang(rs.getString("tenkhachhang"));
						dskh.add(kh);
					}
				}else if (loai.equals("2")) { //sophong
					if(sophong.equals(rs.getString("sophong"))){
						
						kh.setEmail(rs.getString("email"));
						kh.setMatKhau(rs.getString("matkhau"));
						kh.setMatKhauVao(rs.getString("matkhauvao"));
						kh.setRfid(rs.getString("rfid"));
						kh.setSdt(rs.getString("sdt"));
						kh.setSoPhong(rs.getString("sophong"));
						kh.setTenKhachHang(rs.getString("tenkhachhang"));
						dskh.add(kh);
				}else {
					if(sdt.equals(rs.getString("sophong")) && sdt.equals(rs.getString("tenkhachhang")) && sdt.equals(rs.getString("sdt")) ){
						kh.setEmail(rs.getString("email"));
						kh.setMatKhau(rs.getString("matkhau"));
						kh.setMatKhauVao(rs.getString("matkhauvao"));
						kh.setRfid(rs.getString("rfid"));
						kh.setSdt(rs.getString("sdt"));
						kh.setSoPhong(rs.getString("sophong"));
						kh.setTenKhachHang(rs.getString("tenkhachhang"));
						dskh.add(kh);
					}
				}
				}
			}} catch (SQLException e) {
				e.printStackTrace();
				}
		return dskh;
		
	}
	
	

		
		


	//== Test
//	public static void main(String[] args) {
//		List<KhachHang> ds = docTatCa();
//		for(KhachHang temp:ds) {
//			System.out.println(temp.getTenHangSua() );
//			
//		}
//	}
	
//	public static void main(String[] args) {
//	List<KhachHang> dskh = timkiem(null, "092919112", null, "0");
//		for(KhachHang temp:dskh) {
//		System.out.println(temp.getSdt() );
//		}
//	}
}
