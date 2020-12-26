<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"   %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<div class="col2">
       <form name="frmTimKiem" action="TimKiemKH" method="post">  <!-- action hàm nơi xử lý sau khi nhấn suubmit -->
       <table border="0">
           <tbody>
           	<tr>
           		<td>Tìm Theo : </td>
                   <td><select name="cboLoai">
                         	<option value="0">Số Điện Thoại</option>
                         	<option value="1">Tên</option>
                         	<option value="2">Số Phòng</option>
                         	<option value="3">Cả 3</option>
                       </select></td>
               </tr>
               <tr>
                   <td>Số Điện Thoại: </td>
                   <td><input type="text" name="txtsdt" value="${kh.sdt}" /></td>
               </tr>
               <tr>
                   <td>Tên : </td>
                   <td><input type="text" name="txtten" value="${kh.tenKhachHang}" /></td>
               </tr>
               <tr>
                   <td>Số Phòng : </td>
                   <td><input type="text" name="txtsophong" value="${kh.soPhong}" /></td>
               </tr>
               
               <tr style=" text-align: center; ">
                   <td > <!-- colspan="2" -->
                       <input type="submit" value="Tìm Kiếm" name="btntimkiem" />
                   </td>
               </tr>
           </tbody>
           </table>
           </form>

</div>

<Div class="KhachHang">
		<table border="1" style=" width= 100% ;">
                <caption><b>Bảng Thông Tin Khách Hàng</b> </caption>
                <thead>
                    <tr>
                        <th>Tên Khách Hàng</th>
                        <th>Số Điện Thoại</th>
                        <th>Số Phòng</th>
                        <th>Email</th>
                        <%-- <th>Xem Chi Tiết</th> nút nhấn --%>
                    </tr>
                </thead>
                <tbody>
                 	<c:forEach items="${dskh}" var= "kh">    
	                    <tr>
	                        <td style="text-align: center;">  ${kh.tenKhachHang} </td>
	                        <td style="text-align: center;">  ${kh.sdt} </td>
	                        <td style="text-align: center;">  ${kh.soPhong} </td>
	                        <td style="text-align: center;">  ${kh.email} </td>
		                    <!-- <td style="text-align: center;">  <input type="submit" value="Thông tin Chi Tiết" name="btnThongTin"/> </td> -->
	                    </tr>
                    </c:forEach>
    
                </tbody>
            </table>
	</Div>