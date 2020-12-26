<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"   %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<div class="col2">
        <form name="frmdangnhap" action="Trang_dangxuat" method="post">  <!-- action hàm nơi xử lý sau khi nhấn suubmit -->
        <table border="1">
            <tbody>
            	
                <tr>
                    <td>Bạn Muốn Đăng xuất : </td>
                </tr>
                
                <tr style=" text-align: center; ">
                    <td colspan="2">
                        <input type="submit" value="Đăng Xuất" name="btndangxuat" />
                    </td>
                </tr>
            </tbody>
            </table>
            </form>

</div>
