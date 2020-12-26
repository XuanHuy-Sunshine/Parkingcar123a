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




	<div class="box1" style="width: 600px; height: 600px;">
		<c:forEach items="${dspc}" var= "pc">    
		         <div class="box2"
				        <c:if test="${pc.rfid.equals('')}">
									style="
									width: 200px;
					    			height: 200px;
									background-color: while;
									border: 9px solid black;
									padding : 1px 1px 1px 1px;
									"
						</c:if>
		         		<c:if test="${pc.rfid ne ('')}">
							style="
									width: 200px;
					    			height: 200px;
									background-color: while;
									border: 9px solid black;
									padding : 1px 1px 1px 1px;
									"
						</c:if>
		         >
		         	<p style ="padding-top: 8px; "><!-- Số ô : --><b> ${pc.soParking}</b></p>
					<p>Trạng thái : <b>${pc.trangThai }</b></p>
					
					<p>
						<c:if test="${pc.rfid.equals('')}">
							<b>            </b>
							
						</c:if>
						<c:if test="${pc.rfid ne ('')}">
							<img src="img/A2_Vin3.PNG">
						</c:if>
					</p> 
				</div>        
	    </c:forEach>
		</div>
