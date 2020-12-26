package javabeans;

public class Admin {
	private String sdt;
	private String matKhau;
	private String tenAdmin;
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getTenAdmin() {
		return tenAdmin;
	}
	public void setTenAdmin(String tenAdmin) {
		this.tenAdmin = tenAdmin;
	}
	public Admin(String sdt, String matKhau, String tenAdmin) {
		super();
		this.sdt = sdt;
		this.matKhau = matKhau;
		this.tenAdmin = tenAdmin;
	}
	public Admin() {
		super();
	}
	
	
}
