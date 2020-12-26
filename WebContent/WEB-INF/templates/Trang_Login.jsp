<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"   %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<div class="col2">
        <form name="frmdangnhap" action="Trang_Login" method="post">  <!-- action hàm nơi xử lý sau khi nhấn suubmit -->
        <table border="0">
            <tbody>
            	<tr>
                    <td><select name="cboLoai">
                          	<option value="0">User</option>
                          	<option value="1">Admin</option>
                        </select></td>
                </tr>
                <tr>
                    <td>Số Điện Thoại: </td>
                    <td><input type="text" name="sdt" value="nhap sdt" /></td>
                </tr>
                <tr>
                    <td>Mật Khẩu : </td>
                    <td><input type="text" name="matkhau" value="nhập mk" /></td>
                </tr>
                
                <tr style=" text-align: center; ">
                    <td > <!-- colspan="2" -->
                        <input type="submit" value="Đăng Nhập" name="btndangnhap" />
                    </td>
                </tr>
            </tbody>
            </table>
            </form>
            
            
            
            <!-- hộp thoại cảnh báo -->
        <div>  
		<dialog id="myFirstDialog" style="width:50%;background-color:#F4FFEF;border:1px dotted black;">  
		<p><q>Tên Đăng Nhập OR Mật Khẩu Sai   
		</q> - <cite></cite></p>  
		<button id="hide">Close</button>  
		</dialog>  
		<button id="show">Show Dialog</button>  
		</div>  
		  
		<!-- JavaScript to provide the "Show/Close" functionality -->  
		<script type="text/JavaScript">  
		(function() {    
		    var dialog = document.getElementById('myFirstDialog');    
		    document.getElementById('show').onclick = function() {    
		        dialog.show();    
		    };    
		    document.getElementById('hide').onclick = function() {    
		        dialog.close();    
		    };    
		})();   
		</script>  
           


</div>
