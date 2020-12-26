<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"   %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<div>
	<ul>
		<li> <a href="home"> <img src="img/home2.jpg"> </a> </li>
	</ul>
</div>

<div class="col2">
       <!-- <form name="frmdangxuat" action="trangdau" method="post">  -->
        <table border="1">
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
	<!-- </form> -->

</div>
