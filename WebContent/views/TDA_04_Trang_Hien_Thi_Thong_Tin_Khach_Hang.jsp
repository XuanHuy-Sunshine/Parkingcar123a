<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<%-- Tạm Tạm-- chưa xử lý nút nhấn --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang hiển thị Thong Tin Khach Hang</title>
</head>
<body>
	<Div class="KhachHang">
		<table border="1" style=" width= 100% ;">
                <caption><b>Bảng Thông Tin Khách Hàng</b> </caption>
                <thead>
                    <tr>
                        <th>Tên Khách Hàng</th>
                        <th>Số Điện Thoại</th>
                        <th>Số Phòng</th>
                        <th>Email</th>
                        <th>Xem Chi Tiết</th> <%-- nút nhấn --%>
                    </tr>
                </thead>
                <tbody>
                 	<c:forEach items="${dskh}" var= "kh">    
	                    <tr>
	                        <td style="text-align: center;">  ${kh.tenKhachHang} </td>
	                        <td style="text-align: center;">  ${kh.sdt} </td>
	                        <td style="text-align: center;">  ${kh.soPhong} </td>
	                        <td style="text-align: center;">  ${kh.email} </td>
		                    <td style="text-align: center;">  <input type="submit" value="Thông tin Chi Tiết" name="btnThongTin"/> </td>
	                    </tr>
                    </c:forEach>
    
                </tbody>
            </table>
	</Div>

</body>
</html>