package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import javabeans.ParkingCar;
import businesslogic.ParkingCarBL;

/**
 * Servlet implementation class DanhSachParkingCarSevlet
 */
@WebServlet({"/DanhSachParkingCarSevlet","/abc.html"})
public class DanhSachParkingCarSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachParkingCarSevlet() {
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
        
        List<ParkingCar> dspc =  ParkingCarBL.docTatCa(); 
		request.setAttribute("dspc", dspc); 	
		//		thiết lập lên thuộc tính request
		
		
		
		
		//request.getRequestDispatcher("views/TDA_03_Trang_Hien_Thi_Admin_Bang.jsp").include(request, response);
		//request.getRequestDispatcher("views/TDA_03_Trang_Hien_Thi_Admin_02.jsp").include(request, response);
		//request.getRequestDispatcher("views/TDA_03_Trang_Hien_Thi_Admin_03.jsp").include(request, response);
		request.getRequestDispatcher("views/TDA_03_Trang_Hien_Thi_Tong.jsp").include(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
