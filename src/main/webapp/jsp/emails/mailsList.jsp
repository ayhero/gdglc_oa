<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@include file="/base/resource.jsp" %>
<title>${title}</title>
</head>
<body>
	<div class="container">
		<div class="row">
		  <div class="col-md-12">
		  	<table class="table table-condensed  table-hover">
		  		<thead>
		  			<tr>
		  				<th>标题</th>
		  				<th>发件人</th>
		  				<th>发件时间</th>
		  			</tr>
		  		</thead>
			    <c:forEach items="${mailsList}" var="mail">
			    	<tr class="${mail.isRead==0?'success':''}">
			    		<td>${mail.userFrom}</td>
			    		<td>
			    			<a href="mail?id=${mail.id}">${mail.title}</a> 
			    		</td>
			    		<td>${mail.date}</td>
			    	</tr>
			    </c:forEach>
		    </table>
		  </div>
		</div>
	</div>
</body>
</html>






