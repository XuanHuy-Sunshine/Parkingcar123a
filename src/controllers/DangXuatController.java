package controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class DangXuatController {
	@RequestMapping(path = "/Trang_dangxuat", method = RequestMethod.GET)
	public String dangxuat() {
		return "Trang_dangxuat";
	}
	
	@RequestMapping(path = "/Trang_dangxuat", method = RequestMethod.POST )
	public String dangxuat(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		if(session != null) {
			session.invalidate();
			//session.removeAttribute("dskh");
			//session.removeAttribute("dsad");
			//response.sendRedirect("TDA_01_Dau_Trang_JSP.jsp");
		}
		return "home";
	}
}
