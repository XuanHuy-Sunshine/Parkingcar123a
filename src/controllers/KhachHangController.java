package controllers;

import java.io.IOException;
//import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import businesslogic.KhachHangBL;

import javabeans.KhachHang;

@Controller
public class KhachHangController {
	@RequestMapping("/adminkhachhang")
	public String khachhang2(Model model) {
		List<KhachHang> dskh = KhachHangBL.docTatCa();
		model.addAttribute("dskh", dskh);
		return "adminkhachhang";
	}

	@RequestMapping("/adminkhachhangCT")
	public String khachhang1(Model model) {
		List<KhachHang> dskh = KhachHangBL.docTatCa();
		model.addAttribute("dskh", dskh);
		return "adminkhachhangCT";
	}

	@RequestMapping("/ttUser")
	public String ttUser2() {
		return "ttUser";
	}
	@RequestMapping(path = "chinhsuauser", method = RequestMethod.GET)
	public String chinhsuausera() {
		return "chinhsuauser";
	}
	
	@RequestMapping(path = "chinhsuauser", method = RequestMethod.POST)
	public String chinhsuausera(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String ten = null, sophong = null;
		String sdt, email ;
		HttpSession session = request.getSession(); 
		KhachHang dskh = (KhachHang) session.getAttribute("dskh");
		
		sdt = request.getParameter("txtDienThoai");
		ten = request.getParameter("txttenKH");
		sophong = request.getParameter("txtsoPhong");
		email = request.getParameter("txtEmail");
		
		//KhachHangBL.capnhatuser(ten, sophong, sdt, email, dskh.getRfid());
		//KhachHangBL.capnhatuser(ten, sophong, sdt, email, );
		KhachHangBL.capnhatuser(ten, sophong, sdt, email, dskh.getRfid());
		session.invalidate();
		return "home";
	}
	
	
	@RequestMapping(path = "chinhMKVao", method = RequestMethod.GET)
	public String doimkvao() {
		return "chinhMKVao";
	}
	
	@RequestMapping(path = "chinhMKVao", method = RequestMethod.POST)
	public String doimkvao(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String mkvaocu = null, mkvaomoi = null;
		
		HttpSession session = request.getSession(); 
		KhachHang dskh = (KhachHang) session.getAttribute("dskh");
		
		mkvaocu = request.getParameter("txtmkcu");
		mkvaomoi = request.getParameter("txtmkmoi");
		if(mkvaocu.equals(dskh.getMatKhauVao())) {
			KhachHangBL.capnhatmkvao(mkvaomoi, dskh.getRfid());
			session.invalidate();
			return "home";
		}else {
			return "chinhMKVao";
		}
	}
	
	@RequestMapping(path = "chinhMKWEB", method = RequestMethod.GET)
	public String doimk() {
		return "chinhMKWEB";
	}
	
	@RequestMapping(path = "chinhMKWEB", method = RequestMethod.POST)
	public String doimk(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String mkcu = null, mkmoi = null;
		
		HttpSession session = request.getSession(); 
		KhachHang dskh = (KhachHang) session.getAttribute("dskh");
		
		mkcu = request.getParameter("txtmkcu");
		mkmoi = request.getParameter("txtmkmoi");
		if(mkcu.equals(dskh.getMatKhau())) {
			KhachHangBL.capnhatmk(mkmoi, dskh.getRfid());
			session.invalidate();
			return "home";
		}else {
			return "chinhMKWEB";
		}
	}
	
//	  @RequestMapping("/ttUser") 
//	  public String user(HttpServletRequest request, HttpServletResponse response) throws IOException { 
//		HttpSession session = request.getSession(); 
//		KhachHang dskh = (KhachHang) session.getAttribute("dskh");
//	  
//	    KhachHang dskh02 = KhachHangBL.ttUser(dskh.getSdt());
//	  
//	  response.sendRedirect("ttUser"); return "ttUser"; }
//	 
}
