package javabeans;

public class ParkingCar {
	private String rfid;
	private String trangThai;
	private String soParking;
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getSoParking() {
		return soParking;
	}
	public void setSoParking(String soParking) {
		this.soParking = soParking;
	}
	public ParkingCar(String rfid, String trangThai, String soParking) {
		super();
		this.rfid = rfid;
		this.trangThai = trangThai;
		this.soParking = soParking;
	}
	public ParkingCar() {
		super();
	}
	
	
}
