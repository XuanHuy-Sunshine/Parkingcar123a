<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ParkingCar</title>
</head>
<body>
 <div class="col21">
 			<table border="1" style=" width= 100% ;">
                <caption><b>Bảng Thông Tin Và Điều Khiển</b> </caption>
                <thead>
                    <tr>
                        <th>Số Parking</th>
                        <th>Trạng Thái</th>
                        <th>Số RFID</th>
                        <th>Số Phòng</th>
                        <th>Số Tên Khách Hàng</th>
                        <th>Lấy Ra</th> <%-- nút nhấn --%>
                        <th>Thông Tin</th> <%-- nút nhấn --%>
                        
                    </tr>
                </thead>
                <tbody>
                 	<c:forEach items="${dspc}" var= "dspc">    
	                    <tr>
	                        <td style="text-align: center;">  ${dspc.soParking} </td>
	                        <td style="text-align: center;">  ${dspc.trangThai} </td>
	                        <td style="text-align: center;">  ${dspc.rfid} </td>
	                        <td style="text-align: center;">  {dspc.soPhong} </td>
	                        <td style="text-align: center;">  {dspc.tenKhachHang} </td>
	                    	<td style="text-align: center;">  
	                    		<c:if test="${dspc.rfid ne ('')}">
									<input type="submit" value="lấy ra" name="btnLayRa"/>
								</c:if>
	                    	</td> 
	                    	<td style="text-align: center;">  
	                    		<c:if test="${dspc.rfid ne ('')}">
									<input type="submit" value="Thông tin" name="btnThongTin"/> 							
								</c:if>
	                    	</td>
	                    </tr>
                    </c:forEach>
    
                </tbody>
            </table>
        </div>

</body>
</html>