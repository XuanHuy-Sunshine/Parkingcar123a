<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"   %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<div class="col2">
        <form name="frmcapnhatMKWEB" action="chinhMKWEB" method="post">
        <table border="0">
            <thead>
                <tr>
                    <th colspan="4">Chỉnh Sửa Mật Khẩu WEB</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>mật khẩu vào cũ : </td>
                    <td><input type="text" name="txtmkcu" value="nhập mật khẩu cũ" /></td>
                    <td>mật khẩu vào mới : </td>
                    <td><input type="text" name="txtmkmoi" value="nhập mật khẩu mới" /></td>
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