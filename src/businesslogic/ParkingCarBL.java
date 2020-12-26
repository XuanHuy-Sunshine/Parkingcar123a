package businesslogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabeans.CSDL;
import javabeans.ParkingCar;

public class ParkingCarBL {
	public static List<ParkingCar> docTatCa(){
		List<ParkingCar> dspc = new ArrayList<ParkingCar>();  
		Connection con = CSDL.getCon();
		Statement stm;
		try {
			stm = con.createStatement();
			String sql ="select*from parkingcar";    // chỉnh Sua
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				ParkingCar pc = new ParkingCar();
				pc.setRfid(rs.getString("rfid"));
				pc.setTrangThai(rs.getString("trangthai"));
				pc.setSoParking(rs.getString("soparking"));
				
				dspc.add(pc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dspc;
	}



	//== Test
//	public static void main(String[] args) {
//		List<ParkingCar> ds = docTatCa();
//		for(ParkingCar temp:ds) {
//			System.out.println(temp.getSoParking() );
//			
//		}
//	}
	
	
}
