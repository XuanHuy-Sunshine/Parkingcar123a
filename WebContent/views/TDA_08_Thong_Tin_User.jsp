<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="col21">
 			<table border="1" style=" width= 100% ;">
                <caption><b>Bảng Thông Tin User</b> </caption>
                <thead>
                    <tr>
                        <th>Số Phòng</th>
                        <th>Họ Và Tên</th>
                        <th>Số Điện Thoại</th>
                        <th>Email</th>
                       <%--  <th>Lấy Ra</th> nút nhấn --%>
                        
                    </tr>
                </thead>
                <tbody>
                 	 
	                    <tr>
	                        <td style="text-align: center;">  ${dskh.soPhong} </td>
	                        <td style="text-align: center;">  ${dskh.tenKhachHang} </td>
	                        <td style="text-align: center;">  ${dskh.sdt} </td>
	                        <td style="text-align: center;">  ${dskh.email} </td>
	                    </tr>

    
                </tbody>
            </table>
        </div>
</body>
</html>