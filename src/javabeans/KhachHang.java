package javabeans;

public class KhachHang {
	private String rfid;
	private  String email;
	private String matKhauVao;
	private String matKhau;
	private String sdt;
	private String soPhong;
	private String tenKhachHang;
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
	public KhachHang(String rfid, String email, String matKhauVao, String matKhau, String sdt, String soPhong,
			String tenKhachHang) {
		super();
		this.rfid = rfid;
		this.email = email;
		this.matKhauVao = matKhauVao;
		this.matKhau = matKhau;
		this.sdt = sdt;
		this.soPhong = soPhong;
		this.tenKhachHang = tenKhachHang;
	}
	public KhachHang() {
		super();
	}
	
	
	
}
