<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bãi Đỗ Xe</title>
<!-- liên Kết CSS -->
 <link rel="stylesheet" href="css/style_02.css">
 
</head>
<body>
<!-- BEGIN	phần thanh dấu đầu trang 1 -->
	<div class="header-area">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="user-menu1">
                    	<ul>
                            <li>Xin chào: </li>
                        </ul>
                    </div>
                    <div class="user-menu2">
                        <ul>
                            <li><a href="trang-dang-nhap.jsp"><i class="fa fa-user"></i> Đăng Nhập</a></li>
                            <li><a href="trang-dang-xuat.jsp"><i class="fa fa-user"></i> Đăng xuất</a></li>
                            <li><a href="trang-dang-Ki.jsp"><i class="fa fa-user"></i> Đăng Kí</a></li>
                        </ul>
                    </div>
                </div>
                
                <div class="col-md-4">
                    <div class="header-right">
                        <form name="frmTimSanPham" action="" method="post">
                            <input type="text" name="txtTenSanPham" value="" placeholder="Biển số xe/ số điện thoại" size="30"/>
                            <input type="submit" name="btnTim" value="Tìm"/>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End header area -->
<!-- END 	phần thanh dấu đầu trang 1-->
<!-- BEGIN 	phần thanh dấu đầu trang 2 -->   
    <div class="site-branding-area">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="logo">
                        <h1><a href="./"><img src="img/817491.jpg"></a></h1>
                    </div>
                </div>
                
                <!-- <div class="col-sm-6">
                    <div class="shopping-item">
                        <a href="cart.html">Giỏ hàng: <span class="cart-amunt">$100 đ</span> <i class="fa fa-shopping-cart"></i> <span class="product-count">5</span></a>
                    </div>
                </div> -->
            </div>
        </div>
    </div> <!-- End site branding area -->
<!-- END 	phần thanh dấu đầu trang 2 --> 
<!-- BEGIN 	phần thanh dấu đầu trang 3 --> 
    <div class="mainmenu-area">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div> 
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="trang-chu.jsp">Trang chủ</a></li>
                        <li><a href="trang-cua-hang.jsp">Cửa hàng</a></li>
                        <li><a href="trang-san-pham.jsp">Sản phẩm</a></li>
                        <li><a href="trang-gio-hang.jsp">Giỏ hàng</a></li>
                        <li><a href="trang-thanh-toan.jsp">Thanh toán</a></li>
                    </ul>
                </div>  
            </div>
        </div>
    </div> <!-- End mainmenu area -->
<!-- END 	phần thanh dấu đầu trang 3 --> 