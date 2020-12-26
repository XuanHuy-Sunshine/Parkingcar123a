<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"   %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!-- code diều khiển trong thực đơn -->


<c:choose>
    <c:when test="${not empty sessionScope.dskh.tenKhachHang}">
       <%-- Làm gì đó ở đây khi điều kiện 1 đúng  --%>
	     <div>
			<ul>
				<li><a href="home"> 					HOME</a>
				<li><a href="ttUser">					Thông Tin Cá Nhân </a>
				<li><a href="chinhsuauser">				Chỉnh Sửa Thông Tin Cá Nhân</a>
				<li><a href="chinhMKVao">				Đổi Mật Khẩu Vào Bãi Xe</a>
				<li><a href="chinhMKWEB">				Đổi Mật Khẩu Web</a>
				<li><a href="Trang_dangxuat">			Đăng Xuất </a>
			</ul>
		</div>

    </c:when>
    <c:when test="${not empty sessionScope.dsad.tenAdmin }">
			<div>
				<ul>
					<li><a href="home"> HOME</a>
					<li><a href="#">						Giao Diện Tổng(not)</a>
					<li><a href="adminkhachhang">			Thông Tin Khách Hàng</a>
					<li><a href="adminkhachhangCT">			Thông Tin Khách Hàng Chi Tiết</a>
					<li><a href="themkhachhang">			Thêm Khách Hàng mới</a>
					<li><a href="TimKiemKH">						Tìm Kiếm Khách Hàng(not)</a>
					<li><a href="doimkadmin">				Đổi Mật Khẩu</a>
					<li><a href="Trang_dangxuat">			Đăng Xuất </a>
				</ul>
			</div>
        <%-- Làm gì đó ở đây khi điều kiện 2 đúng  --%>
    </c:when>
    <c:otherwise>
        <%-- Câu lệnh sẽ được thực thi khi tất cả các điều kiện tại <c:when> ở trên sai.  --%>
        <div>
		<ul>
			<li><a href="home"> HOME</a>
			<li><a href="Trang_Login">	Đăng Nhập </a>
			<li><a href="#">		...</a>
			<li><a href="#">		...</a>
			<li><a href="#">		...</a>
			<li><a href="#"> ${sessionScope.dskh.tenKhachHang}</a>
			<li><a href="#"> ${sessionScope.dsad.tenAdmin }</a>
		</ul>
		
	</div>
    </c:otherwise>
</c:choose>





<!-- 
	<div>
		<ul>
			<li><a href="home"> HOME</a>
			<li><a href="Trang_Login">	Đăng Nhập </a>
			<li><a href="#">		...</a>
			<li><a href="#">		...</a>
			<li><a href="#">		...</a>
		</ul>
	</div>

<c:if test=" ${sessionScope.dsad.tenAdmin eq ('')} && ${sessionScope.dskh.tenKhachHang eq ('') } ">
	<div>
		<ul>
			<li><a href="home"> HOME</a>
			<li><a href="Trang_Login">	Đăng Nhập </a>
			<li><a href="#">		...</a>
			<li><a href="#">		...</a>
			<li><a href="#">		...</a>
		</ul>
	</div>
</c:if>

<c:if test=" ${sessionScope.dsad.tenAdmin ne ('')} && ${sessionScope.dskh.tenKhachHang eq('')} ">
	<div>
		<ul>
			<li><a href="home"> HOME</a>
			<li><a href="#">	Thông Tin Cá Nhân </a>
			<li><a href="#">	Chỉnh Sửa Thông Tin Cá Nhân</a>
			<li><a href="#">		...</a>
			<li><a href="Trang_dangxuat">			Đăng Xuất </a>
		</ul>
	</div>
</c:if>

<c:if test="  ${sessionScope.dsad.tenAdmin eq ('')} && ${ sessionScope.dskh.tenKhachHang ne ('') } ">
	<div>
		<ul>
			<li><a href="home"> HOME</a>
			<li><a href="giaodienadmin">			giaodientong</a>
			<li><a href="thongtinkhachhang#">		thông tin khach hang</a>
			<li><a href="thongtinkhachhangchitiet">	thông tin khách hàng cho tiết</a>
			<li><a href="Trang_dangxuat">			Đăng Xuất </a>
		</ul>
	</div>
</c:if>

 -->
