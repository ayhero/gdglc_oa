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
		 	<div class="col-md-7 col-md-offset-4">
		 		
		 		<div class="panel-group" id="accordion">
				  <div class="panel panel-default">
				    <div class="panel-heading">
				      <h4 class="panel-title">
				        <a data-toggle="collapse" data-parent="#accordion" href="#collapseTitle">
				          	${mail.title}
				        </a>
				      </h4>
				    </div>
				    <div id="collapseTitle" class="panel-collapse collapse in">
				      <div class="panel-body">
					  	<span class="label label-default">发送人:</span>${mail.userFrom}
					  	<span class="label label-default">日&nbsp;&nbsp;&nbsp;&nbsp;期:</span>${mail.date}
				      </div>
				    </div>
				  </div>
				</div>
		 		
		 	</div>
		</div>
		<div class="row">
		 	<div class="col-md-7 col-md-offset-4">
		 		<div class="panel panel-default">
				  <div class="panel-body">
				    ${mail.content}
				  </div>
				</div>
		 	</div>
		</div>
		
	</div>
</body>
</html>






