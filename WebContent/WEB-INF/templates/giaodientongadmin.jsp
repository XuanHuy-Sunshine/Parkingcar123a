<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%-- TDA_03_Trang_Hien_Thi_Tong.jsp --%>

<style>
	*{
		padding:0;
		margin:0;
		box-sizing:border-box;
	}
	.box1{
		display:flex;
		flex-flow: row wrap;
	}
	.box2{
		width:180px;
		height:200px;
		border:1px solid gray;
		text-align:center;
		
	}
	img{
		width:100px;
		height:120px;
	}
	
</style>



<div class="box1">
		<c:forEach items="${dspc}" var= "pc">    
		         <div class="box2"
				        <c:if test="${pc.rfid.equals('')}">
									style="
									width: 200px;
					    			height: 200px;
									background-color:lime;
									-moz-border-radius: 100px;
								    -webkit-border-radius: 100px;
								    --border-radius: 100px;
								    border-radius: 100px;
								    -moz-box-shadow: 10px 10px 20px 0px #666;
								    -webkit-box-shadow: 10px 10px 20px 0px #666;
								    box-shadow: 10px 10px 20px 0px #666;
									"
						</c:if>
		         		<c:if test="${pc.rfid ne ('')}">
							style="
									width: 200px;
					    			height: 200px;
									background-color:red;
									-moz-border-radius: 100px;
								    -webkit-border-radius: 100px;
								    --border-radius: 100px;
								    border-radius: 100px;
								    -moz-box-shadow: 10px 10px 20px 0px #666;
								    -webkit-box-shadow: 10px 10px 20px 0px #666;
								    box-shadow: 10px 10px 20px 0px #666;
									"
						</c:if>
		         >
		         	<p>Số ô :${pc.soParking}</p>
		         	<p>họ tên  :${pc.soParking}</p>
		         	<p>số phòng :${pc.soParking} </p>
					<p>Trạng thái : <b>${pc.trangThai }</b></p>
					
					<p>mã thẻ : ${pc.rfid} 
						<c:if test="${pc.rfid.equals('')}">
							<b>            </b>
							
						</c:if>
						<c:if test="${pc.rfid ne ('')}">
							<input type="submit" value="lấy ra" name="btnLayRa"/>
						</c:if>
					</p> 
				</div>        
	    </c:forEach>
		</div>