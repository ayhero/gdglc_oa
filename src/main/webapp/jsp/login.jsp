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
		    <div class="row">
		    	<div class="col-md-6 col-md-offset-3 text-center">
		    		<h4>登陆页面</h4>
		    	</div>
		    </div>
		    <div class="row">
		      <div class="col-md-4">
		        
		      </div>
		      <div class="col-md-4">
		        <form class="form-horizontal" role="form">
		        		<s:fielderror cssStyle="color: red"></s:fielderror>
						  <div class="form-group">
						    <label for="user.username" class="col-sm-3 control-label">用户名</label>
						    <div class="col-sm-9">
						      <input type="text" class="form-control" id="user.username" name="user.username" placeholder="Email">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="user.password" class="col-sm-3 control-label">密码</label>
						    <div class="col-sm-9">
						      <input type="password" class="form-control" id="user.password" name="user.password" placeholder="Password">
						    </div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-2 col-sm-10">
						      <div class="checkbox">
						        <label>
						          <input type="checkbox" name="isRemember"> 记住我
						        </label>
						      </div>
						    </div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-2 col-sm-10">
						      <button type="submit" class="btn btn-default">登陆</button>
						    </div>
						  </div>
						</form>
		      </div>
		      <div class="col-md-4">
		        
		      </div>
		    </div>
		  </div>
		</div>
	</div>
</body>
</html>






