package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import businesslogic.KhachHangBL;
import javabeans.KhachHang;
import businesslogic.AdminBL;
import javabeans.Admin;

@Controller
public class AdminController {
	@RequestMapping(path = "themkhachhang", method = RequestMethod.GET)
	public String doimk() {
		return "themkhachhang";
	}
	
	@RequestMapping(path = "themkhachhang", method = RequestMethod.POST)
	public String doimk(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String khachhang = null, sophong = null;
		String sodienthoai = null, matkhau = null;
		String matkhauvao = null, rfid = null;
		String email = null;
		
		khachhang = request.getParameter("txtten");
		sophong = request.getParameter("txtsophong");
		sodienthoai = request.getParameter("txtsodienthoai");
		matkhau = request.getParameter("txtmatkhau");
		matkhauvao = request.getParameter("txtmatkhauvao");
		rfid = request.getParameter("txtmarfid");
		email = request.getParameter("txtemail");
		
		KhachHang kh2= new KhachHang(rfid, email,matkhauvao, matkhau, sodienthoai ,sophong, khachhang);
		KhachHangBL.themkhachhang(kh2);
		
		return "themkhachhang";
		
	}
	
	
	@RequestMapping(path = "doimkadmin", method = RequestMethod.GET)
	public String doimkad() {
		return "doimkadmin";
	}
	
	@RequestMapping(path = "doimkadmin", method = RequestMethod.POST)
	public String doimkad(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String mkcu = null, mkmoi = null;
		String thongbao = "Không Thay Đổi Được";
		HttpSession session = request.getSession(); 
		Admin dsad = (Admin) session.getAttribute("dsad");
		mkcu = request.getParameter("txtmkcu");
		mkmoi = request.getParameter("txtmkmoi");
		if(mkcu.equals(dsad.getMatKhau())) {
			AdminBL.capnhatmkadmin(mkmoi, dsad.getSdt());
			session.invalidate();
			return "home";
		}else {
			request.setAttribute("thongbao", thongbao);
			return "doimkadmin";
		}
	}
	
	
	@RequestMapping(path = "TimKiemKH", method = RequestMethod.GET)
	public String timkiem() {
		return "TimKiemKH";
	}
	
	@RequestMapping(path = "TimKiemKH", method = RequestMethod.POST)
	public String timkiem(HttpServletRequest request, HttpServletResponse response)  {
		String ten = null, sdt = null;
		String sophong = null, loai = null;
		
		ten = request.getParameter("txtten");
		sdt = request.getParameter("txtsdt");
		loai = request.getParameter("cboLoai");
		sophong = request.getParameter("txtsophong");
		
		List<KhachHang> dskh = KhachHangBL.timkiem(ten, sdt, sophong, loai);

		request.setAttribute("dskh", dskh);
		return "TimKiemKH";
		}
}
