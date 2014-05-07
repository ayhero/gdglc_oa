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
	<form action="newMail" method="post"  class="form-horizontal" role="form">
	
	<div class="container">
		<div class="row">
		 	<div class="col-md-7 col-md-offset-4">
		 		<div class="form-group">
		 			<label for="mail.title" class="col-sm-3 control-label">邮件主题</label>
				    <div class="col-sm-9">
				      <input type="text" class="form-control" id="mail.title" name="mail.title" placeholder="标题">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="mail.userTo" class="col-sm-3 control-label">收件人</label>
				    <div class="col-sm-9">
				      <input type="text" class="form-control" id="mail.userTo" name="mail.userTo" placeholder="收件人">
				    </div>
				  </div>
				  <div class="form-group">
				    <div class="col-sm-9">
				      <textarea class="form-control" rows="3" id="mail.content" name="mail.content"></textarea>
				    </div>
				  </div>
				  
				  <div class="form-group">
				    <div class="col-md-4 col-md-offset-8">
				      <button type="submit" class="btn btn-primary btn-block">发送</button>
				    </div>
				  </div>
		 	</div>
		</div>
		
	</div>
	
	</form>
</body>
</html>






