<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"   %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<div style="display: table;">
	<div style="display: table-cell;" >
		<ul>
			<li> <a href="home" style="font-size: 900%;"> <img src="img/home2.jpg">ParkingCar </a> </li>
		</ul>
	</div>
	
	<div class="col2" style="display: table-cell ; padding: 15px 15px 15px 400px; text-align:left; ">
	       <form name="frmdangxuat" action="trangdau" method="post">
	        <table border="0">
	            <tbody>
	            	<tr>
	                    <td>Họ Tên : </td>
	                    <td> ${sessionScope.dskh.tenKhachHang} ${sessionScope.dsad.tenAdmin} </td>
	                </tr>
	       			
	                <tr>
	                    <td>Số Phòng: </td>
	                    <td> ${sessionScope.dskh.soPhong}   </td>
	                </tr>
		
	            </tbody>
	            </table>
		</form> 
	</div>
</div>