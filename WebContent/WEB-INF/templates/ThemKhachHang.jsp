<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"   %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!-- Thêm Khách Hàng Mới -->
<div class="col2">
        <form name="frmthemkhachhang" action="themkhachhang" method="post">  <!-- action hàm nơi xử lý sau khi nhấn suubmit -->
        <table border="0">
        	<thead>
                <tr>
                    <th colspan="4">Thêm Khách Hàng Mới</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Tên Khách Hàng: </td>
                    <td><input type="text" name="txtten" value="Nhập Tên Khách Hàng" /></td>
                </tr>
                
                <tr>
                    <td>Số Phòng : </td>
                    <td><input type="text" name="txtsophong" value="Nhập Số Phòng" /></td>
                </tr>
                
                <tr>
                    <td>Số Điện Thoại : </td>
                    <td><input type="text" name="txtsodienthoai" value="Nhập Số Điện Thoại" /></td>
                </tr>
                
                <tr>
                    <td>Mật Khẩu : </td>
                    <td><input type="text" name="txtmatkhau" value="Nhập Mật Khẩu" /></td>
                </tr>
                
                <tr>
                    <td>Mật Khẩu Vào : </td>
                    <td><input type="text" name="txtmatkhauvao" value="Nhập Mật Khẩu Vào" /></td>
                </tr>
                
                <tr>
                    <td>Email : </td>
                    <td><input type="text" name="txtemail" value="Nhập Email" /></td>
                </tr>
                
                <tr>
                    <td>Mã RFID : </td>
                    <td><input type="text" name="txtmarfid" value="Nhập RFID" /></td>
                </tr>
                
                <tr style=" text-align: center; ">
                    <td > <!-- colspan="2" -->
                        <input type="submit" value="Thêm" name="btnthem" />
                    </td>
                </tr>
            </tbody>
            </table>
            </form>

</div>
