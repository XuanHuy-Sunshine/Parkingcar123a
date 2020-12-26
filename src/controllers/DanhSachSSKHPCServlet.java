package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businesslogic.SSKHPCBL;
import javabeans.SSKHPC;

/**
 * Servlet implementation class DanhSachSSKHPCServlet
 */
@WebServlet("/DanhSachSSKHPCServlet")
public class DanhSachSSKHPCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachSSKHPCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
		
		List<SSKHPC> khpc =  SSKHPCBL.docTatCa(); 
		request.setAttribute("khpc", khpc); 	
		//		thiết lập lên thuộc tính request

		request.getRequestDispatcher("views/TDA_03_Trang_Hien_Thi_Admin_Dung_SSKHPC.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
