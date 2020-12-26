<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Kế Thừa Trang thông tin khách hàng -- Và CHỉ hiển thị thông tin 1 người --%>
<%-- Chưa Xong -- chưa xử lý nút nhấn --%>



	<Div class="KhachHang">
		<table border="1" style=" width= 100% ;">
                <caption><b>Bảng Thông Tin Khách Hàng Chi Tiết</b> </caption>
                <thead>
                    <tr>
                        <th>Tên Khách Hàng</th>
                        <th>Số Điện Thoại</th>
                        <th>Số Phòng</th>
                        <th>Email</th>
                        <th>Mã RFID</th> 
                        <th>Mật khẩu vào</th>
                        <th>Mật khẩu</th>
                        <th>Chỉnh Sửa</th><%-- nút nhấn --%>
                        <th>Xóa</th><%-- nút nhấn --%>
                    </tr>
                </thead>
               <tbody>
                 	<c:forEach items="${dskh}" var= "kh">    
	                    <tr>
	                        <td style="text-align: center;">  ${kh.tenKhachHang} </td>
	                        <td style="text-align: center;">  ${kh.sdt} </td>
	                        <td style="text-align: center;">  ${kh.soPhong} </td>
	                        <td style="text-align: center;">  ${kh.email} </td>
	                        <td style="text-align: center;">  ${kh.rfid} </td>
	                        <td style="text-align: center;">  ${kh.matKhauVao} </td>
	                        <td style="text-align: center;">  ${kh.matKhau} </td>
		                    <td style="text-align: center;">  <input type="submit" value="Chỉnh Sửa" name="btnChinhSua"/> </td>
		                    <td style="text-align: center;">  <input type="submit" value="Xóa" name="btnXoa"/> </td>
	                    </tr>
                    </c:forEach>
    
                </tbody>
            </table>
	</Div>
