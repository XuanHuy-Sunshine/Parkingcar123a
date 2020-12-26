<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<div class="col2">
        <form name="frmcapnhatuser" action="chinhsuauser" method="post">
        <table border="0">
            <thead>
                <tr>
                    <th colspan="4">Chỉnh Sửa User</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Tên Khách Hàng : </td>
                    <td><input type="text" name="txttenKH" value="${sessionScope.dskh.tenKhachHang}" /></td>
                    <td>Số Phòng </td>
                    <td><input type="text" name="txtsoPhong" value="${sessionScope.dskh.soPhong}" /></td>
                </tr>
                <tr>
                    <td>Điện thoại:</td>
                    <td><input type="text" name="txtDienThoai" value="${sessionScope.dskh.sdt}" /></td>
                    <td>Email:</td>
                    <td><input type="text" name="txtEmail" value="${sessionScope.dskh.email}" /></td>
                </tr>
                <tr>
                    <td colspan="4">
                        <input type="submit" value="Cập Nhật" name="btnCapNhat" />
                    </td>
                </tr>
            </tbody>
        </table>
        </form>        
    </div>