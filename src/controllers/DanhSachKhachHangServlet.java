package controllers;

import java.io.IOException;
//import java.util.List;
//import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import businesslogic.KhachHangBL;
//import javabeans.KhachHang;

/**
 * Servlet implementation class DanhSachKhachHangServlet
 */
@WebServlet("/DanhSachKhachHangServlet")
public class DanhSachKhachHangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachKhachHangServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        //Phần lấy thông tin hiển thị 
        
        //List<KhachHang> dskh =  KhachHangBL.docTatCa(); 
		//request.setAttribute("dskh", dskh); 
		
		
		//		thiết lập lên thuộc tính request
        doPost(request, response);
		//request.getRequestDispatcher("views/TDA_10_Chinh_Sua_Thong_Tin_User.jsp").include(request, response);
		//request.getRequestDispatcher("views/TDA_04_Trang_Hien_Thi_Thong_Tin_Khach_Hang_CT.jsp").include(request, response);
		//request.getRequestDispatcher("WEB_INF/jsp/danhsachkhachhang.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");  
	    
		String ten = request.getParameter("txttenKH");
		String sophong = request.getParameter("txtsoPhong");
		String sdt = request.getParameter("txtDienThoai");
		String email = request.getParameter("txtEmail");
		String rfid = request.getParameter("txtrfid");
		
		KhachHangBL.capnhatuser(ten, sophong, sdt, email, rfid);
		
		request.getRequestDispatcher("views/TDA_10_Chinh_Sua_Thong_Tin_User.jsp").include(request, response);
	}

}
