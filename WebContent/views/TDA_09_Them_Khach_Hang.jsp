<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- bài 10 m3 -->
<!--  bài ql sua se -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="col2">
        <form name="frmThemKhachHang" action="trang-them-khach-hang.jsp" method="post">
        <table border="0">
            <thead>
                <tr>
                    <th colspan="4">THÊM KHÁCH HÀNG MỚI</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Mã KH</td>
                    <td><input type="text" name="txtMaKH" value="Mã KH" /></td>
                    <td>Tên KH</td>
                    <td><input type="text" name="txtTenKH" value="Tên KH" /></td>
                </tr>
                <tr>
                    <td>Phái</td>
                    <td>
                        <input type="radio" name="rdbPhai" value="Nam"/>Nam
                        <input type="radio" name="rdbPhai" value="Nu" />Nữ
                    </td>
                    <td>Địa chỉ</td>
                    <td><input type="text" name="txtDiaChi" value="Địa chỉ" /></td>
                </tr>
                <tr>
                    <td>Điện thoại:</td>
                    <td><input type="text" name="txtDienThoai" value="Điện thoại" /></td>
                    <td>Email:</td>
                    <td><input type="text" name="txtEmail" value="Email" /></td>
                </tr>
                <tr>
                    <td colspan="4">
                        <input type="submit" value="Thêm mới" name="btnThemMoi" />
                    </td>
                </tr>
            </tbody>
        </table>
        </form>        
    </div>
</body>
</html>