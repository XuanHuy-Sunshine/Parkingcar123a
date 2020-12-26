package javabeans;
// So Sánh Khách Hàng Và ParkingCar 
public class SSKHPC {
	private String rfid;
	private  String email;
	private String matKhauVao;
	private String matKhau;
	private String sdt;
	private String soPhong;
	private String tenKhachHang;
	private String trangThai;
	private String soParking;
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatKhauVao() {
		return matKhauVao;
	}
	public void setMatKhauVao(String matKhauVao) {
		this.matKhauVao = matKhauVao;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getSoPhong() {
		return soPhong;
	}
	public void setSoPhong(String soPhong) {
		this.soPhong = soPhong;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
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
	public SSKHPC(String rfid, String email, String matKhauVao, String matKhau, String sdt, String soPhong,
			String tenKhachHang, String trangThai, String soParking) {
		super();
		this.rfid = rfid;
		this.email = email;
		this.matKhauVao = matKhauVao;
		this.matKhau = matKhau;
		this.sdt = sdt;
		this.soPhong = soPhong;
		this.tenKhachHang = tenKhachHang;
		this.trangThai = trangThai;
		this.soParking = soParking;
	}
	public SSKHPC() {
		super();
	}
	
	
}
