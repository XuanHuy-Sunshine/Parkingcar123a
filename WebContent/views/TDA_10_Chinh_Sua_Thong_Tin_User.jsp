<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="col2">
        <form name="frmcapnhatuser" action="DanhSachKhachHangServlet" method="post">
        <table border="0">
            <thead>
                <tr>
                    <th colspan="4">Chỉnh Sửa User</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Tên Khách Hàng : </td>
                    <td><input type="text" name="txttenKH" value="Tran Van XA" /></td>
                    <td>Số Phòng </td>
                    <td><input type="text" name="txtsoPhong" value="A440" /></td>
                </tr>
                <tr>
                    <td>Điện thoại:</td>
                    <td><input type="text" name="txtDienThoai" value="0484373" /></td>
                    <td>Email:</td>
                    <td><input type="text" name="txtEmail" value="abcd@gmail.com" /></td>
                </tr>
                <tr>
                	<td><input type="text" name="txtrfid" value="18008DC32E7B" /></td>
                    <td colspan="4">
                        <input type="submit" value="Cập Nhật" name="btnCapNhat" />
                    </td>
                </tr>
            </tbody>
        </table>
        </form>        
    </div>
</body>
</html>