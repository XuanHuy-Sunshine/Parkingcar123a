package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import businesslogic.AdminBL;
import businesslogic.KhachHangBL;
import businesslogic.ParkingCarBL;
import businesslogic.SSKHPCBL;
import javabeans.KhachHang;
import javabeans.ParkingCar;
import javabeans.SSKHPC;
import javabeans.Admin;

@Controller
public class HomeController {
	@RequestMapping({"/","/Trang_Chu_02", "/home"})
	public String home(Model model) {
		List<ParkingCar> dspc =  ParkingCarBL.docTatCa(); 
		model.addAttribute("dspc", dspc);
		return "home";
	}
	@RequestMapping("/trangdau")
	public String dautrang1(){
		return "trangdau";
	}
	
	
	@RequestMapping(path = "/Trang_Login", method = RequestMethod.GET)
	public String login() {
		return "Trang_Login";
	}
	
	
	@RequestMapping(path = "/Trang_Login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String sdt = null, matkhau = null;
		String  loai;
		sdt = request.getParameter("sdt");
		matkhau = request.getParameter("matkhau");
		loai = request.getParameter("cboLoai");
		
		if(loai.equals("1")) {  //admin
			//List<KhachHang> dskh =  KhachHangBL.docTatCa(); 
			//List<Admin> dsad = AdminBL.docTatCa();
			Admin dsad = AdminBL.login(sdt, matkhau);
			if(dsad != null) {
				//thiếu trả về danh sách
				HttpSession session = request.getSession();
				session.setAttribute("dsad", dsad);
				response.sendRedirect("home");
				
				//response.sendRedirect("thucdon");
				//response.sendRedirect("trangdau");
				//response.sendRedirect("WEB-INF/templates/Trang_Chu_Admin.jsp");
				//return "WEB-INF/templates/Trang_Chu_Admin.jsp";	
			}
		}else if(loai.equals("0")) {
			//List<KhachHang> dskh = KhachHangBL.docTatCa();
			KhachHang dskh = KhachHangBL.login(sdt, matkhau);
			if(dskh != null) {
				// thiếu trả về danh sách
				HttpSession session = request.getSession();
				session.setAttribute("dskh", dskh);
				response.sendRedirect("home");
				//return "trangdau";
			}
		}
			return "Trang_Login";
	}
	
	
	@RequestMapping("/giaodientong")  //chua xong
	public String giaodienadmin(Model model){
		List<SSKHPC> khpc =  SSKHPCBL.docTatCa(); 
		model.addAttribute("khpc", khpc); 	
		return "giaodientong";
	}
	
	
	
}

